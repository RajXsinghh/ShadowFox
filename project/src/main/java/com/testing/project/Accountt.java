package com.testing.project;

import java.time.LocalDateTime;
import java.util.*;

public class Accountt  {
    private int id;
    private String name;
    private double balance;
    private LocalDateTime time;
    private double deposit;
    private double withdraw;
    
    
    public Accountt(int id, String name, double balance, LocalDateTime time, double deposit,double withdraw) {
        this.id = id;
        this.name = name;
        this.balance = balance;
        this.time = time;
        this.deposit=deposit;
        this.withdraw=withdraw;    
       }


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getBalance() {
		return balance;
	}


	public void setBalance(double balance) {
		this.balance = balance;
	}


	public LocalDateTime getDate() {
		return time;
	}


	public void setDate(LocalDateTime time) {
		this.time = time;
	}

    public void deposit(double deposit, LocalDateTime time, double balance) {
		
	    this.balance=balance+deposit;
		this.time=time;
		
	}

     public void withdraw(double withdraw, double balance, LocalDateTime time) {
    	if(balance>=withdraw) {
    	 this.balance=balance-withdraw;
    	 this.deposit = -withdraw;
    	 this.time=time;
     }
    	else {
    		System.out.println("Insufficient balance");
    	}
     }

	public double getDeposit() {
		return deposit;
	}


	public void setDeposit(double deposit) {
		this.deposit = deposit;
	}


	public LocalDateTime getTime() {
		return time;
	}


	public void setTime(LocalDateTime time) {
		this.time = time;
	}


	public double getWithdraw() {
		return withdraw;
	}


	public void setWithdraw(double withdraw) {
		this.withdraw = withdraw;
	}
 
}