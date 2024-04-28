package BankAccount;
//import java.util.*;

public class BankAccount {
	private int accountNo;
	private String accountHolderName;
	private double balance;


	public BankAccount(int accountNo, String accountHolderName, double balance) {
		this.accountNo = accountNo;
		this.accountHolderName = accountHolderName;
		this.balance = balance;
	}

	public void deposit(double amount) {
		if (amount > 0) {
			balance = balance + amount;
			System.out.println("name : " + accountHolderName);
			System.out.println("amount " + amount + "deposited successfully");
		} else {
			System.out.println("amount is invalid.");
		}
	}

	public void withdraw(double amount) {
		if (amount < 0 && amount > balance) {
			System.out.println("the amount is insufficient for withdraw");
		} else {
			balance = balance - amount;
			System.out.println("name : " + accountHolderName);
			System.out.println("withdraw " + amount + " succesfully");
		}
	}

	public void checkbalance() {
		System.out.println("Account number : " + accountNo);
		System.out.println("name : " + accountHolderName);
		System.out.println("account balance : " + balance);
	}

//	@Override
//	public String toString() {
//		return "accountNo : "+accountNo+"/naccountHolderName : "+accountHolderName+"/nbalance : "+balance;
//	}

	public int getAcNo() {
		return this.accountNo;
	}
	
	
//	public String getaccountHolderName() {
//		return this.accountHolderName; 
//	}
//	
//	public double getbal() {
//		return this.balance;
//	}
//	
//	public void setAcNo(int accountNo) {
//		this.accountNo = accountNo;
//	}
//	
//	public void setaccountHolderName(String accoountHolderaccountHolderName) {
//		this.accountHolderName = accountHolderName;
//	}
//	
//	public void setbal(double balance) {
//		this.balance = balance;
//	}

}
