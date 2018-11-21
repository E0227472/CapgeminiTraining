package com.cg.httpsession;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ThirdPageS
 */
public class ThirdPageS extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ThirdPageS() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter printWriter = response.getWriter();
		// using session to store data temp
		HttpSession session=request.getSession();

		printWriter.println("<!DOCTYPE html>");
		printWriter.println("<HTML>");
		printWriter.println("<body>");
		printWriter.println("<form method='GET' action = 'ForthPagesS'>");
		// firstname field
		printWriter.println("<label for = 'firstname'> First Name:");
		printWriter.println(session.getAttribute("firstname"));
		printWriter.println("</label>");
		printWriter.println("<br>");

		// secondname field
		printWriter.println("<label for = 'secondname'> Second Name:");
		printWriter.println(session.getAttribute("secondname"));
		printWriter.println("</label>");
		printWriter.println("<br>");

		// city field 
		printWriter.println("<label for = 'city'> City:");
		printWriter.println(request.getParameter("city"));
		printWriter.println("</label>");
		printWriter.println("<br>");

		// country field 
		printWriter.println("<label for = 'country'> Country:");
		printWriter.println(request.getParameter("country"));
		printWriter.println("</label>");
		printWriter.println("<br>");

		//input for Email
		printWriter.println("<label for = 'email'> Email:");
		printWriter.println("<input type ='text' name ='email'/>");
		printWriter.println("</label>");
		printWriter.println("<br>");

		// input for password
		printWriter.println("<label for = 'password'> Password:");
		printWriter.println("<input type ='password' name ='password'/>");
		printWriter.println("</label>");
		printWriter.println("<br>");


		printWriter.println("<input type='submit'/>");
		printWriter.println("</form>");
		printWriter.println("</body>");
		printWriter.println("</html>"); 

		// store city/country throughout session
		session.setAttribute("city", request.getParameter("city"));
		session.setAttribute("country", request.getParameter("country"));
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
