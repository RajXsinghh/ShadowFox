package com.testing.project;

import java.time.LocalDateTime;

public class Accountt {
    private int id;
    private String name;
    private double balance;
    private LocalDateTime time;
    private double deposit;
    
    
    
    public Accountt(int id, String name, double balance, LocalDateTime time, double deposit) {
        this.id = id;
        this.name = name;
        this.balance = balance;
        this.time = time;
        this.deposit=deposit;
        
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


	
	
	public void deposit(double amount, LocalDateTime time, double balance) {
		
	    this.balance=balance+amount;
		this.time=time;
	}

     public void withdraw(double draw, double balance, LocalDateTime time) {
    	 
    	 this.balance=balance-draw;
    	 this.time=time;
    	 
    	 
     }


}