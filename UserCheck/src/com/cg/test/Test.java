package com.cg.test;

import java.util.TreeMap;

import com.cg.beans.User;
import com.cg.repository.Repository;
import com.cg.repository.RepositoryImpl;

public class Test {

	public static void main(String[] args) {
		TreeMap<Integer,User> storeUsers = new TreeMap<Integer, User>();
		Repository r = new RepositoryImpl(storeUsers);
		User u1 = new User("username1", 
				"password", "firstname1", 
				"lastname1", "city1", "country1");
		
		User u2 = new User("username2", 
				"password2", "firstname2", 
				"lastname2", "city2", "country2");
		
		User u3 = new User("username3", 
				"password3", "firstname3", 
				"lastname3", "city3", "country3");
		
		r.addUsers(u1);
		r.addUsers(u2);
		r.addUsers(u3);
		
		
		System.out.println(r.getUsers().lastEntry().getValue().getFirstname());
		System.out.println(r.getUsers().get(2).getFirstname());
		System.out.println(r.getUsers().get(3).getFirstname());
		
		
	}
}
