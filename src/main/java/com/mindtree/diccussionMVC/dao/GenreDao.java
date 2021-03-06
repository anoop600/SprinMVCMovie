package com.mindtree.diccussionMVC.dao;

import java.util.List;

import com.mindtree.diccussionMVC.entity.Genre;
import com.mindtree.diccussionMVC.exception.dao.DaoException;

public interface GenreDao {
	public void addGenre(Genre genre) throws DaoException;

	public List<Genre> getAllGenre() throws DaoException;
}
