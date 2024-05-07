package tester;

import java.time.LocalDate;
import java.util.*;

import Exception.PhoneException;
import PhoneBook.PhoneBook;

import Utils.PBUtils;

import static Utils.Validations.*;

public class PhoneBookApp {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			boolean exit = false;
			List<PhoneBook> list = new ArrayList<>();
			while (!exit) {
				System.out.println("Menu :");
				System.out.println("1.Add the details for phone number.\n" + "2.show list\n"
						+ "3.Update mobile number\n" + "4.delete contact" + "0.exit");

				System.out.println("enter your choice : ");
				int choice = scan.nextInt();
				try {

					switch (choice) {
					case 0:
						exit = true;
						break;

					case 1:
						System.out.println("enter the details :");
						System.out.println("1.Phone number	2.Name	3.Date of Birth	4. email address");
						PhoneBook book = ValidInputs(scan.nextLong(), scan.next(), scan.next(), scan.next(), list);
						list.add(book); //add validInputs in list
						System.out.println("details added successfully!!");
						break;

					case 2:
						System.out.println("List of Numbers: ");
						for (PhoneBook p : list) {  //for every phoneBook info(p) in list
							System.out.println(p);
						}
						break;

					case 3:
						System.out.println("enter name and dob to update Phone Number :");
						book = PBUtils.UpdateNumber(scan.next(), LocalDate.parse(scan.next()), list);
						System.out.println("Enter new Phone Number:");
						book.setNumber(scan.nextLong());
						break;

					case 4:
						List<PhoneBook> p = PBUtils.removeContact(list);//store the output from removeContact as Arraylist
						list.removeAll(p);//remove the list
						System.out.println("Delted successfully!!");
						break;

					default:
						System.out.println("invalid entry !");
						break;

					}
				} catch (PhoneException p) {
					System.out.println(p);
					scan.nextLine();
				} catch (Exception e) {
					System.out.println("invalid input: " + e.getMessage());
				}
			}
		}
	}

}
