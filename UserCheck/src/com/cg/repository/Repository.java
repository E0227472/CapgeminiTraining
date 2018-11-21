package com.cg.repository;

import java.util.TreeMap;

import com.cg.beans.User;

public interface Repository {

	public TreeMap<Integer, User> addUsers(User u);
	public TreeMap<Integer, User> getUsers();
}
