package kp.mmds.service;

import kp.mmds.model.Day;

public class DayService extends Service<Day> {
	@Override
	protected Day createItem() {
		return new Day(getLastId());
	}
}
