package kp.mmds.model;

/**
 * Created by Krzysztof on 22.10.2015.
 */
public class Song {
	private int id;
	private Author author;

	private String title;
	private String oldSongId;

	public Song(int id) {
		this.id = id;
	}

	public void fillData(Author author, String title, String oldSongId) {
		this.author = author;
		this.title = title;
		this.oldSongId = oldSongId;
	}

	public int getId() {
		return id;
	}

	public Author getAuthor() {
		return author;
	}

	public String getTitle() {
		return title;
	}

	public String getOldSongId() {
		return oldSongId;
	}


	@Override
	public String toString() {
		return "Song{" +
				"id=" + id +
				", author=" + author +
				", title='" + title + '\'' +
				", oldSongId='" + oldSongId + '\'' +
				'}';
	}
}
