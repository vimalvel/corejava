<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"
	import="java.util.List,com.chainsys.jspproject.pojo.Employee,java.util.ArrayList"
	import="com.chainsys.jspproject.dao.EmployeeDao"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>AllEmployee</title>
</head>
<body>
	<table>
		<thead>All Employee
		</thead>
		<%
		List<Employee> allEmployee = EmployeeDao.getAllEmployee();
		for (Employee emp : allEmployee) {
		%>
		<tr>
			<td><%=emp.getEmp_id()%></td>
			<td><%=emp.getFirst_name()%></td>
			<td><%=emp.getLast_name()%></td>
			<td><%=emp.getEmail()%></td>
			<td><%=emp.getJob_id()%></td>
			<td><%=emp.getSalary()%></td>
		</tr>
		<%
		}
		%>
	</table>
</body>
</html>