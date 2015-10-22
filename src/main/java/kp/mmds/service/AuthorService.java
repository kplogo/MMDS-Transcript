package kp.mmds.service;

import kp.mmds.model.Author;

import java.util.HashMap;
import java.util.Map;

public class AuthorService extends Service<Author> {
	@Override
	protected Author createItem() {
		return new Author(getLastId());
	}
}
