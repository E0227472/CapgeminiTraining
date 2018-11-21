package com.cg.repository;

import java.util.TreeMap;

import com.cg.beans.User;

public class MapStorage {
	
	private TreeMap<String, User> mapStorage;
	
	public MapStorage() {
		
	}
	
	public MapStorage (TreeMap<String, User> mapStorage) {
		this.mapStorage = mapStorage;
	}
	
	public TreeMap<String,User> getMapStorage() {
		return mapStorage;
	}

}
