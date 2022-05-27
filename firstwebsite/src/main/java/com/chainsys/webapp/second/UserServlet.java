package com.chainsys.webapp.second;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.chainsys.miniproject.pojo.User;

/**
 * Servlet implementation class UserServlet
 */
@WebServlet("/UserServlet")
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public UserServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession(true);
		User userData=new User();
		userData.setUserId("Vimal");
		userData.setPassword("Vimal123");
		session.setAttribute("user", userData);
		String key="user"+session.getId();
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("<form method=post><input type=text name=txt1><p><input type=submit name=btn1 value=ok></form>");
		out.print("<p>User set to session!!!");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession(true);
		if (session==null) {
			out.print("Session not created");
		}
		else {
			String key="user"+session.getId();
			User userData = (User)session.getAttribute("key");
			if(userData == null) {
				out.print("Object removed from session ");
				return;
			}
			out.print("<p>User name :"+userData.getUserId());
			out.print("<p>User Password :"+userData.getPassword());
			session.removeAttribute("User");
		}
		}

}
