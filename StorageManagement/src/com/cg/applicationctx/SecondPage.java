package com.cg.applicationctx;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SecondPage
 */
public class SecondPage extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SecondPage() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter printWriter = response.getWriter();
		ServletContext ctx = getServletContext();
		
		printWriter.println("<!DOCTYPE html>");
		printWriter.println("<HTML>");
		printWriter.println("<body>");
		printWriter.println("<form method='GET' action = 'ThirdPage'>");
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
		printWriter.println("</html>"); 
		
		// store firstname/ lastname throughout application
		ctx.setAttribute("firstname", request.getParameter("firstname"));
		ctx.setAttribute("secondname", request.getParameter("secondname"));
		
				
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
