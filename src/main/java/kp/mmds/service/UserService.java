package kp.mmds.service;

import kp.mmds.model.User;

public class UserService extends Service<User> {
	@Override
	protected User createItem() {
		return new User(getLastId());
	}
}
