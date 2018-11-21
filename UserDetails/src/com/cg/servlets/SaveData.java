package com.cg.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cg.beans.User;

/**
 * Servlet implementation class SaveData
 */
public class SaveData extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public SaveData() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter printWriter = response.getWriter();
		User user = new User();
		//		user.setUsername(request.getParameter("username"));
		//		user.setUsername(request.getParameter("password"));
		//		user.setUsername(request.getParameter("lastname"));
		//		user.setUsername(request.getParameter("city"));
		//		user.setUsername(request.getParameter("country"));
		user.setUsername("ss");
		user.setUsername("ss");
		user.setUsername("ss");
		user.setUsername("ss");
		user.setUsername("ss");
//		ServletContext ctx = getServletContext();
//		MapStorage mp = (MapStorage) ctx.getAttribute("userdata");
//		TreeMap<String, User> storeUsers = mp.getMapStorage();
//		storeUsers.put("ss", user);
//		MapStorage newmp = new MapStorage(storeUsers);
//		ctx.setAttribute("userdata", newmp);
		
		HttpSession httpSession = request.getSession();
		httpSession.setAttribute("user", user);





		printWriter.println("<p>Successfully created new user</p>");
		printWriter.println("<a href = 'LoginPage'>"  + "Back to Login" + "</a>");	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
