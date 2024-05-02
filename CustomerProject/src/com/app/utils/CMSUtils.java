package com.app.utils;

import java.util.List;

import com.app.Customer.Customer;
import com.app.Exception.CustomerException;

public class CMSUtils {

	public static Customer authentcateCustomer(String email, String password, List<Customer> list)throws CustomerException {
		Customer newCust = new Customer(email);
		int index = list.indexOf(newCust);
		if (index == -1)
			throw new CustomerException("invalid email.");
		Customer customer = list.get(index);

		if (customer.getPassword().equals(password))
			return customer;
		throw new CustomerException("invalid password.");
	}

	public static String deleteCustomer(String email, List<Customer>customerList)throws CustomerException {
		int index = customerList.indexOf(new Customer(email));
		if(index ==-1)
			throw new CustomerException("can't unsubscribe : invalid email.");
		
		return "Removed details of "+customerList.remove(index).getFirstName();
		
	}
}
