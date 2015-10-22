package kp.mmds.model;

public class Author {
	private int id;
	private String name;

	public void fillData(String name) {
		this.name = name;
	}

	public Author(int id) {
		this.id = id;

	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}
}
