package com.thymeleaf.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.thymeleaf.entities.LoginData;

import jakarta.validation.Valid;

@Controller
public class FormController {

	// handler for open form page
	@GetMapping("/form")
	public String openForm(Model m) {

		m.addAttribute("loginData", new LoginData());

		return "form";
	}

	// method for submit form data
	// @Valid - used to trigger validation
	// BindingResult - store the errors during validation
	@PostMapping("/process")
	public String submitForm(@Valid @ModelAttribute("loginData") LoginData data, BindingResult result, Model m) {

		System.out.println(data);

		// checking for error occurred or not
		if (result.hasErrors()) {

			System.out.println(result);

			return "form";
		}

		m.addAttribute("data", data);

		return "success";
	}
}
