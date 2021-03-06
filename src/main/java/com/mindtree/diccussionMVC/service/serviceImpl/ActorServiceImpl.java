package com.mindtree.diccussionMVC.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.mindtree.diccussionMVC.dao.ActorDao;
import com.mindtree.diccussionMVC.entity.Actor;
import com.mindtree.diccussionMVC.exception.dao.DaoException;
import com.mindtree.diccussionMVC.exception.service.ServiceException;
import com.mindtree.diccussionMVC.service.ActorService;

@Component
@Repository
public class ActorServiceImpl implements ActorService {
	@Autowired
	ActorDao actorDao;

	@Transactional
	public void AddActor(Actor actor) throws ServiceException {
		try {
			actorDao.AddActor(actor);
		} catch (DaoException e) {
			throw new ServiceException("Service layer add Actor exception ", e);
		}
	}

	public List<Actor> ShowAllActor() throws ServiceException {
		try {
			return actorDao.ShowAllActor();
		} catch (DaoException e) {
			throw new ServiceException("Service layer get all Actor exception", e);
		}
	}

}
