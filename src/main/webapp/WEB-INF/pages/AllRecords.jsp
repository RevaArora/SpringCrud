<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>All records from EMP table</title>
</head>
<body>

	<h2>Submitted Student Information</h2>
	<%-- <h6>${employeeData}</h6> --%>
	<table border="1" align="center">
		<tr>
			<td>Name       </td>
			<td>Department </td>
		</tr>
	
		<c:forEach items="${employeeData}" var="employee">
			<tr>
				<td>${employee.name}</td>
				<td>${employee.department}</td>
			</tr>
		</c:forEach>

	</table>
</body>
</html>