package BankAccount;

import java.util.Scanner;

public class mainBankAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("welcome to the bank server.");

		System.out.println("enter account NUM : ");
		int accountNo = scan.nextInt();

		System.out.println("enter your name : ");
		String accountHolderName = scan.next();

		System.out.println("enter initial balance");
		double balance = scan.nextDouble();

		BankAccount account = new BankAccount(accountNo, accountHolderName, balance);

		int choice;
		do {
			System.out.println("1. Deposit /n2. Withdraw /n3. check Balance /n4. Exit");
			System.out.println("enter your choice : ");
			choice = scan.nextInt();
			switch (choice) {
			case 1:
				System.out.println("enter the amount to deposit : ");
				double depositAmount = scan.nextDouble();
				account.deposit(depositAmount);
				break;

			case 2:
				System.out.println("enter amount to withdraw : ");
				double withdrawAmount = scan.nextDouble();
				account.withdraw(withdrawAmount);
				break;

			case 3:
				account.checkbalance();
				break;

			case 4:
				System.out.println("EXIT.");
				break;

			}

		} while (choice != 4);

		scan.close();
	}

}
