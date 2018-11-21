package com.cg.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;
import java.util.TreeMap;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cg.beans.User;

/**
 * Servlet implementation class LoginPage
 */
public class LoginPage extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginPage() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter printWriter = response.getWriter();

		printWriter.println("<!DOCTYPE html>");
		printWriter.println("<HTML>");
		printWriter.println("<body>");
		printWriter.println("<form method='POST' action = 'DetailsPage'>");

		//input for username
		printWriter.println("<label for = 'username'> Username:");
		printWriter.println("<input type ='text' name ='username'/>");
		printWriter.println("</label>");
		printWriter.println("<br>");

		// input for password
		printWriter.println("<label for = 'password'> Password:");
		printWriter.println("<input type ='password' name ='password'/>");
		printWriter.println("</label>");
		printWriter.println("<br>");

		printWriter.println("<input type='submit'/>");
		printWriter.println("</form>");
		printWriter.println("<a href = 'SignUp'>"  + "Registration" + "</a>");
		printWriter.println("</body>");
		printWriter.println("</html>"); 

	}




	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);


	}

}
