package com.app.validations;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.app.entity.TaskManagerEntity;
import com.app.entity.taskStatus;
import com.app.exception.taskException;

public class DisplayPending {
	//all pending tasks
	public static List<TaskManagerEntity> displayPending(List<TaskManagerEntity> list) throws taskException {
		List<TaskManagerEntity> l=new ArrayList<>();

		for(TaskManagerEntity t:list) {
			if(t.getStatus().equals(taskStatus.PENDING)) {
				l.add(t);
			}
		}
		return l;
	}
	//today's pending task
	public static List<TaskManagerEntity> todayPending(List<TaskManagerEntity>list)throws taskException{
		List<TaskManagerEntity> l=new ArrayList<>();
		LocalDate today = LocalDate.now();
		
		
		for(TaskManagerEntity t: list) {
			boolean a =t.getTaskDate().equals(today);
			boolean b =t.getStatus().equals(taskStatus.PENDING);
			if(a && b) {
				l.add(t);
			}
		}
		return l;
	}
}
