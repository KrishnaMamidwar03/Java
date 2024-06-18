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

public class Courses {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int cid;
	private String title;
	private String start_date;
	private String end_date;
	private double fees;
	private int min_score;

	

}
