package com.app.Customer;

import java.time.LocalDate;

public class Customer {
	private int customerId;
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private double registrationAmount;
	private LocalDate date;
	private Plan plan;
	
	private static int idCount;

	public Customer(String firstName, String lastName, String email, String password, double registrationAmount,
			LocalDate date, Plan plan) {
		super();
		this.customerId=++idCount;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.registrationAmount = registrationAmount;
		this.date = date;
		this.plan = plan;
	}

	public Customer(String email) {
		this.email = email;
	}

	public String toString() {
		return "FirstName = " + firstName + " LastName = " + lastName + " email = " + email + " Password = " + password
				+ " registrationAmount = " + registrationAmount + " date = " + date + " Plan buy = " + plan;
	}

	@Override
	public boolean equals(Object e) {
		
		if (e instanceof Customer) {
			System.out.println("check email...");
			return this.email.equals(((Customer) e).email);
		}
		return false;
	}
	public int getCustomerId() {
		return customerId;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getEmail() {
		return email;
	}
	public String getPassword() {
		return password;
	}
	public double getRegAmount() {
		return registrationAmount;
	}
	public LocalDate getDob() {
		return date;
	}
	public Plan getPlan() {
		return plan;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}

	

}
