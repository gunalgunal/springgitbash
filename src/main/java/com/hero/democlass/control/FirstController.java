package com.hero.democlass.control;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {
	
	@GetMapping("/courses")
	public List<Course> method()
	{
		return Arrays.asList(new Course(1,"gunal"));
	}

}
