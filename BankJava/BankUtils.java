package BankAccount;

import java.util.ArrayList;

public class BankUtils {
	public static void depositToAccount(ArrayList<BankAccount> accounts, int accountNo, double amount) {
		for (BankAccount account : accounts) {
			if (account.getAcNo() == accountNo) {
				account.deposit(amount);
				System.out.println("Deposit successful.");
				return;
			}
		}
		System.out.println("account not found.");
	}
	public static void withdrawToAccount(ArrayList<BankAccount> accounts,int accountNo ,double amount) {
		for(BankAccount account : accounts) {
			if(account.getAcNo()==accountNo) {
				account.withdraw(amount);
				System.out.println("withdraw successfully");
				return;
			}
		}
		System.out.println("account not found.");
	}
	
	public static void checkBalanceToAccount(ArrayList<BankAccount> accounts, int accountNo) {
		for(BankAccount account : accounts) {
			if(account.getAcNo()==accountNo) {				
				account.checkbalance();
				return;
			}
		}
		System.out.println("account not found.");
	}
}
