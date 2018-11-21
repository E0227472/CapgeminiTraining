package com.cg.cookies;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ThirdPagec
 */
public class ThirdPagec extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ThirdPagec() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getSession().getId();
		String url = response.encodeURL("ForthPagec");
		
		
		PrintWriter printWriter = response.getWriter();
		
		Cookie ck[] = request.getCookies();
		String firstname = null;
		String secondname = null;
		
		for(Cookie cookie: ck) {
		if(cookie.getName().equals("firstname")) firstname = cookie.getValue();
		if(cookie.getName().equals("secondname")) secondname = cookie.getValue();
		}

		printWriter.println("<!DOCTYPE html>");
		printWriter.println("<HTML>");
		printWriter.println("<body>");
		printWriter.println("<form method='GET' action = 'ForthPagec'>");
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

		// input for Phone
		printWriter.println("<label for = 'phone'> Phone:");
		printWriter.println("<input type ='text' name ='phone'/>");
		printWriter.println("</label>");
		printWriter.println("<br>");


		printWriter.println("<input type='submit'/>");
		printWriter.println("</form>");
		printWriter.println(id);
		printWriter.println("</body>");
		printWriter.println("</html>"); 


		//store city/country Creating cookie object and storing data into the constructor
		Cookie ck3  = new Cookie("city", request.getParameter("city"));
		Cookie ck4 = new Cookie("country", request.getParameter("country"));

		response.addCookie(ck3);
		response.addCookie(ck4);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
