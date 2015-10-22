package kp.mmds.model;

import java.util.Calendar;

/**
 * Created by Krzysztof on 22.10.2015.
 */
public class Day {
	private int id;
	private int year;
	private int month;
	private int day;

	public Day(int id) {
		this.id = id;
	}

	public void fillData(Calendar calendar) {
		year = calendar.get(Calendar.YEAR);
		month = calendar.get(Calendar.MONTH);
		day = calendar.get(Calendar.DATE);
	}

	public static String getHash(Calendar calendar) {
		return calendar.get(Calendar.YEAR) + "_" + calendar.get(Calendar.MONTH) + "_" + calendar.get(Calendar.DATE);
	}
}
