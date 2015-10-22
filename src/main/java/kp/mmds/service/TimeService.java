package kp.mmds.service;

import kp.mmds.model.Time;

public class TimeService extends Service<Time> {
	@Override
	protected Time createItem() {
		return new Time(getLastId());
	}
}
