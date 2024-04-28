package BankAccount;

import java.util.*;

public class mainBankAccount {

	public static void main(String[] args) {
 		ArrayList<BankAccount> accounts = new ArrayList<>();
		BankAccount account = null;

		Scanner scan = new Scanner(System.in);
		System.out.println("welcome to the bank server.");

		int choice;
		do {
			System.out.println("1. Add Employee.");
			System.out.println("2. Deposit ");
			System.out.println("3. Withdraw");
			System.out.println("4. Check Balance ");
			System.out.println("5. Exit.");
//			System.out.println("1. Deposit /n2. Withdraw /n3. check Balance /n4. Exit");
			System.out.println("enter your choice : ");
			choice = scan.nextInt();
			switch (choice) {
			case 1:
				System.out.println("enter account id : ");
				int accountNo = scan.nextInt();

				System.out.println("enter your name : ");
				String accountHolderName = scan.next();

				System.out.println("enter initial balance");
				double balance = scan.nextDouble();
				account = new BankAccount(accountNo, accountHolderName, balance);
				accounts.add(account);
				System.out.println("account added successfully.");
				break;

			case 2:
				System.out.println("enter the account id to deposit : ");
				int depAccountNo = scan.nextInt();

				System.out.println("enter the deposit amount :");
				double amount = scan.nextDouble();

				BankUtils.depositToAccount(accounts, depAccountNo, amount);
				break;

			case 3:
				System.out.println("enter enter the account number :");
				int witAccountNo = scan.nextInt();
				System.out.println("enter amount to withdraw : ");
				double withdrawAmount = scan.nextDouble();

				BankUtils.withdrawToAccount(accounts, witAccountNo, withdrawAmount);
				break;

			case 4:
				System.out.println("Enter the account number to check balance:");
				int checkBalance = scan.nextInt();
				BankUtils.checkBalanceToAccount(accounts, checkBalance);
				break;

			case 5:
				System.out.println("EXIT.");
				break;

			default:
				System.out.println("invalid entry!");

			}

		} while (choice != 5);

		scan.close();
	}

}
