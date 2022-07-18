package com.chainsys.jspproject;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.chainsys.jspproject.commonutil.ExceptionManager;
import com.chainsys.jspproject.commonutil.InvalidInputDataException;
import com.chainsys.jspproject.commonutil.Validator;
import com.chainsys.jspproject.dao.EmployeeDao;
import com.chainsys.jspproject.pojo.Employee;

/**
 * Servlet implementation class Update
 */
@WebServlet("/Update")
public class Update extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Update() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String source = "Update Employee";
		String message = "<h1>Error while " + source + "</h1>";
		Employee newemp = null;
		int result = 0;
		int empId = 0;
//		String testname = null;
		try {
			newemp = new Employee();
			String id = request.getParameter("id");
			try {
				Validator.checkStringForParseInt(id);
			} catch (InvalidInputDataException err) {
				message += "Message: " + err.getMessage();
				String errorPage = ExceptionManager.handleException(err, source, message);
				out.print(errorPage);
				return;
			}
			empId = Integer.parseInt(id);
			try {
				Validator.CheckNumberForGreaterThanZero(empId);
			} catch (InvalidInputDataException err) {
				message += "Message: " + err.getMessage();
				String errorPage = ExceptionManager.handleException(err, source, message);
				out.print(errorPage);
				return;
			}
			newemp.setEmp_id(empId);
			String fname = request.getParameter("fname");
			try {
				Validator.checkStringOnly(fname);
			} catch (InvalidInputDataException e) {
				message += "Message: " + e.getMessage();
				String errorPage = ExceptionManager.handleException(e, source, message);
				out.print(errorPage);
				return;
			}
			try {
				Validator.checklengthOfString(fname);
			} catch (InvalidInputDataException err) {
				message += "Message: " + err.getMessage();
				String errorPage = ExceptionManager.handleException(err, source, message);
				out.print(errorPage);
				return;
			}
			newemp.setFirst_name(fname);
			String lname = request.getParameter("lname");
			try {
				Validator.checkStringOnly(lname);
			} catch (InvalidInputDataException e) {
				message += "Message: " + e.getMessage();
				String errorPage = ExceptionManager.handleException(e, source, message);
				out.print(errorPage);
				return;
			}
			try {
				Validator.checklengthOfString(lname);
			} catch (InvalidInputDataException err) {
				message += "Message: " + err.getMessage();
				String errorPage = ExceptionManager.handleException(err, source, message);
				out.print(errorPage);
				return;
			}
			newemp.setLast_name(lname);
			String email = request.getParameter("email");
			try {
				Validator.checkEmail(email);
			} catch (InvalidInputDataException e) {
				message += "Message: " + e.getMessage();
				String errorPage = ExceptionManager.handleException(e, source, message);
				out.print(errorPage);
				return;
			}
			newemp.setEmail(email);
			SimpleDateFormat hire_dateFormate = new SimpleDateFormat("dd/MM/yyyy");
			String emp_HireDate = request.getParameter("date");
			// Date hire_date=hire_dateFormate.parse(emp_HireDate);

			Date newDate = null;
			try {
				newDate = hire_dateFormate.parse(emp_HireDate);
			} catch (ParseException e) {
				message += "Message: " + e.getMessage();
				String errorPage = ExceptionManager.handleException(e, source, message);
				out.print(errorPage);
				return;
			}

			newemp.setHire_date(newDate);
			String jobId = request.getParameter("jobid");
			try {
				Validator.checkJobId(jobId);
			} catch (InvalidInputDataException err) {
				message += "Message: " + err.getMessage();
				String errorPage = ExceptionManager.handleException(err, source, message);
				out.print(errorPage);
				return;
			}
			newemp.setJob_id(jobId);
			String sal = request.getParameter("salary");
			try {
				Validator.checkStringForParseInt(sal);
			} catch (InvalidInputDataException err) {
				message += "Message: " + err.getMessage();
				String errorPage = ExceptionManager.handleException(err, source, message);
				out.print(errorPage);
				return;
			}
			float salParse = Float.parseFloat(sal);
			try {
				Validator.CheckNumberForGreaterThanZero(salParse);
			} catch (InvalidInputDataException err) {
				message += "Message: " + err.getMessage();
				String errorPage = ExceptionManager.handleException(err, source, message);
				out.print(errorPage);
				return;
			}
			newemp.setSalary(salParse);
			result = EmployeeDao.updateEmployee(newemp);
		} catch (Exception e) {
			message += "Message: " + e.getMessage();
			String errorPage = ExceptionManager.handleException(e, source, message);
			out.print(errorPage);
			return;
		} finally {
		}
		request.setAttribute("result",result);
		RequestDispatcher rd = request.getRequestDispatcher("/updateemployee.jsp");
		rd.forward(request, response);	}
	}

