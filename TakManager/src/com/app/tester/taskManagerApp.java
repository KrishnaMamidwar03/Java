package com.app.tester;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import com.app.entity.TaskManagerEntity;
import com.app.entity.taskStatus;
import com.app.validations.DateComparator;
import com.app.validations.DisplayPending;
import com.app.validations.TaskAvailability;
import com.app.validations.Validations;

public class taskManagerApp {

	public static void main(String[] args) throws Exception {

		try (Scanner scan = new Scanner(System.in)) {
			boolean exit = false;
			List<TaskManagerEntity> list = new ArrayList<>();

			while (!exit) {
				System.out.println("MENU :");
				System.out.println("1. Add New Task \r\n" + "2. Delete a task \r\n" + "3. Update task status \r\n"
						+ "4. Display all pending tasks \r\n" + "5. Display all pending tasks for today \r\n"
						+ "6.  Display all tasks sorted by taskDate \r\n" + "7.list all task \r\n" + "0. exit");
				System.out.println("enter your choice ");
				int choice = scan.nextInt();
				
				try {
				switch (choice) {
				case 1:
					System.out.println("enter details \n" + "taskName, description, taskDate, status, active");
					TaskManagerEntity t = Validations.validateDate(scan.next(), scan.next(), scan.next(), scan.next(),
							exit, list);
					list.add(t);
					System.out.println("Task Added");
					break;

				case 2:
					System.out.println("enter task id to delete");
					t = TaskAvailability.taskAvailability(scan.nextInt(), list);
					list.remove(t);
					System.out.println("task with id  deleted successfully");
					break;

				case 3:
					System.out.println("enter task id to update");
					t = TaskAvailability.taskAvailability(scan.nextInt(), list);
					String newStatus = scan.next().toUpperCase();
					taskStatus stat = taskStatus.valueOf(newStatus);
					t.setStatus(stat);
					System.out.println("task added succesfully");
					break;

				case 4:
//					System.out.println( DisplayPending.displayPending(list));
					List<TaskManagerEntity> l = DisplayPending.displayPending(list);
					l.stream().forEach(p -> System.out.println(p));
					break;

				case 5:
					System.out.println( DisplayPending.displayPending(list));
//					l.stream().forEach(p -> System.out.println(p));
					break;
					
				case 6:
					DateComparator date = new DateComparator();
					Collections.sort(list,date);
//					list.stream().forEach(l->System.out.println(l));
					
					break;

				case 7:
					list.stream().forEach((a) -> System.out.println(a));
					break;

				case 0:
					System.out.println("EXIT from program");
					exit = true;
					break;
				}
				}catch(Exception e) {
					System.out.println(e.getMessage());
				}
			}
		}

	}

}
