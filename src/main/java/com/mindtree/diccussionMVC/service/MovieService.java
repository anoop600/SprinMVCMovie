package com.mindtree.diccussionMVC.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mindtree.diccussionMVC.entity.Movie;
import com.mindtree.diccussionMVC.exception.dao.DaoException;
import com.mindtree.diccussionMVC.exception.service.ServiceException;

@Service
public interface MovieService {
	public void addMovie(Movie movie) throws ServiceException;

	public List<Movie> getAllMovie() throws ServiceException;

	public void updateBoxOffice(Movie movie) throws ServiceException;
}
