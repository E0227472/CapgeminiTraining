package com.cg.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SignUp
 */
public class SignUp extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public SignUp() {
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
		printWriter.println("<form method='POST' action = 'SaveData'>");

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

		// input for firstname
		printWriter.println("<label for = 'firstname'> FirstName:");
		printWriter.println("<input type ='text' name ='firstname'/>");
		printWriter.println("</label>");
		printWriter.println("<br>");

		// input for lastname
		printWriter.println("<label for = 'lastname'> LastName:");
		printWriter.println("<input type ='text' name ='lastname'/>");
		printWriter.println("</label>");
		printWriter.println("<br>");

		// input for city
		printWriter.println("<label for = 'city'> City:");
		printWriter.println("<input type ='text' name ='city'/>");
		printWriter.println("</label>");
		printWriter.println("<br>");
		
		// input for country
		printWriter.println("<label for = 'country'> Country:");
		printWriter.println("<input type ='text' name ='country'/>");
		printWriter.println("</label>");
		printWriter.println("<br>");

		printWriter.println("<input type='submit'/>");
		printWriter.println("</form>");
		printWriter.println("</body>");
		printWriter.println("</html>"); 
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
