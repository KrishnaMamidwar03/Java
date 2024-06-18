package com.app.service;

import java.util.List;

import com.app.entity.Student;

public interface Studentservice {
	public Student saveStudent(Student student);

	public List<Student> getAllStudents();
       
}
