package com.mindtree.diccussionMVC.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mindtree.diccussionMVC.dao.GenreDao;
import com.mindtree.diccussionMVC.entity.Genre;
import com.mindtree.diccussionMVC.exception.dao.DaoException;
import com.mindtree.diccussionMVC.exception.service.ServiceException;
import com.mindtree.diccussionMVC.service.GenreService;

@Component
@Repository
public class GenreServiceImpl implements GenreService {

	@Autowired
	GenreDao genreDao;

	@Transactional
	public void addGenre(Genre genre) throws ServiceException {
		try {
			genreDao.addGenre(genre);
		} catch (DaoException e) {
			throw new ServiceException("Genre Cannot be added in Service", e);
		}

	}

	public List<Genre> getAllGenre() throws ServiceException {
		try {
			return genreDao.getAllGenre();
		} catch (DaoException e) {
			throw new ServiceException("Cannot load all genre in service", e);
		}
	}

}
