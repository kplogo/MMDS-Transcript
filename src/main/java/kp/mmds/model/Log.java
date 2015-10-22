package kp.mmds.model;

import java.util.Date;

public class Log {
	private int id;
	private Song song;
	private User user;
	private Day day;
	private Time time;
	private Date date;
	private Author author;

	public void fillData(Song song, User user, Day day, Time time, Date date, Author author) {
		this.song = song;
		this.user = user;
		this.day = day;
		this.time = time;
		this.date = date;
		this.author = author;
	}

	public Log(int id) {
		this.id = id;

	}

	public int getId() {
		return id;
	}

}
