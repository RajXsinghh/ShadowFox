package com.testing.project;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.autoconfigure.pulsar.PulsarProperties.Transaction;

class BankManagement {
	private List<Accountt> account;
	private int nextId;

	BankManagement() {
		account = new ArrayList<>();
		nextId = 0;
	}

	public void addAccount(String name, LocalDateTime time, double deposit, double balance,double withdraw) {
		Accountt acc = new Accountt(++nextId, name, deposit, time, balance,withdraw);
		account.add(acc);
		System.out.println("Your ID is : " + nextId);
		System.out.println("Your name is : " + name);
	}

	public Accountt findAccountById(int id) {
		for (Accountt acc : account) {
			if (acc.getId() == id) {
				return acc;
			}

		}
		return null;
	}

	public void deposit(int id, double deposit, LocalDateTime time, double balance) {
		Accountt account = findAccountById(id);

		if (account != null) {
			account.deposit(deposit, time, balance);
			account.setBalance(balance);
			account.setDate(time);
		} else {
			System.out.println("Account not found !" + time);
		}

	}

	public void withdraw(int id, double withdraw, double balance, LocalDateTime time) {
		Accountt acc = findAccountById(id);

		if (acc != null) {
			acc.withdraw(withdraw, balance, time);
			acc.setBalance(balance);
			acc.setDate(time);
		}

		else {
			System.out.println("Account not found ! ");
		}

	}

	public List<Accountt> balance() {
		return account;
	}

	public void transactionHistory(int id) {
        Accountt ac=findAccountById(id);
         if(ac!=null) {
         System.out.println("Transaction history for account "+ id +":");
         System.out.println("withdraw amount "+ac.getDeposit() +" " + ac.getDate());
         System.out.println("Balance: "+ac.getBalance());
          
         if(ac.getDeposit()>0) {
        	 System.out.println("Deposit of "+ac.getDeposit() + ac.getDate());
         }
         
         if(ac.getBalance()<0) {
        	 System.out.println("Withdrawl of "+Math.abs(ac.getBalance())+"on"+ac.getDate());
         }
         }
         else {
        	 System.out.println("Account not found ! ");
         }
         
         
       
         }

	
	}

