package mylab.bank.entity;

import java.util.ArrayList;
import java.util.List;

public class Bank {
	private List<Account> accounts;
	private int nextAccountNumber;

	public Bank() {
		this.accounts = new ArrayList<>();
        this.nextAccountNumber = 1;
	}
	
	public String createSavingAccount(String accountNumber, String ownerName, double balance) {
		
	}
	
	public String createCheackingAccount(String accountNumber, String ownerName, double balance) {
		
	}
	
	public Account findAccount(String accountNumber) throws AccountNotFoundException {
		
	}
	
	public void deposit(String accountNumber, double balance) throws AccountNotFoundException {
		
		
	}
	public void withdraw(String accountNumber, double balance) throws AccountNotFoundException, InsufficientBalanceException {
		
	}
	
	public void transferString accountNumber, String ownerName, double balance) throws AccountNotFoundException, InsufficientBalanceException {
		
	}
	
	public void printAllAccounts() {
		
	}
	
	}
