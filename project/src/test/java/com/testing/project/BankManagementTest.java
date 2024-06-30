package com.testing.project;

import static org.junit.Assert.*;
import java.time.LocalDateTime;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.boot.autoconfigure.pulsar.PulsarProperties.Transaction;

public class BankManagementTest {

	@Test
	public void testaddAccount() {

		BankManagement bm = new BankManagement();
		String name = "Rajveer Singh";
		LocalDateTime time = LocalDateTime.now();
		double deposit = 1000;
		double balance = 1000;
		double withdraw =0;

		bm.addAccount(name, time, deposit, balance, withdraw);

		Accountt acc = bm.findAccountById(1);
		assertNotNull(acc);
		assertEquals(name, acc.getName());
		assertEquals(deposit, acc.getDeposit(), 0);
		assertEquals(balance, acc.getBalance(), 0);
		assertEquals(time, acc.getDate());

	} 
//	
//	@Test
//	public void testdeposit() {
//		BankManagement bm = new BankManagement();
//		 int id =1;
//		 LocalDateTime time =LocalDateTime.now();
//		 double deposit = 0;
//		 String name="Rajveer Singh";
//		 double balance = 0;
//		 
//		 bm.addAccount(name, time, deposit, balance);
//		 
//		 Accountt acc =bm.findAccountById(id);
//		 
//		 double newBalance=balance+deposit;
//		 bm.deposit(id, deposit, time, newBalance);
//		 
//		 assertNotNull(acc);
//		 assertEquals(id,acc.getId());
//		 assertEquals(deposit,acc.getDeposit(),0);
//		 assertEquals(time,acc.getDate());
//		 assertEquals(balance,acc.getBalance(),0);
//	}	 
//      @Test
//      public void testwithdraw() {
//    	  BankManagement bm= new BankManagement();
//    	  
//    	  int id =1;
//    	  LocalDateTime time =LocalDateTime.now();
//    	  double balance =1000;
//    	  double withdraw=500;
//    	  String name="Raj";
//    	  double deposit=0;
//    	  
//    	  bm.addAccount(name, time, deposit, balance,withdraw);
//    	  
//    	  Accountt ac=bm.findAccountById(1);
//    	  double newbalance =balance -withdraw;
//    	  bm.withdraw(id, withdraw, newbalance, time);
//    	  
//    	  assertNotNull(ac);
//    	  assertEquals(id,ac.getId());
//    	  assertEquals(time,ac.getDate());
//    	  assertEquals(withdraw,ac.getWithdraw(),0);
//    	  assertEquals(newbalance,ac.getBalance(),0);
//    	  
//    	}
      
//      @Test
//      public void testtransactionHistory() {
//    	  BankManagement bm=new BankManagement();
//    
//    	  //create account
//    	  bm.addAccount("Raj Singh",LocalDateTime.now(),1000,1000,0);
//    	  bm.addAccount("Veer Mewad",LocalDateTime.now(),500,500,0);
//    	  
//    	  //Transaction perform
//    	  Accountt ac = bm.findAccountById(1);
//    	  ac.deposit(500,LocalDateTime.now(),ac.getBalance()+500);
//    	  ac.withdraw(200,ac.getBalance()-200,LocalDateTime.now());
//    	  
//    	  //call
//    	  bm.transactionHistory(1);
    	  
//    	  assertNotNull(ac);
//    	  assertEquals(id,ac.getId());
//    	  assertEquals(time,ac.getDate());
//    	  assertEquals(withdraw,ac.getWithdraw(),0);
//    	  assertEquals(newbalance,ac.getBalance(),0);
    	  
    	  	  
    //  }
   
//	 private BankManagement bank ;
//    
//    @Before
//    public void setUp() {
//    	bank = new BankManagement();
//    }
    
//    @Test
//    public void testAddAccount()  {
//    	bank.addAccount("Raj Singh", LocalDateTime.now(), 1000, 1000);
//    	assertEquals(1,bank.balance().size());
//    	Accountt account =bank.findAccountById(1);
//    	assertNotNull(account);
//    	assertEquals("Raj Singh",account.getName());
//    	assertEquals(1000, account.getBalance(),0);
//    	
//    }
	
//    @Test
//    public void testAddAccountMultiple() {
//    	bank.addAccount("Raj Singh", LocalDateTime.now(), 1000, 1000);
//    	bank.addAccount("Veer", LocalDateTime.now(), 200, 200);
//     	
//    	assertEquals(2, bank.balance().size());
//    	
//    	Accountt acc =bank.findAccountById(1);
//    	assertNotNull(acc);
//    	assertEquals("Raj Singh", acc.getName());
//    	assertEquals(1000, acc.getBalance(),0);
//    	
//    	Accountt ac = bank.findAccountById(2);
//    	assertNotNull(ac);
//    	assertEquals( "Veer", ac.getName());
//    	assertEquals(200, ac.getBalance(), 20);
//    }
//    
//   @Test
//   public void testAddAccountNullName() {
//	   try {
//		 bank.addAccount(null, LocalDateTime.now(), 1000, 1000); 
//		 assert false;
//	   }
//	   catch(Exception e ) {
//		   //System.out.println("False");
//	   }
//   }
 
//   @Test
//   public void testAddAccountZeroBalance() {
//	   bank.addAccount("Raj Singh", LocalDateTime.now(), 0, 0);
//	   assertEquals(1, bank.balance().size());
//	   
//	   Accountt acc= bank.findAccountById(1);
//	   assertNotNull(acc);
//	   assertEquals("Raj Singh",acc.getName());
//	   assertEquals(0,acc.getBalance(),0);
//	   
//	   
//   }
	
	
	
	
	
}
