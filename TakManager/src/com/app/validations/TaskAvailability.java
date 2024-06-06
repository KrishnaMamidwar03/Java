package com.app.validations;

import java.util.List;

import com.app.entity.TaskManagerEntity;
import com.app.exception.taskException;

public class TaskAvailability {
	public static TaskManagerEntity taskAvailability(int id, List<TaskManagerEntity> list) throws taskException {
		for(TaskManagerEntity t: list) {
			if(t.getId()==id) {
				return t;
			}
		}
		throw new taskException("task with id "+id+" not found!");
	}
}




