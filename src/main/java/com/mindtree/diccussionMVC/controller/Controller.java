package com.mindtree.diccussionMVC.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.mindtree.diccussionMVC.entity.Actor;
import com.mindtree.diccussionMVC.entity.Genre;
import com.mindtree.diccussionMVC.entity.Movie;
import com.mindtree.diccussionMVC.exception.service.ServiceException;
import com.mindtree.diccussionMVC.service.ActorService;
import com.mindtree.diccussionMVC.service.GenreService;
import com.mindtree.diccussionMVC.service.MovieService;
import com.mindtree.diccussionMVC.service.serviceImpl.ActorServiceImpl;
import com.mindtree.diccussionMVC.service.serviceImpl.GenreServiceImpl;
import com.mindtree.diccussionMVC.service.serviceImpl.MovieServiceImpl;

@RestController
public class Controller {

	@Autowired
	ActorService actorService;

	@Autowired
	GenreService genreService;

	@Autowired
	MovieService movieService;

	@RequestMapping("/index")
	public ModelAndView indexPage() {
		return new ModelAndView("index", "message", "");
	}

	@RequestMapping("/addActor1")
	public ModelAndView addEmployeePage() {
		return new ModelAndView("addActor", "message", "");
	}

	@RequestMapping(value = "/addActor", method = RequestMethod.POST)
	public ModelAndView addEmployee(@ModelAttribute("actor") @Validated Actor actor, BindingResult bindingResult,
			Model model) {
		if (bindingResult.hasErrors()) {
			return new ModelAndView("index", "message", "Unsuccessfull");
		}

		System.out.println(actor);
		try {
			actorService.AddActor(actor);
		} catch (ServiceException e) {
			System.out.println(e.getMessage());
		}
		return new ModelAndView("index", "message", "Added Successfully");
	}

	@RequestMapping("/getAllActorDetails1")
	public ModelAndView getActorPage() {
		List<Actor> e = null;
		try {
			e = actorService.ShowAllActor();
			System.out.println(e);
			return new ModelAndView("getAllActorDetails", "message", e);
		} catch (ServiceException e1) {
			// TODO Auto-generated catch block
			System.out.println(e1.getMessage());
		}
		return null;
	}

	@RequestMapping("/addGenre1")
	public ModelAndView addGenrePage() {
		return new ModelAndView("addGenre", "message", "");
	}

	@RequestMapping("/addGenre")
	public ModelAndView addGenre(@ModelAttribute("genre") @Validated Genre genre, BindingResult bindingResult,
			Model model) {
		if (bindingResult.hasErrors()) {
			return new ModelAndView("index", "message", "Unsuccessfull");
		}

		System.out.println(genre);
		try {
			genreService.addGenre(genre);
		} catch (ServiceException e) {
			System.out.println(e.getMessage());
		}
		return new ModelAndView("index", "message", "Added Successfully");
	}

	@RequestMapping("/getAllGenre1")
	public ModelAndView getGenrePage() {
		List<Genre> e = null;
		try {
			e = genreService.getAllGenre();
			System.out.println(e);
			return new ModelAndView("getAllGenreDetails", "message", e);

		} catch (ServiceException e1) {
			// TODO Auto-generated catch block
			System.out.println(e1.getMessage());
		}
		return null;
	}

	@RequestMapping("/addMovie1")
	public ModelAndView addMoviePage() {
		return new ModelAndView("addMovie", "message", "");
	}

	@RequestMapping("/addMovie")
	public ModelAndView addMovie(@ModelAttribute("genre") @Validated Movie movie, BindingResult bindingResult,
			Model model) {
		if (bindingResult.hasErrors()) {
			return new ModelAndView("index", "message", "Unsuccessfull");
		}

		System.out.println(movie);
		try {
			movieService.addMovie(movie);
		} catch (ServiceException e) {
			System.out.println(e.getMessage());
		}
		return new ModelAndView("index", "message", "Added Successfully");
	}

	@RequestMapping("/getAllMovieDetails1")
	public ModelAndView getMoviePage() {
		List<Movie> e = null;
		try {
			e = movieService.getAllMovie();
			System.out.println(e);
			return new ModelAndView("getAllMovieDetails", "message", e);
		} catch (ServiceException e1) {
			// TODO Auto-generated catch block
			System.out.println(e1.getMessage());
			return null;
		}

	}

	@RequestMapping("/updateBox")
	public ModelAndView updateBoxoffice() {
		return new ModelAndView("updateBox", "message", "");
	}

	@RequestMapping("/updateBoxOffice")
	public ModelAndView updateBox(@ModelAttribute("genre") @Validated Movie movie, BindingResult bindingResult,
			Model model) {
		if (bindingResult.hasErrors()) {
			return new ModelAndView("index", "message", "Update Unsuccessfull");
		}

		try {
			movieService.updateBoxOffice(movie);
		} catch (ServiceException e) {
			System.out.println(e.getMessage());
		}
		return new ModelAndView("index", "message", "Updated Successfully");
	}

}
