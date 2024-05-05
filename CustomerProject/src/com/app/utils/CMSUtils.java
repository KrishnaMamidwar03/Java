package com.app.utils;

import java.util.Map;

import com.app.Customer.Customer;
import com.app.Exception.CustomerException;

public class CMSUtils {

	public static Customer authentcateCustomer(String email, String password, Map<String, Customer> maplist)
			throws CustomerException {
		Customer newCust = maplist.get(email);
		if (newCust == null)
			throw new CustomerException("invalid email.");

		if (newCust.getPassword().equals(password))
			return newCust;

		throw new CustomerException("invalid password.");
	}

	public static String deleteCustomer(String email, Map<String, Customer> removeCustomer) throws CustomerException {
		if (removeCustomer == null)
			throw new CustomerException("can't unsubscribe : invalid email.");

		return "Removed details of " + removeCustomer.remove(email).getFirstName();

	}
}
