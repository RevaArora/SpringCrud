<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="core" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Database query</title>
</head>
<body>
<form:form method="POST" action="insertRecord" commandName="empdata">

		<table>
			<tr>
				<td>Enter name:</td>
				<td><form:input path="name"/></td>
			</tr>
			<tr>
				<td>Enter department :</td>
				<td><form:input path="department" /></td>
			</tr>
			<tr>
				<td><input type="submit" value="Insert Data" /></td>
			</tr>
		</table>
		<h5>${result}</h5>
	</form:form>
	<br>
	<br>
	
  
</body>
</html>