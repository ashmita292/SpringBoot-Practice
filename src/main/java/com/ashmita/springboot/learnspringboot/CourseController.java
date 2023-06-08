package com.ashmita.springboot.learnspringboot;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
	
	@RequestMapping("/courses")
	public List<Course>retreiveAllCourses(){
		return Arrays.asList(
				new Course(1, "Learn AWS", "ashmita"),
				new Course(2, "Learn Devops", "ashmita"),
				new Course(3, "Learn Azure","ashmita")
				);
	}

}
