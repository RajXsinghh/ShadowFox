package com.bank.BankManagementSystem.Service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.BankManagementSystem.Models.Account;
import com.bank.BankManagementSystem.Models.Transaction;
import com.bank.BankManagementSystem.Repository.AccountRepository;
import com.bank.BankManagementSystem.Repository.TransactionRepository;

import jakarta.transaction.Transactional;

@Service
public class BankingService {

	@Autowired
	private AccountRepository accountRepository;

	@Autowired
	private TransactionRepository transactionRepository;

	public Account createAccount(Account account) {

		return accountRepository.save(account);
	}

	@Transactional
	public void transferFunds(String fromAccountNumber, String toAccountNumber, Long amount) {

		Account fromAccount = accountRepository.findByAccountNumber(fromAccountNumber);
		Account toAccount = accountRepository.findByAccountNumber(toAccountNumber);

		if (fromAccount == null || toAccount == null) {
			throw new RuntimeException("One or both account not found");
		}

		if (fromAccount.getBalance() < amount) {
			throw new RuntimeException("Insufficient Balance");
		}

		fromAccount.setBalance(fromAccount.getBalance() - amount);
		toAccount.setBalance(toAccount.getBalance() + amount);

		accountRepository.save(fromAccount);
		accountRepository.save(toAccount);

		Transaction transaction = new Transaction(fromAccountNumber, toAccountNumber, amount, LocalDateTime.now());
		transactionRepository.save(transaction);
	}

	public List<Transaction> getTransactionHistory(String accountNumber) {

		return transactionRepository.findByFromAccountOrToAccount(accountNumber, accountNumber);
		// explain this
	}

	public List<Account> showAccount() {
		return accountRepository.findAll();
	}

}
