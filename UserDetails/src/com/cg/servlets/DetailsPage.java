package com.cg.servlets;

import java.io.IOException;
import java.util.TreeMap;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cg.beans.User;
import com.cg.repository.MapStorage;

/**
 * Servlet implementation class DetailsPage
 */
public class DetailsPage extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public DetailsPage() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		HttpSession httpSession = request.getSession();
		
		if (CheckUserDetails(username, password)) {
			RequestDispatcher rd = request.getRequestDispatcher("AuthenticatedPage");
			rd.forward(request, response);
		} else if(checkUserFromSession(username, password, httpSession)) {
			RequestDispatcher rd = request.getRequestDispatcher("AuthenticatedPage");
			rd.forward(request, response);
		} else {
			RequestDispatcher rd = request.getRequestDispatcher("NoUserPage");
			rd.forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

	protected boolean CheckUserDetails(String username, String password) {
		
		ServletContext ctx = getServletContext();
		MapStorage mp = (MapStorage) ctx.getAttribute("userdata");
		boolean authenticated = false;
		TreeMap<String, User> storeUsers = mp.getMapStorage();
		
		
		// search through the treemap if user input exists
		if (mp != null) {
			User userlogin = storeUsers.get(username);
			if (userlogin != null) {
				if (userlogin.getPassword().equals(password)) {
					authenticated = true;
				} else {
					authenticated = false;
				}
			} else {
				authenticated = false;
			}
		} else {
			authenticated = false;
		}
		return authenticated;
	}
	
	protected boolean checkUserFromSession(String username, 
			String password, HttpSession httpSession) {
		
		boolean authenticated = false;
		if(httpSession != null){
		   User user = (User) httpSession.getAttribute(username);
		   if(user != null) {
			   if(user.getPassword().equals(password)) {
				  authenticated = true;
			   } else {
				   authenticated = false;
			   }
		   }
		}
		return authenticated;
	}

}
