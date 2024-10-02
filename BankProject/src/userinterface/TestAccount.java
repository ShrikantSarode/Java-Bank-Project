package userinterface;

import validation.AccountValidation;
import java.util.Scanner;
import operations.AccountOperations;
import entity.Account;

public class TestAccount {

	public static void main(String[] args) {

		Account account1 = new Account();
		Account account2 = new Account();
		AccountOperations accountOperations = new AccountOperations();
		AccountValidation accountValidation = new AccountValidation();

		int ch;
		String choice;
		Scanner sc = new Scanner(System.in);

		do {

			System.out.println("Welcome to ICICI Bank!!");
			System.out.println("1.Accept Details");
			System.out.println("2.Display Details");
			System.out.println("3.Withdraw Details");
			System.out.println("4.Deposit Amount");
			System.out.println("5.Transfer Amount");
			System.out.println("6.Check Balance");
			System.out.println("7.Update Balance");
			System.out.println("8.Update Balance");
			System.out.println("9.Exit");

			System.out.println("Enter your choice: ");
			ch = sc.nextInt();

			switch (ch) {

			case 1:
				System.out.println("1.Enter accNo,HolderName and balance: ");
				int accNo = sc.nextInt();
				String accHolderName = sc.next();
				double bal = sc.nextDouble();

				// validating this 1/ps
				boolean result2 = accountValidation.checkAll(accNo, bal, accHolderName);
				if (result2 == true) {
					System.out.println("all inputs are Valid");
					account1.setAccNo(accNo);
					account1.setAccHolderName(accHolderName);
					account1.setBalance(bal);
				} else {
					System.out.println("Invalid inputs....");
				}

				break;

			case 2:
				System.out.println("2.Display Details");
				System.out.println("Account Number is :" + account1.getAccNo());
				System.out.println("Account Number is :" + account1.getAccHolderName());
				System.out.println("Account Number is :" + account1.getBalance());
				break;

			case 3:
				System.out.println("3.Enter the amount to Withdraw Details: ");
				double amount = sc.nextDouble();
				boolean result = accountOperations.withdraw(account1, amount);
				if (result == true)
					System.out.println("Sucessfully Withdraw, Your New Balance is :" + account1.getBalance());// new
																												// balance
				else
					System.out.println("Withdraw is Failed!!!");
				break;

			case 4:
				System.out.println("4.Deposit Amount");
				System.out.println("Enter amount to deposit: ");
				amount = sc.nextInt();
				result = accountOperations.deposit(account2, amount);
				if (result == true)
					System.out.println("Sucessfully Deposit, Your New Balance is :" + account2.getBalance());// new
																												// balance
				else
					System.out.println("Deposit is Failed!!!");
				break;

			case 5:
				System.out.println("=========================================");
				System.out.println("5.Transfer Amount from Account_1 to Account_2 ");
				System.out.println("1.Enter accNo,HolderName and balance: ");
				accNo = sc.nextInt();
				accHolderName = sc.next();
				bal = sc.nextDouble();

				result2 = accountValidation.checkAll(accNo, bal, accHolderName);
				if (result2 == true) {
					System.out.println("all inputs are Valid");
					account2.setAccNo(accNo);
					account2.setAccHolderName(accHolderName);
					account2.setBalance(bal);
				} else {
					System.out.println("Invalid inputs....");
				}

				System.out.println("Enter the transfer amount: ");
				amount = sc.nextDouble();
				result = accountOperations.transfer(account1, account2, amount);

				System.out.println("Account_1 Old balance is:" + account1.getBalance());
				System.out.println("Account_2 Old balance is:" + account2.getBalance());

				if (result == true) {
					System.out.println("Transfer is successfull from Account_1 to Account_2 (: ");
					System.out.println("Account_1 new balance is: " + account1.getBalance());
					System.out.println("And Account_2 new balance is: " + account2.getBalance());
				} else {
					System.out.println("Transfer Failed ): ");
				}
				System.out.println("=========================================");
				break;

			case 6:
				System.out.println("=========================================");
				System.out.println("The balance is "+ account1.getBalance());
				System.out.println("=========================================");
				break;

			case 7:
				System.out.println("=========================================");
				System.out.println("Enter the new Balance: ");
				bal=sc.nextDouble();
				account1.setBalance(bal);
				System.out.println("Updated the balance");
				System.out.println("=========================================");
				break;

			case 8:
				System.out.println("7.Enter Email");
				break;

			case 9:
				System.out.println("Closed");
				System.exit(0);
			}

			System.out.println("Do you want to continue: {Y/N}");
			choice = sc.next();

		} while (choice.equalsIgnoreCase("y"));

		System.out.println("Thank you for using this App.");

	}

}
