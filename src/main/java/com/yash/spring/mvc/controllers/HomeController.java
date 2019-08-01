package com.yash.spring.mvc.controllers;

import javax.validation.ValidationException;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.yash.spring.mvc.dtos.StudentDetailsDto;

@Controller
@RequestMapping("/home")
public class HomeController {

	@GetMapping("/hello")
	public ModelAndView sayHello(){
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("hello");
		return modelAndView;
	}
}

