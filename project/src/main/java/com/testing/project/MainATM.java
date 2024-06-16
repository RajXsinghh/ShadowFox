package com.testing.project;

import java.time.LocalDateTime;
import java.util.Scanner;

public class MainATM {

    public static void main(String[] args) {
        
        BankManagement bm=new BankManagement();
        
        Scanner sc=new Scanner(System.in);
        while(true) { 
    	System.out.println("\nEnter your choice :");
        System.out.println("Press 1 to create account");
        System.out.println("Press 2 to deposit money");
        System.out.println("Press 3 to withdraw money");
       
        int ch=sc.nextInt();
        
        switch(ch) {
                    case 1: System.out.println("Enter your name : ");
					        sc.nextLine();
					        String name=sc.nextLine();
					        
					        
					        
					        System.out.println("Enter amount to deposit :");
					        double deposit=sc.nextDouble();
					        
					        LocalDateTime time=LocalDateTime.now();
					        System.out.println("Current Time is : "+time);
//					        sc.nextLine();
					        
					        double balance =deposit;
					        System.out.println("Your balance is : "+balance);
					        
					        bm.addAccount(name, time, deposit, balance);
					        break;
					        
					        
			        
			        case 2:    System.out.println("Enter your ID : ");
			                   int id=sc.nextInt();
				               Accountt account =bm.findAccountById(id);
				               
				               if(account!=null) {
			               
				               System.out.println("Enter amount to deposit :");
				               double deposit1=sc.nextDouble();
				               sc.nextLine();
				               
				               time = LocalDateTime.now();
				               System.out.println("Current time is : "+time);
				               
				               double balance1=account.getBalance()+deposit1;
				       			   System.out.println("Your balance is : "+balance1);
				       			   account.deposit( deposit1, time, balance1);
				       			  
				       			   account.setBalance(balance1);
				       		   }
				               
				               
				       		   else {
				       			   System.out.println("Account not found ! ");
				       		   }
				       		   break;
				       		   
				       		    
				   case 3:    System.out.println("Enter your ID : ");
				               id=sc.nextInt();
				               Accountt acc=bm.findAccountById(id);
				               
				               if(acc != null) {
				            	   System.out.println("Enter amount to withdraw :");
				            	   double draw =sc.nextInt();
				            	   
				              time=LocalDateTime.now();
				              System.out.println("Current time is : "+time);
				              
				              balance=acc.getBalance()-draw;
				              System.out.println("Your balance is : "+balance);
				              acc.withdraw(draw,balance, time);
				              acc.setBalance(balance);
				                   }
				               
				               
				               else {
				            	   System.out.println("Account not found !");
				               }
			                   break;
			               
        	   
          }
        }
      }
    }
