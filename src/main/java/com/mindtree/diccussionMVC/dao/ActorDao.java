package com.mindtree.diccussionMVC.dao;

import java.util.List;

import com.mindtree.diccussionMVC.entity.Actor;
import com.mindtree.diccussionMVC.exception.dao.DaoException;

public interface ActorDao {
	public void AddActor(Actor actor) throws DaoException;

	public List<Actor> ShowAllActor() throws DaoException;

}
