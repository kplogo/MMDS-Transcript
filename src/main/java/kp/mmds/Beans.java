package kp.mmds;

import kp.mmds.service.*;

/**
 * Created by Krzysztof on 22.10.2015.
 */
public class Beans {
	private static AuthorService authorService;
	private static SongService songService;
	private static UserService userService;
	private static DayService dayService;
	private static TimeService timeService;
	private static LogService logService;

	public static AuthorService getAuthorService() {
		if (authorService == null) {
			authorService = new AuthorService();
		}
		return authorService;
	}

	public static SongService getSongService() {
		if (songService == null) {
			songService = new SongService();
		}
		return songService;
	}

	public static UserService getUserService() {
		if (userService == null) {
			userService = new UserService();
		}
		return userService;
	}

	public static DayService getDayService() {
		if (dayService == null) {
			dayService = new DayService();
		}
		return dayService;
	}

	public static TimeService getTimeService() {
		if (timeService == null) {
			timeService = new TimeService();
		}
		return timeService;
	}

	public static LogService getLogService() {
		if (logService == null) {
			logService = new LogService();
		}
		return logService;
	}
}
