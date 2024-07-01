package com.bank.BankManagementSystem.Repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bank.BankManagementSystem.Models.Transaction;


@Repository
public interface TransactionRepository extends JpaRepository<Transaction,Long> {

	List<Transaction> findByFromAccountOrToAccount(String fromAccount, String toAccount);
	
	
	
	
}
