package Utils;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

import Exception.PhoneException;
import PhoneBook.PhoneBook;

public class PBUtils {

	public static PhoneBook UpdateNumber(String name, LocalDate dob, List<PhoneBook> list) throws PhoneException {
		for (PhoneBook p : list) {
			if (p.getName().equals(name) && p.getEmail() != null && p.getDob().isEqual(dob))
				return p;
		}
		throw new PhoneException("data not found!!");
	}

	public static List<PhoneBook> removeContact(List<PhoneBook> list) throws PhoneException {
		List<PhoneBook> addToList = new ArrayList<>();
		for (PhoneBook p : list) {
			Period age = Period.between(p.getDob(), LocalDate.now());
			if (age.getYears() > 80)
				addToList.add(p);
		}
		if (addToList.isEmpty())
			throw new PhoneException("data not found!!");
		return addToList;
	}

}
