package com.cg.hiddenfields;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ThirdPageh
 */
public class ThirdPageh extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ThirdPageh() {
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
		printWriter.println("<form method='GET' action = 'ForthPageh'>");

		// firstname field
		printWriter.println("<label for = 'firstname'> First Name:");
		printWriter.println(request.getParameter("hiddenfirstname"));
		printWriter.println("</label>");
		printWriter.println("<br>");

		// secondname field
		printWriter.println("<label for = 'secondname'> Second Name:");
		printWriter.println(request.getParameter("hiddensecondname"));
		printWriter.println("</label>");
		printWriter.println("<br>");

		//hidden firstname
		printWriter.println("<input type ='hidden' name ='firstname' value = ''/>");
		printWriter.println("<br>");

		// hidden secondname
		printWriter.println("<input type ='hidden' name ='secondname' "
				+ "value = 'request.getParameter(\"secondname\")'/>");
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

		//hidden city
		printWriter.println("<input type ='hidden' name ='city' "
				+ "value = 'request.getParameter(\"city\")'/>");
		printWriter.println("<br>");

		// hidden country
		printWriter.println("<input type ='hidden' name ='country' "
				+ "value = 'request.getParameter(\"country\")'/>");
		printWriter.println("<br>");

		//input for Email
		printWriter.println("<label for = 'email'> Email:");
		printWriter.println("<input type ='text' name ='email'/>");
		printWriter.println("</label>");
		printWriter.println("<br>");

		// input for Phone
		printWriter.println("<label for = 'phone'> Phone:");
		printWriter.println("<input type ='text' name ='phone'/>");
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
