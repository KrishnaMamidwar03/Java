package com.app.utils;

import java.util.Comparator;

import com.app.Customer.Customer;

public class CompareEmail implements Comparator<Customer>{
	public int compare(Customer e1, Customer e2) {
		int emailCompare = e1.getEmail().compareTo(e2.getEmail());
		return emailCompare;
	}

}
