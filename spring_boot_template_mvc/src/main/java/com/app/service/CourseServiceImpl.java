package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.entity.Courses;
import com.app.repository.CourseRepository;

@Service
public class CourseServiceImpl implements CourseService{
	@Autowired
    private CourseRepository courseRepository;

	
	 @Override
	    public Courses saveCourse(Courses course) {
	        return courseRepository.save(course);
	    }
	 @Override
	    public List<Courses> getAllCourse() {
	        return courseRepository.findAll();
	    }
}
