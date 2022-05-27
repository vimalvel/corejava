package com.chainsys.webapp.second;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Welcome
 */
public class Welcome extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Welcome() {
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
		String id = session.getId();
		response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String url ="Welcome";
		String encodedurl=response.encodeURL(url);
		StringBuffer htmloutput = new StringBuffer();
		htmloutput
				.append("<html>\r\n" + "<head>\r\n" + "<meta charset=\"ISO-8859-1\">\r\n" + "<title>Welcome</title>\r\n"
						+ "</head>\r\n" + "<body><form action=' " + encodedurl + " ' method='get'>");
		htmloutput.append("<h1> WELCOME </h1>" + id);
		htmloutput.append("<input type='submit' name='submit' value='Click'/>");
		htmloutput.append("</body></html>");
		out.print(htmloutput);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
