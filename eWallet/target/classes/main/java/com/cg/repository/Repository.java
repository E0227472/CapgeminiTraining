package com.cg.repository;

import com.cg.exceptions.AccountNotFoundException;
import com.cg.exceptions.InvalidInputException;

import main.java.com.cg.beans.Customer;

public interface Repository {

	// save customer to repository 
		// InvalidInputException
		public Customer save (Customer c) throws InvalidInputException;
		// findbymobile method to find the cus object by mobile number
		public Customer findbymobile(String mobile) throws AccountNotFoundException;
}
