package com.cg.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Servlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		PrintWriter printWriter = response.getWriter();
		
		printWriter.println("<!DOCTYPE html>");
		printWriter.println("<HTML>");
		printWriter.println("<body>");
		printWriter.println("<form method='GET' action = 'Servlet2'>");
		printWriter.println("<input type ='text' name ='msg'/>");
		printWriter.println("<input type='submit'/>");
		printWriter.println("</form>");
		printWriter.println("</body>");
		printWriter.println("</html>"); 
		
		ServletContext ctx = getServletContext();
		ctx.setAttribute("name", request.getParameter("name"));
		ctx.getAttribute("name");
		
		HttpSession session = request.getSession();
		

	}

@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	// TODO Auto-generated method stub
	doGet(req, resp);
}

}
