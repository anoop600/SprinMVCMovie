package com.mindtree.diccussionMVC.dao;

import java.util.List;

import com.mindtree.diccussionMVC.entity.Movie;
import com.mindtree.diccussionMVC.exception.dao.DaoException;

public interface MovieDao {
	public void addMovie(Movie movie) throws DaoException;

	public List<Movie> getAllMovie() throws DaoException;

	public void updateBoxOffice(Movie movie) throws DaoException;
}
