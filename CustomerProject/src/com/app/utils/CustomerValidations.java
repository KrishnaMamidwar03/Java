package com.app.utils;

import java.time.LocalDate;
import java.util.List;

import com.app.Customer.Customer;
import com.app.Customer.Plan;
import com.app.Exception.CustomerException;

public class CustomerValidations {

	public static Customer ValidateInput(String firstName, String lastName, String email, String password,
			double registrationAmount, String date, String plan, List<Customer> customers) throws CustomerException {

		checkForDuplicate(email, customers);
		LocalDate createDate = parseDate(date);
		Plan splan = servicePlan(plan, registrationAmount);

		return new Customer(firstName, lastName, email, password, registrationAmount, createDate, splan);
	}

	public static Plan servicePlan(String plan1, double registrationAmount)throws CustomerException {
//		return Plan.valueOf(plan1.toUpperCase());
		Plan plans = Plan.valueOf(plan1.toUpperCase());
		if(plans.getPlanCost()==registrationAmount)
			return plans;
		throw new CustomerException("Registration amount doen't match with the plan.");
	}

	public static LocalDate parseDate(String date) {
		return LocalDate.parse(date);
	}

	public static void checkForDuplicate(String email, List<Customer>customers) throws CustomerException {
		Customer cm = new Customer(email);
		
		if(customers.contains(cm))
			throw new CustomerException("email already existed.");
		
//		for (Customer c : customers) {
//			if (c != null && c.equals(cm)) {
//				System.out.println("duplicate method");
//				throw new CustomerException("Email already registered...");
//			}
//		}
	}

}
