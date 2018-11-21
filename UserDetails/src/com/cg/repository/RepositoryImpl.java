package com.cg.repository;

import java.util.TreeMap;

import com.cg.beans.User;

public class RepositoryImpl implements Repository{
	// map to store users and then add users to the application context
	private TreeMap<String,User> storeUsers = new TreeMap<String, User>();
	public RepositoryImpl () {

	}

	public RepositoryImpl (TreeMap<String,User> storeUsers) {
		this.storeUsers = storeUsers;
	}
	
	// adding the users into the map collection
	public TreeMap<String, User> addUsers(User u) {
		
		storeUsers.put(u.getUsername(), u);
		
		return this.storeUsers;
	}
	
	// getting all the users once the users have been added 
	public TreeMap<String, User> getUsers() {
		
		return storeUsers;
	}
	
}
