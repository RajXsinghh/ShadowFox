package com.testing.project;

import java.time.LocalDateTime;
import java.util.Scanner;

public class MainATM {

	public static void main(String[] args) {

		BankManagement bm = new BankManagement();

		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("\nEnter your choice :");
			System.out.println("Press 1 to create account");
			System.out.println("Press 2 to deposit money");
			System.out.println("Press 3 to withdraw money");
			System.out.println("Press 4 to chech balance");
			System.out.println("Press 5 to check transaction history");
			System.out.println("press 6 to exit");

			int ch = sc.nextInt();
			sc.nextLine(); 
//            System.out.println("Fill details - ");
			switch (ch) {
			case 1:

				System.out.println("Enter your name : ");
				String name = sc.nextLine();
				// sc.nextLine();

				System.out.println("Enter amount to deposit :");
				double deposit = sc.nextDouble();

				LocalDateTime time = LocalDateTime.now();
				System.out.println("Current Time is : " + time);

				double balance = deposit;
				System.out.println("Your balance is : " + balance);
                  
				double withdraw =0;
				bm.addAccount(name, time, deposit, balance,withdraw);

				break;

			case 2:
				System.out.println("Enter your ID : ");
				int id = sc.nextInt();
				Accountt account = bm.findAccountById(id);

				if (account != null) {

					System.out.println("Enter amount to deposit :");
					double deposit1 = sc.nextDouble();
					sc.nextLine();

					time = LocalDateTime.now();
					System.out.println("Current time is : " + time);

					double balance1 = account.getBalance() + deposit1;
					System.out.println("Your balance is : " + balance1);
					account.deposit(deposit1, time, balance1);

					account.setBalance(balance1);
				}

				else {
					System.out.println("Account not found ! ");
				}
				break;

			case 3:
				System.out.println("Enter your ID : ");
				id = sc.nextInt();
				Accountt acc = bm.findAccountById(id);

				if (acc != null) {
					System.out.println("Enter amount to withdraw :");
					double draw = sc.nextInt();

					time = LocalDateTime.now();
					System.out.println("Current time is : " + time);

					balance = acc.getBalance() - draw;
					System.out.println("Your balance is : " + balance);
					acc.withdraw(draw, balance, time);
					acc.setBalance(balance);
				}

				else {
					System.out.println("Account not found !");
				}
				break;

			case 4:
				System.out.println("Enter your ID : ");
				id = sc.nextInt();
				Accountt acco = bm.findAccountById(id);
				if (acco != null) {
					System.out.println("Accounts Details :");
					System.out.println("Name: " + acco.getName());
					System.out.println("Balance: " + acco.getBalance());

				} else {
					System.out.println("Account not found !");
				}

				break;

			case 5:
				System.out.println("Enter your Id : ");
				id =sc.nextInt();
				
				bm.transactionHistory(id);
				
				break;
				
			 case 6:
                 System.out.println("Goodbye!");
                 sc.close();
                 return;
             default:
                 System.out.println("Invalid choice.");
         }
     }
 }
}
