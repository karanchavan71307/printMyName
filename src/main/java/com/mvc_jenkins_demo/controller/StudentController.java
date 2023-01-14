package com.mvc_jenkins_demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import ch.qos.logback.core.model.Model;

@Controller
public class StudentController {

	
	private static final Logger log = LoggerFactory.getLogger(StudentController.class);

	@GetMapping("/getName")
	public String getName( ) {
		
		return "home";
		
	}
	
}
