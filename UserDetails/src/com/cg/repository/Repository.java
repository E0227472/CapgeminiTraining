package com.cg.repository;

import java.util.TreeMap;

import com.cg.beans.User;

public interface Repository {
	
	public TreeMap<String, User> addUsers(User u);
	public TreeMap<String, User> getUsers();

}
