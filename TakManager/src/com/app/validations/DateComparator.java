package com.app.validations;

import java.util.Comparator;

import com.app.entity.TaskManagerEntity;

public class DateComparator implements Comparator<TaskManagerEntity>{
	
	@Override
	public int compare(TaskManagerEntity d1, TaskManagerEntity d2) {
		return d1.getTaskDate().compareTo(d2.getTaskDate());
	}

}
