package com.mindtree.diccussionMVC.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mindtree.diccussionMVC.entity.Genre;
import com.mindtree.diccussionMVC.exception.service.ServiceException;
@Service
public interface GenreService {
	public void addGenre(Genre genre) throws ServiceException;

	public List<Genre> getAllGenre() throws ServiceException;
}
