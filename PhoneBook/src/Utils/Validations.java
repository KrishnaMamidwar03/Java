package Utils;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;
import java.util.regex.Pattern;

import Exception.PhoneException;
import PhoneBook.PhoneBook;

public class Validations {

	public static PhoneBook ValidInputs(long number, String name, String dob, String email, List<PhoneBook> list) throws PhoneException {
		LocalDate dob1 = parseDate(dob); //convert date type String->LocalDate
		chechEmail(email);//checking email format
		checkNumber(number);//checking phone number length
		return new PhoneBook(number, name, dob1, email); //return constructor PhoneBook
	}

	public static LocalDate parseDate(String dob) throws PhoneException {
		LocalDate d = LocalDate.parse(dob);
		//only more than 18 accepted 
		int age = Period.between(d, LocalDate.now()).getYears();
		if (age< 18)
			throw new PhoneException("you are under age!!");
		return d;
	}
	
	public static void chechEmail(String email) throws PhoneException {
		String regex = "^[a-z0-9]+@gmail\\.com$";
		if (!email.matches(regex))
			throw new PhoneException("email format is not valid.");
	}
	
	public static void checkNumber(long number) throws PhoneException {
		String num = "^[0-9]";
		//using String.valueOf cause data type is not same
		if(!Pattern.matches(num,String.valueOf(number)) ||  String.valueOf(number).length()!=10) {
			throw new PhoneException("Number is not valid.");
		}
	}

}
