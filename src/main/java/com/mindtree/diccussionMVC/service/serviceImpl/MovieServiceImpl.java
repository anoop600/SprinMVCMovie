package com.mindtree.diccussionMVC.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.mindtree.diccussionMVC.dao.MovieDao;
import com.mindtree.diccussionMVC.entity.Movie;
import com.mindtree.diccussionMVC.exception.dao.DaoException;
import com.mindtree.diccussionMVC.exception.service.ServiceException;
import com.mindtree.diccussionMVC.service.MovieService;

@Component
@Repository
public class MovieServiceImpl implements MovieService {

	@Autowired
	MovieDao movieDao;

	@Transactional
	public void addMovie(Movie movie) throws ServiceException {
		try {
			movieDao.addMovie(movie);
		} catch (DaoException e) {
			throw new ServiceException("Movie cannot be added in Service", e);
		}

	}

	public List<Movie> getAllMovie() throws ServiceException {
		try {
			return movieDao.getAllMovie();
		} catch (DaoException e) {
			throw new ServiceException("Movie list exception in service", e);
		}
	}

	@Override
	public void updateBoxOffice(Movie movie) throws ServiceException {
		try {
			System.out.println("hiiiiiiiiiiiiiiiii" + movie);
			
			movieDao.updateBoxOffice(movie);
		} catch (DaoException e) {
			throw new ServiceException("Update error in Service", e);
		}

	}

}
