package com.cg.repository;

import java.util.Map;
import java.util.TreeMap;

import com.cg.beans.User;

public class RepositoryImpl implements Repository{
	// map to store users and then add users to the application context
	private TreeMap<Integer,User> storeUsers = new TreeMap<Integer, User>();
	public RepositoryImpl () {

	}

	public RepositoryImpl (TreeMap<Integer,User> storeUsers) {
		this.storeUsers = storeUsers;
	}
	
	// adding the users into the map collection
	public TreeMap<Integer, User> addUsers(User u) {
		if(this.storeUsers.size() == 0) {
			this.storeUsers.put(1, u);
		} else {
			int id = this.storeUsers.lastKey();
			this.storeUsers.put(id+1, u);
		}
		
		return this.storeUsers;
	}
	
	// getting all the users once the users have been added 
	public TreeMap<Integer, User> getUsers() {
		
		return storeUsers;
	}
	
}
