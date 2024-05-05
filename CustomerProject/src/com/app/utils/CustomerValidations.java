package com.app.utils;

import java.time.LocalDate;
import java.time.Period;
import java.util.Map;

import com.app.Customer.Customer;
import com.app.Customer.Plan;
import com.app.Exception.CustomerException;

public class CustomerValidations {

	public static Customer ValidateInput(String firstName, String lastName, String email, String password,
			double registrationAmount, String date, String plan, Map<String, Customer> customers)
			throws CustomerException {

		checkForDuplicate(email, customers);
		LocalDate createDate = parseDate(date);
		Plan splan = servicePlan(plan, registrationAmount);
		validPassword(password);
		AgeValidation(date);
		ChechEmail(email);
		return new Customer(firstName, lastName, email, password, registrationAmount, createDate, splan);
	}

	public static Plan servicePlan(String plan1, double registrationAmount) throws CustomerException {

		Plan plans = Plan.valueOf(plan1.toUpperCase());
		if (plans.getPlanCost() != registrationAmount)
		throw new CustomerException("Registration amount doen't match with the plan.");
		return plans;
	}

	public static LocalDate parseDate(String date) {
		return LocalDate.parse(date);
	}

	public static void validPassword(String password) throws CustomerException {
		String regex = "((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[#@$*]).{5,20})";
		if (!password.matches(regex)) {
			throw new CustomerException("password format not accepted!");
		}
	}

	public static void ChechEmail(String email) throws CustomerException {
		String regex = "^[a-z0-9]+@gmail\\.com$";
		if (!email.matches(regex))
			throw new CustomerException("email format is not valid.");
	}

	public static void AgeValidation(String date) throws CustomerException {
		int age = Period.between(LocalDate.parse(date), LocalDate.now()).getYears();
		if (age < 21) {
			throw new CustomerException("you are under age.");
		}
	}

	public static void checkForDuplicate(String email, Map<String, Customer> customers) throws CustomerException {

		if (customers.containsKey(email))
			throw new CustomerException("email already existed.");

	}

}
