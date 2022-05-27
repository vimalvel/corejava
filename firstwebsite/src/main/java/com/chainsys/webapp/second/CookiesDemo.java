package com.chainsys.webapp.second;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class CookiesDemo
 */
public class CookiesDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CookiesDemo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		Cookie [] allCookies= request.getCookies();
		if(allCookies==null) {
			System.out.println("no Cookies found");
			return;
		}
		int cookielength = allCookies.length;
		for(int i=0;i<cookielength;i++) {
			System.out.println(allCookies [i].getName()+" "+allCookies[i].getValue());
			
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	HttpSession session = request.getSession(true);
	Cookie firstCookie = new Cookie("Captain","Rohit");

	// if the value is zero or less than zero than the cookie will deleted.
	// if the value is positive then the cookie will expire after the specified seconds (in seconds)
	response.addCookie(firstCookie);
	Cookie secondCookie = new Cookie("Captain","Sachin");
	
	response.addCookie(secondCookie);
	Cookie thirdCookie = new Cookie("Captain","Dhoni");
	response.addCookie(thirdCookie);
	Cookie fourthCookie = new Cookie("Captain","Pandya");
	response.addCookie(fourthCookie);
	}
	

}
