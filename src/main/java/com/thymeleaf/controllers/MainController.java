package com.thymeleaf.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {

	// method for get about page
	@RequestMapping(path = "/about", method = RequestMethod.GET)
	public String about(Model model) {

		model.addAttribute("name", "Tuhin Kumar");

		System.out.println("This is about handler...!");

		return "about";
		// about.html
	}
}
