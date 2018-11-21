package com.cg.service;

import com.cg.exceptions.AccountNotFoundException;
import com.cg.exceptions.InsufficientBalanceException;
import com.cg.exceptions.InvalidInputException;

import main.java.com.cg.beans.Customer;

public interface Service {
	public Customer createAccount(Customer c) 
			 throws InvalidInputException; 
	 public Customer getBalance(String mobile) 
			 throws AccountNotFoundException, InvalidInputException;
	 public Customer FundTransfer
	 (String fromMobile, String toMobile, double amount)
            throws AccountNotFoundException,InvalidInputException, InsufficientBalanceException;
	 
	 public Customer deposit (String mobile, double amount)
	 throws AccountNotFoundException,InvalidInputException, InsufficientBalanceException;

}
