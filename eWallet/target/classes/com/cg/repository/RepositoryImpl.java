package com.cg.repository;

import javax.persistence.EntityManager;

import javax.security.auth.login.AccountNotFoundException;


import main.java.com.cg.exceptions.InvalidInputException;
import main.java.com.cg.repository.Repository;

public class RepositoryImpl implements  Repository {
	
	// CRUD methods implemented here using JPA.
	// Use the save method to persist one Customer object and its wallet object
	private EntityManager em;
	// pass the entity manager reference from main class to constructor
	public RepositoryImpl(EntityManager em) {
		this.em = em;
	}
	
	public RepositoryImpl() {
		
	}
	public Customer save (Customer c) 
			throws InvalidInputException
	{
		if(c ==null) {
			throw new InvalidInputException("Input type is not correct");
		}
		
		/* Persist one customer and one wallet object */
		em.getTransaction().begin();
		em.merge(c);
		em.getTransaction().commit();
		 
		return c;
	}
	
	// findbymobile method to find the cus object by mobile number
	public Customer findbymobile(String mobile)
			throws AccountNotFoundException {	
		// returns the customer object based on the mobile string key;	
		Customer c = new Customer();
		return c;
	}
}
