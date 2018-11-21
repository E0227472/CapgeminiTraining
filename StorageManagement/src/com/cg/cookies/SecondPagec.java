package com.cg.cookies;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SecondPagec
 */
public class SecondPagec extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SecondPagec() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id = request.getSession().getId();
		String url = response.encodeURL("ThirdPagec");
		
		PrintWriter printWriter = response.getWriter();
		printWriter.println("<!DOCTYPE html>");
		printWriter.println("<HTML>");
		printWriter.println("<body>");
		printWriter.println("<form method='GET' action = 'ThirdPagec'>");
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
		printWriter.println("</form>");
		printWriter.println("</body>");
		printWriter.println(id);
		printWriter.println("</html>"); 
		
		// Creating cookie object and storing data into the constructor
		Cookie ck1  = new Cookie("firstname", request.getParameter("firstname"));
		Cookie ck2 = new Cookie("secondname", request.getParameter("secondname"));
		
	
		response.addCookie(ck1);
		response.addCookie(ck2);
		
		

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
