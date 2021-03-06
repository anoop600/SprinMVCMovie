package com.mindtree.diccussionMVC.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mindtree.diccussionMVC.entity.Actor;
import com.mindtree.diccussionMVC.exception.service.ServiceException;
@Service
public interface ActorService {
	public void AddActor(Actor actor) throws ServiceException;

	public List<Actor> ShowAllActor() throws ServiceException;

}
