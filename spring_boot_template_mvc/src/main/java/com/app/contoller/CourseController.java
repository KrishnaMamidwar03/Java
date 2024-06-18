package com.app.contoller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.entity.Courses;
import com.app.service.CourseService;


	@RestController
	@RequestMapping("/course")
	
	public class CourseController {
	    @Autowired
	    private CourseService coursesService;

	    @PostMapping("/add")
	    public String add(@RequestBody Courses courses){
	        coursesService.saveCourse(courses);
	        return "New student is added";
	    }

	    @GetMapping("/getAll")
	    public List<Courses> list(){
	        return coursesService.getAllCourse();
	    }
	}


