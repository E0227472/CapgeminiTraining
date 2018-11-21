package com.cg.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.cg.beans.Wallet;
import com.cg.exceptions.InvalidInputException;
import com.cg.repository.Repository;
import com.cg.repository.RepositoryImpl;
import com.cg.service.Service;
import com.cg.service.ServiceImpl;

import main.java.com.cg.beans.Customer;

public class Test {
	
	public static void main(String[] args) throws InvalidInputException {
		/* Create EntityManagerFactory */
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
		
		/* Create EntityManager */
		EntityManager em = emf.createEntityManager();

		/* Create and populate Entity */
		Wallet w = new Wallet(223.45);
		Customer c = new Customer("name","12345678", w);

		// Create new Repository reference
		Repository r = new RepositoryImpl(em);
		// Create new Service reference, pass the repository reference inside Service reference 
		Service s = new ServiceImpl(r);
		s.createAccount(c);
	}
}
