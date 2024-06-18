package com.app.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@Getter@Setter
@AllArgsConstructor
public class Student {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int sid;
	private String firstname ;
	private String lastname ; 
	private String email ;
	private int courseId;
	private int score ;
	
	
	
	
	
	
}
