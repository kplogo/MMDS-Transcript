package kp.mmds.model;

import java.util.Calendar;

/**
 * Created by Krzysztof on 22.10.2015.
 */
public class Time {
	private int id;
	private int hour;
	private int minute;

	public Time(int id) {
		this.id = id;
	}

	public void fillData(Calendar calendar) {
		hour = calendar.get(Calendar.HOUR_OF_DAY);
		minute = calendar.get(Calendar.MINUTE);
	}

	public static String getHash(Calendar calendar) {
		return calendar.get(Calendar.HOUR_OF_DAY) + "_" + calendar.get(Calendar.MINUTE);
	}
}
