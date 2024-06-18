package com.app.contoller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.entity.Student;
import com.app.service.Studentservice;


	@RestController
	@RequestMapping("/student")
	
	public class StudentController {
	    @Autowired
	    private Studentservice studentService;

	    @PostMapping("/add")
	    public String add(@RequestBody Student student){
	        studentService.saveStudent(student);
	        return "New student is added";
	    }

	    @GetMapping("/getAll")
	    public List<Student> list(){
	        return studentService.getAllStudents();
	    }
	}
