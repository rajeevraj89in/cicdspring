package com.simplilearn.cicdspring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class AppController {
	
	@GetMapping
	public String getName() {
		// Test Comment
		return "Welcome to simplilearn project on CI/CD spring boot project.";
	}

}
