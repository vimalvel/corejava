package com.chainsys.app.dynamicproject;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AttributesDemo
 */
public class AttributesDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AttributesDemo() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.getWriter().append("Served at:").append(request.getContextPath());

	}

	public String salary = null;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		 PrintWriter out=response.getWriter();
	        response.setContentType("text/html");
	        out.println("<html><head><title>Attributes</title></head><body>");
	        String submitValue=request.getParameter("submit");
	        if(submitValue.equals("set"))
	        {
	        
	        String salaryInuput=request.getParameter("salary");
	        salary=salaryInuput;
	       // System.out.println("salary input "+salaryInuput);
	        out.println("<h1>value set</h1>"+salary);
	        }else if(submitValue.equals("fetch"))
	        {
	            out.println("<h1>value fetched</h1>"+salary);
	        }
	        out.println("</body></html>");
    }
}
