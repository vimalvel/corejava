<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    import="com.chainsys.jspproject.commonutil.ExceptionManager"
	import="com.chainsys.jspproject.commonutil.Validator,com.chainsys.jspproject.commonutil.InvalidInputDataException"
	import="com.chainsys.jspproject.dao.EmployeeDao,com.chainsys.jspproject.pojo.Employee"
	import="java.text.ParseException,java.text.SimpleDateFormat"
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Employee</title>
</head>
<body>
<% 
String source="UpdateEmployee";
		String message="<h1>Error while "+source+"</h1>";
		Employee emp = new Employee();
		try {
			String emp_id = request.getParameter("id");
			try {
				Validator.checkStringForParseInt(emp_id);
			} catch (InvalidInputDataException e) {
				message +=" Error in Employee id input </p>";
				String errorPage=ExceptionManager.handleException(e, source, message);
				%><h1><%=errorPage%></h1><%
				return;
			}
			int id = Integer.parseInt(emp_id);
			try {
				Validator.CheckNumberForGreaterThanZero(id);
			} catch (InvalidInputDataException e) {
				message +=" Error in Employee id input </p>";
				String errorPage=ExceptionManager.handleException(e, source, message);
				%><h1><%=errorPage%></h1><%
				return;
			}
			emp.setEmp_id(id);
			String emp_Firstname = request.getParameter("fname");
			try {
				Validator.checkStringOnly(emp_Firstname);
			} catch (InvalidInputDataException e) {
				message +=" Error in First Name input </p>";
				String errorPage=ExceptionManager.handleException(e, source, message);
				%><h1><%=errorPage%></h1><%
				return;
			}
			emp.setFirst_name(emp_Firstname);
			String emp_LastName = request.getParameter("Lname");
			try {
				Validator.checkStringOnly(emp_LastName);
			} catch (InvalidInputDataException e) {
				message +=" Error in Lat Name input </p>";
				String errorPage=ExceptionManager.handleException(e, source, message);
				%><h1><%=errorPage%></h1><%
				return;
			}
			emp.setLast_name(emp_LastName);
			String emp_email = request.getParameter("email");
			try {
				Validator.checkEmail(emp_email);
			} catch (InvalidInputDataException e) {
				message +=" Error in email input </p>";
				String errorPage=ExceptionManager.handleException(e, source, message);
				%><h1><%=errorPage%></h1><%
				return;
			}
			emp.setEmail(emp_email);
			SimpleDateFormat hire_dateFormate = new SimpleDateFormat("dd/MM/yyyy");
			String emp_HireDate = request.getParameter("hdate");
			// Date hire_date=hire_dateFormate.parse(emp_HireDate);
			try {
				Validator.checkDate(emp_HireDate);
				Validator.checkHireDate(emp_HireDate);
			} catch (InvalidInputDataException e) {
				message +=" Error in Hire Date input </p>";
				String errorPage=ExceptionManager.handleException(e, source, message);
				%><h1><%=errorPage%></h1><%
				return;
			}
			try {
				emp.setHire_date(hire_dateFormate.parse(emp_HireDate));
			} catch (ParseException e) {
				message +=" Error in Hire Date input </p>";
				String errorPage=ExceptionManager.handleException(e, source, message);
				%><h1><%=errorPage%></h1><%
				return;
			}
			String emp_Job_id = request.getParameter("jobid");
			try {
				Validator.checkJobId(emp_Job_id);
			} catch (InvalidInputDataException e) {
				message +=" Error in Job Id input </p>";
				String errorPage=ExceptionManager.handleException(e, source, message);
				%><h1><%=errorPage%></h1><%
				return;
				
			}
			emp.setJob_id(emp_Job_id);
			String emp_salary = request.getParameter("salary");
			try {
				Validator.checkFloat(emp_salary);
			} catch (InvalidInputDataException e) {
				message +=" Error in salary input </p>";
				String errorPage=ExceptionManager.handleException(e, source, message);
				%><h1><%=errorPage%></h1><%
				return;
				
			}
			float salary = Float.parseFloat(emp_salary);
			emp.setSalary(salary);
			int result = EmployeeDao.updateEmployee(emp);
			%><h1><%=result%> row Updated</h1><%
		} catch (Exception e) {
			message +=" Error while inserting record </p>";
			String errorPage=ExceptionManager.handleException(e, source, message);
			%><h1><%=errorPage%></h1><%
			return;
		}
		%>
</body>
</html>