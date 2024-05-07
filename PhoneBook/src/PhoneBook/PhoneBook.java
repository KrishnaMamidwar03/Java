package PhoneBook;

import java.time.LocalDate;

public class PhoneBook {

	private long number;
	private String name;
	private LocalDate dob;
	private String email;

	public PhoneBook(long number, String name, LocalDate dob, String email) {
		this.number = number;
		this.name = name;
		this.dob = dob;
		this.email = email;
	}

	public PhoneBook(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Phone number: " + number + " name : " + name + " dateOfBirth : " + dob + " email : " + email;
	}

	public long getNumber() {
		return number;
	}

	public void setNumber(long number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
