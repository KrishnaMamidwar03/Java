package com.app.tester;

import java.util.*;
import com.app.Exception.CustomerException;
import com.app.utils.CMSUtils;
import com.app.Customer.Customer;
import static com.app.utils.CustomerValidations.*;

public class CustomerApp {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			boolean exit = false;

			Map<String, Customer> customers = new HashMap<String, Customer>();

			while (!exit) {
				System.out.println("Options : 1.new Customer Entry \n" + "2.Display ALL customers \n"
						+ "3. cutomer signing \n" + "4. update password \n" + "5. unsubscribe \n"
						+ "6. sort by email \n" + /*
													 * "7. sort in ascending order by date of birth. \n" +
													 * "8.sort by first name in desc order \n" +
													 */ "0.exit");
				System.out.println("enter your choice : ");
				try {
					switch (scan.nextInt()) {
					case 1:
						System.out.println(
								"enter details : \n firstname, lastname, email, password, entry_amount, DateOfBirth, PlansOfSubscription");
						Customer cust = ValidateInput(scan.next(), scan.next(), scan.next(), scan.next(),
								scan.nextDouble(), scan.next(), scan.next(), customers);

						customers.put(cust.getEmail(),cust);

						System.out.println("customer data added.");
						break;

					case 2:
						System.out.println("all customer details : ");
				        String tableFormat = "%-10s %-15s %-15s %-30s %-20s %-20s %-15s %-10s";
				        System.out.println( String.format(tableFormat,  "ID", "First Name", "Last Name", "Email", "Password", "Reg Amount", "Date", "Plan"));
						for (Customer a : customers.values())
							System.out.println(a);

						break;

					case 3:
						System.out.println("\n Enter email and password : ");
						cust = CMSUtils.authentcateCustomer(scan.next(), scan.next(), customers);
						System.out.println(cust);
						break;

					case 4:
						System.out.println("\n Enter email and password : ");
						cust = CMSUtils.authentcateCustomer(scan.next(), scan.next(), customers);

						cust.setPassword(scan.next());
						System.out.println("Password Updated SuccessFully.");
						break;

					case 5:
						System.out.println("\n Enter email to unsubscribe : ");
						System.out.println(CMSUtils.deleteCustomer(scan.next(), customers));
						break;
					case 6:
						TreeMap<String, Customer> sortMap = new TreeMap<>(customers);
						System.out.println("sorted List: ");
						for (Customer a : sortMap.values())
							System.out.println(a);
						break;

//					case 7:
//						System.out.println("sort by date and surname");
//						Collections.sort(customers, new Comparator<Customer>() {
//							public int compare(Customer c1, Customer c2) {
//								int dobCompare = c1.getDob().compareTo(c2.getDob());
//								if (dobCompare == 0) {
//									return c1.getLastName().compareTo(c2.getLastName());
//								}
//								return dobCompare;
//							}
//						});
//						break;

					case 0:
						exit = true;
						break;
					}

				} catch (CustomerException e) {
					System.out.println(e);
					scan.nextLine();
				} catch (Exception e) {
					System.out.println("invalid input:" + e.getMessage());
					scan.nextLine();
				}
			}
		}
		System.out.println("Main Over for customer.");

	}

}
