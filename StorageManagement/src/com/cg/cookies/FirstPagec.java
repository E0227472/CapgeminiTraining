package com.cg.cookies;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FirstPagec
 */
public class FirstPagec extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FirstPagec() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id = request.getSession().getId();
		String url = response.encodeURL("SecondPagec");
		System.out.println(url);
		
		PrintWriter printWriter = response.getWriter();

		printWriter.println("<!DOCTYPE html>");
		printWriter.println("<HTML>");
		printWriter.println("<body>");
		printWriter.println("<form method='GET' action = 'SecondPagec'>");

		//input for firstname
		printWriter.println("<label for = 'firstname'> First Name:");
		printWriter.println("<input type ='text' name ='firstname'/>");
		printWriter.println("</label>");
		printWriter.println("<br>");

		// input for lastname
		printWriter.println("<label for = 'secondname'> Second Name:");
		printWriter.println("<input type ='text' name ='secondname'/>");
		printWriter.println("</label>");
		printWriter.println("<br>");

		printWriter.println("<input type='submit'/>");
		printWriter.println("</form>");
		printWriter.println(id);
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
