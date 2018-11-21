package com.cg.servlets;

import java.util.TreeMap;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import com.cg.beans.User;
import com.cg.repository.MapStorage;
import com.cg.repository.Repository;
import com.cg.repository.RepositoryImpl;

/**
 * Application Lifecycle Listener implementation class UserContextListener
 *
 */
public class UserContextListener implements ServletContextListener {

	/**
	 * Default constructor. 
	 */
	public UserContextListener() {
		// TODO Auto-generated constructor stub
	}


	/**
	 * @see ServletContextListener#contextInitialized(ServletContextEvent)
	 */
	public void contextInitialized(ServletContextEvent sce)  { 
		// getting the servlet context
		ServletContext ctx = sce.getServletContext();
		// create new user objects 
		TreeMap<String,User> storeUsers = new TreeMap<String, User>();
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
		
		MapStorage mp = new MapStorage(r.getUsers());
		// storing the TreeMap in the servletcontext
		ctx.setAttribute("userdata", mp);
	}

	/**
	 * @see ServletContextListener#contextDestroyed(ServletContextEvent)
	 */
	public void contextDestroyed(ServletContextEvent sce)  { 
		System.out.println("ServletContextListener destroyed");

	}







}
