package kp.mmds.service;

import java.util.HashMap;
import java.util.Map;

public abstract class Service<T> {
	private Map<String, T> list = new HashMap<>();
	private int lastId = 0;

	protected int getLastId() {
		return lastId++;
	}

	public T getOrCreate(String name) {
		T user = list.get(name);
		if (user == null) {
			user = createItem();
			list.put(name, user);
		}
		return user;
	}

	public T get(String name) {
		return list.get(name);
	}

	protected abstract T createItem();

	public int getSize() {
		return list.size();
	}
}
