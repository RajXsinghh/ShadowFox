package com.bank.BankManagementSystem.Repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.bank.BankManagementSystem.Models.Transaction;



public interface TransactionRepository extends JpaRepository<Transaction,Long> {

	List<Transaction> findByFromAccountOrToAccount(String fromAccount, String toAccount);
	
	
	
	
}
