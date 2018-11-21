package com.cg.hiddenfields;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SecondPageh
 */
public class SecondPageh extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public SecondPageh() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter printWriter = response.getWriter();

		String firstname = request.getParameter("firstname");
		String secondname = request.getParameter("secondname");
		printWriter.println("<!DOCTYPE html>");
		printWriter.println("<HTML>");
		printWriter.println("<body>");
		printWriter.println("<form method='GET' action = 'ThirdPageh'>");

		// firstname field
		printWriter.println("<label for = 'firstname'> First Name:");
		printWriter.println(request.getParameter("firstname"));
		printWriter.println("</label>");
		printWriter.println("<br>");

		// secondname field
		printWriter.println("<label for = 'secondname'> Second Name:");
		printWriter.println(request.getParameter("secondname"));
		printWriter.println("</label>");
		printWriter.println("<br>");


		// city field 
		printWriter.println("<label for = 'city'> City:");
		printWriter.println("<input type ='text' name ='city'/>");
		printWriter.println("</label>");
		printWriter.println("<br>");

		// country field 
		printWriter.println("<label for = 'country'> Country:");
		printWriter.println("<input type ='text' name ='country'/>");
		printWriter.println("</label>");
		printWriter.println("<br>");
		printWriter.println("<input type='submit'/>");
		
		//hidden firstname
		printWriter.print("<input type='hidden' name='hiddenfirstname'" +
				" value='" + firstname + "'>");

		// hidden secondname
		printWriter.print("<input type='hidden' name='hiddensecondname'" +
				" value='" + secondname + "'>");


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
