package kp.mmds.importer;

import kp.mmds.Beans;
import kp.mmds.model.Author;
import kp.mmds.model.Song;
import kp.mmds.service.AuthorService;
import kp.mmds.service.SongService;

public class TrackImport extends DataType {

	private AuthorService authorService = Beans.getAuthorService();
	private SongService songService = Beans.getSongService();

	@Override
	public void processLine(String line) {
		String[] fields = line.split("<SEP>");
		Author author = authorService.getOrCreate(get(fields, 2));
		author.fillData(get(fields, 2));
		Song song = songService.getOrCreate(get(fields, 1));
		song.fillData(author, get(fields, 3), get(fields, 1));
		//id_wyk -> fields[0];
		//id_utw -> fields[1];
		//nazwa_artysty -> fields[2];
		//tytul -> fields[3];
	}
}
