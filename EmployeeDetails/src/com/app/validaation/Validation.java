package com.app.validaation;

import java.time.LocalDate;
import java.util.List;

import com.app.Entity.Application;
import com.app.Entity.EmployeeEntity;
import com.app.exception.EmployeeException;

public class Validation {

	//validate date of joining 
	public static EmployeeEntity checkValidation(Application fte, String name, String joiningDate, int phoneNum,
			int aadharNum, List<EmployeeEntity> list) {
		LocalDate date = LocalDate.parse(joiningDate);
		return new EmployeeEntity(fte, name, date, phoneNum, aadharNum);
	}
	
	//search employee

	public static EmployeeEntity searchEmp(int id, List<EmployeeEntity> list) throws EmployeeException {
		for (EmployeeEntity e : list) {
			if (e.getId() == id) {
				return e;
			}
		}
		throw new EmployeeException("employee not found");
	}
	
	
	//search by aadharNumber
	
	public static EmployeeEntity searchByAadhar(int aadharrNum, List<EmployeeEntity> list) throws EmployeeException {
		for (EmployeeEntity e : list) {
			if (e.getAadharNum() == (aadharrNum)) {
				return e;
			}
		}
		throw new EmployeeException("employee not found");
	}
	
	
}
