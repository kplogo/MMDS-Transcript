package kp.mmds.service;


import kp.mmds.model.Log;

import java.util.LinkedList;
import java.util.List;

public class LogService {
	private List<Log> list = new LinkedList<>();
	private int lastId = 0;

	protected int getLastId() {
		return lastId++;
	}

	public Log create() {
		Log log = new Log(getLastId());
		list.add(log);
		return log;
	}

	public int getSize() {
		return list.size();
	}
}
