package operations;

import entity.Account;

public class AccountOperations {

	public boolean withdraw(Account account, double amount) {
		double bal = account.getBalance();// 30000
		if (bal < amount) {
			System.out.println("Insufficient Balance");
			return false;
		} else if (amount < 0) {
			System.out.println("Withdraw amount should not be Negative!!!");
			return false;
		} else {
			bal = bal - amount;/// 30000-2000=28000
			account.setBalance(bal);// 28000
			System.out.println("Withdraw Successfully");
			return true;
		}

	}

	public boolean deposit(Account account, double amount) {
		double bal = account.getBalance();
		if (amount < 0) {
			System.out.println("Deposite amount should not be Negative!!!");
			return false;
		}else if(amount>100000) {
			System.out.println("Need Income Proof.");
			return false;
		}
		
		else {
			bal = amount + bal;
			account.setBalance(bal);
			System.out.println("Deposited!!!");
			return true;
		}
	}

	public boolean transfer(Account account1, Account account2, double amount) {
		double bal1 = account1.getBalance();
		double bal2 = account2.getBalance();

		if (amount < 1) {
			System.out.println("Tranfer amount should not be Negative or Zero !!!");
			return false;
		} else if (bal1 < amount) {
			System.out.println("Insufficient Balance");
			return false;
		} else {
			bal1 = bal1 - amount;
			bal2 = bal2 + amount;

			account1.setBalance(bal1);
			account2.setBalance(bal2);

			System.out.println("Tranfered Successfully");
			return true;
		}
	}
}
