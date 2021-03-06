package com.mindtree.diccussionMVC.dao.daoImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.mindtree.diccussionMVC.dao.MovieDao;
import com.mindtree.diccussionMVC.entity.Movie;
import com.mindtree.diccussionMVC.exception.dao.DaoException;

@Repository
public class MovieDaoImpl implements MovieDao {

	@Autowired
	HibernateTemplate hibernateTemplate;

	public void addMovie(Movie movie) throws DaoException {
		try {
			hibernateTemplate.save(movie);
		} catch (DataAccessException e) {
			throw new DaoException("Movie cannot be added in DAO", e);
		}
	}

	public List<Movie> getAllMovie() throws DaoException {
		try {
			//return hibernateTemplate.loadAll(Movie.class);
			List<Movie> list = hibernateTemplate.loadAll(Movie.class);
			
			//Comparator
			Comparator<Movie> comp = new Comparator<Movie>() {

				@Override
				public int compare(Movie arg0, Movie arg1) {
					Long arg = arg0.getBoxoffice();
					return arg.compareTo(arg1.getBoxoffice()) * -1;
				}
			};
			Collections.sort(list, comp);
			return list;
		} catch (DataAccessException e) {
			throw new DaoException("Movie list cannot be obtained", e);
		}
	}

	public Movie getMovie(int id) {
		return hibernateTemplate.get(Movie.class, id);
	}

	@Override
	public void updateBoxOffice(Movie movie) throws DaoException {
		try {
			hibernateTemplate.update(movie);
			Movie entity = (Movie) hibernateTemplate.find("from Movie where id=?", movie.getId());
			entity.setBoxoffice(movie.getBoxoffice());
			hibernateTemplate.saveOrUpdate(entity); 
		} catch (DataAccessException e) {
			throw new DaoException("Update not successfull", e);
		}

	}

}
