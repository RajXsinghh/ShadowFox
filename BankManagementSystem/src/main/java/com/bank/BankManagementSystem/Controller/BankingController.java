package com.bank.BankManagementSystem.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.bank.BankManagementSystem.Models.Account;
import com.bank.BankManagementSystem.Models.Transaction;
import com.bank.BankManagementSystem.Service.BankingService;

@RestController
@RequestMapping("/bank")
public class BankingController {

	@Autowired
	private BankingService bankingService ;
	
	@PostMapping("/accounts")
	public ResponseEntity<Account> createAccount(@RequestBody Account account){
		return ResponseEntity.ok(bankingService.createAccount(account));
		
	}
	
	@PostMapping("/transfer")
	public ResponseEntity<Void> transferFunds(@RequestBody Transaction request) {
		
		bankingService.transferFunds(request.getFromAccount(), request.getToAccount(), request.getAmount());
		return ResponseEntity.ok().build();
		}
	
	
	@GetMapping("/transactions/{accountNumber}")
	
	     public ResponseEntity<List<Transaction>> getTransactionHistory(@PathVariable String accountNumber) {
		     List<Transaction> transactions = bankingService.getTransactionHistory(accountNumber);
		     return ResponseEntity.ok(transactions);
		     
	}
	
	@GetMapping("/show")
	
	   public ResponseEntity<List> showAccount() {
		
		List<Account> acc = bankingService.showAccount();
		return ResponseEntity.ok(acc);
		
	}
	
	
}
