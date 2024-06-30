package com.bank.BankManagementSystem.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import com.bank.BankManagementSystem.Models.Account;



public interface AccountRepository extends JpaRepository<Account,Long> {

	Account findByAccountNumber(String accountNumber);
	   
   }
