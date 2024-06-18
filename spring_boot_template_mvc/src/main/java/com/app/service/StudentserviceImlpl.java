package com.app.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.entity.Student;
import com.app.repository.StudentRepositiry;
@Service
public class StudentserviceImlpl implements Studentservice{
	
	@Autowired
    private StudentRepositiry studentRepository;

	
	 @Override
	    public Student saveStudent(Student student) {
	        return studentRepository.save(student);
	    }
	 @Override
	    public List<Student> getAllStudents() {
	        return studentRepository.findAll();
	    }

}
