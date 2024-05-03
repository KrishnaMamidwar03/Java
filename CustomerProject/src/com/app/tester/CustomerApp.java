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
//			System.out.println("Enter max customer entry : ");
//			Customer[] customer = new Customer[scan.nextInt()];
			List<Customer> customers = new ArrayList<>();
//			int counter = 0;
			while (!exit) {
				System.out.println("Options : 1.new Customer Entry \n" + "2.Display ALL customers \n"
						+ "3. cutomer signing \n" + "4. update password \n" + "5. unsubscribe \n"+"6. sort by email \n"
						+ "7. sort in ascending order by date of birth. \n"+"8.sort by first name in desc order \n" + "0.exit");
				System.out.println("enter your choice : ");
				try {
					switch (scan.nextInt()) {
					case 1:
//						if (counter < customer.length) {
						System.out.println(
								"enter details : \n firstname, lastname, email, password, entry_amount, DateOfBirth, PlansOfSubscription");
						Customer cust = ValidateInput(scan.next(), scan.next(), scan.next(), scan.next(),
								scan.nextDouble(), scan.next(), scan.next(), customers);

						customers.add(cust);
//						customer[counter++] = cust;
						System.out.println("customer data added.");
//						} else {
//							System.out.println("date full...");
//						}
						break;

					case 2:
						System.out.println("all customer details : ");
						for (Customer a : customers)
							if (a != null)
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
						CMSUtils.deleteCustomer(scan.next(), customers);
						break;
					case 6:
//						Collections.sort(customers, new CompareEmail());
						Collections.sort(customers);
						
						break;
					case 7:
						System.out.println("sort by date and surname");
						Collections.sort(customers, new Comparator<Customer>() {
							public int compare(Customer c1, Customer c2) {
								int dobCompare = c1.getDob().compareTo(c2.getDob());
								if (dobCompare == 0) {
									return c1.getLastName().compareTo(c2.getLastName());
								}
								return dobCompare;
							}
						});
						break;

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
