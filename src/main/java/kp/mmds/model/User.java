package kp.mmds.model;

public class User {
	private int id;
	private String name;

	public void fillData(String name) {
		this.name = name;
	}

	public User(int id) {
		this.id = id;

	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}
}
