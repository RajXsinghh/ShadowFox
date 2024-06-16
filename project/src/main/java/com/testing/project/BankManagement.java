package com.testing.project;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

class BankManagement {
	private List<Accountt> account;
	private int nextId;

	BankManagement() {
		account = new ArrayList<>();
		nextId = 0;
	}

	public List<Accountt> getAccounts() {
		return account;
	}

	public void addAccount(String name, LocalDateTime time,double deposit,double balance) {
		 Accountt acc=new Accountt(++nextId,name,deposit,time,balance);
		 account.add(acc);
		 System.out.println("Your ID is : "+ nextId);
	}

	public Accountt findAccountById(int id) {
		for (Accountt acc : account) {
			if (acc.getId()==id) {
			    return acc;
			}
			
		}
		return null;
	}

	public void deposit(int id,  double deposit, LocalDateTime time,double balance) {
		Accountt account = findAccountById(id);
		
		if (account != null) {
			account.deposit(deposit, time, balance);
			account.setBalance(balance);
			account.setDate(time);
		} else {
			System.out.println("Account not found !"+time);
		}

	}

	public void withdraw(int id, double withdraw, double balance, LocalDateTime time) {
           Accountt acc=findAccountById(id);
           
           if(acc !=null) {
        	   acc.withdraw(withdraw, balance, time);
        	   acc.setBalance(balance);
        	   acc.setDate(time);
           }
           
           else {
        	   System.out.println("Account not found ! ");
           }
           
           
           
           
           
           
           
     }

	
	
	public void transactionHistory() {

	}
	
	public void balance() {
		
		
		
	}

	
}
