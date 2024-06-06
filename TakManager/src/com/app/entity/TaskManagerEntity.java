package com.app.entity;

import java.time.LocalDate;

public class TaskManagerEntity {
//taskId, taskName, description, taskDate, status, active
	private int id;
	private String taskName;
	private String description;
	private LocalDate taskDate;
	private taskStatus status;
	private boolean active;
	private static int count=100;
	
	public TaskManagerEntity(String taskName, String description, LocalDate taskDate,taskStatus status, boolean active) {
		super();
		this.id=++count;
		this.taskName = taskName;
		this.description = description;
		this.taskDate = taskDate;
		this.status=status;
		this.active = active;
		
	}

	public String getTaskName() {
		return taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LocalDate getTaskDate() {
		return taskDate;
	}

	public void setTaskDate(LocalDate taskDate) {
		this.taskDate = taskDate;
	}

	public taskStatus getStatus() {
		return status;
	}

	public void setStatus(taskStatus status) {
		this.status = status;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public int getCount() {
		return count;
	}

	

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "TaskManagerEntity [id=" + id + ", taskName=" + taskName + ", description=" + description + ", taskDate="
				+ taskDate + ", status=" + status + ", active=" + active + "]";
	}
	
	
	
	
	
}
