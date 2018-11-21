package com.cg.hiddenfields;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ForthPageh
 */
public class ForthPageh extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ForthPageh() {
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
		printWriter.println("<form method='GET' action = ''>");
		// firstname field
		printWriter.println("<label for = 'firstname'> First Name:");
		printWriter.println(firstname);
		printWriter.println("</label>");
		printWriter.println("<br>");

		// secondname field
		printWriter.println("<label for = 'secondname'> Second Name:");
		printWriter.println(secondname);
		printWriter.println("</label>");
		printWriter.println("<br>");

		// city field 
		printWriter.println("<label for = 'city'> City:");
		printWriter.println(city);
		printWriter.println("</label>");
		printWriter.println("<br>");

		// country field 
		printWriter.println("<label for = 'country'> Country:");
		printWriter.println(country);
		printWriter.println("</label>");
		printWriter.println("<br>");

		//Email field
		printWriter.println("<label for = 'email'> Email:");
		printWriter.println(request.getParameter("email"));
		printWriter.println("</label>");
		printWriter.println("<br>");

		// phone field
		printWriter.println("<label for = 'phone'> Phone:");
		printWriter.println(request.getParameter("phone"));
		printWriter.println("</label>");
		printWriter.println("<br>");



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
