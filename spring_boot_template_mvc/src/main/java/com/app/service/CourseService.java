package com.app.service;

import java.util.List;

import com.app.entity.Courses;

public interface CourseService  {

	public Courses saveCourse(Courses course);

	public List<Courses> getAllCourse();


}
