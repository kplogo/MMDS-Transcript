package kp.mmds.importer;

import kp.mmds.Beans;
import kp.mmds.model.*;
import kp.mmds.service.*;

import java.util.Calendar;

public class LogImport extends DataType {

	private UserService userService = Beans.getUserService();
	private DayService dayService = Beans.getDayService();
	private TimeService timeService = Beans.getTimeService();
	private LogService logService = Beans.getLogService();
	private SongService songService = Beans.getSongService();

	@Override
	public void processLine(String line) {
		String[] fields = line.split("<SEP>");
		User user = userService.getOrCreate(get(fields, 0));
		user.fillData(get(fields, 0));
		Calendar calendar = Calendar.getInstance();
		calendar.setTimeInMillis(Integer.parseInt(get(fields, 2)));
		Day day = dayService.getOrCreate(Day.getHash(calendar));
		day.fillData(calendar);
		Time time = timeService.getOrCreate(Time.getHash(calendar));
		time.fillData(calendar);
		Log log = logService.create();
		Song song = songService.get(fields[1]);
		log.fillData(song, user, day, time, calendar.getTime(), song.getAuthor());
		//user -> fields[0];
		//id_utw -> fields[1];
		//datetime -> fields[2];
	}
}
