package com.app.validations;

import java.time.LocalDate;
import java.util.List;

import com.app.entity.TaskManagerEntity;
import com.app.entity.taskStatus;

public class Validations {

	public static TaskManagerEntity validateDate(String taskName, String description, String taskDate, String status,
			boolean active, List<TaskManagerEntity> list) {
		LocalDate date = LocalDate.parse(taskDate);
		
		taskStatus status1 = taskStatus.valueOf(status.toUpperCase());
		if (status1 == taskStatus.PENDING) {
			active = true;
		}

		return new TaskManagerEntity(taskName, description, date, status1, active);

	}

}
