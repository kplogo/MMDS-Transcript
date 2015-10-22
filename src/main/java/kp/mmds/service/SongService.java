package kp.mmds.service;

import kp.mmds.model.Song;

/**
 * Created by Krzysztof on 22.10.2015.
 */
public class SongService extends Service<Song> {

	@Override
	protected Song createItem() {
		return new Song(getLastId());
	}

}
