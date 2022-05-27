package com.chainsys.app.dynamicproject;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloWorld
 */
public class HelloWorld extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public HelloWorld() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
		out.println("<html><head><title>HelloWorld</title></head><body>");
		  			out.println("<h1> <br><center>");
		  			out.println("<br><h1 style=\"background-color:tomato;\">VIMAL</h1><p style=\"font-size:48px\">\r\n"
		  					+ "&#128512; &#128516; &#128525; &#128151;\r\n"
		  					+ "</p ");
		  			out.println(" <br></center></h1></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
