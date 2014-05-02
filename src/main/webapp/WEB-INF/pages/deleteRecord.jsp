<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Records Deletion</title>
</head>
<body>
	<h2>Select the record to be deleted</h2>
	<form:form commandName="deleteThisData">
		<table>

			<tr>
				<td>Records :</td>
				<td><form:select path="name">
						<form:option value="NONE" label="--- Select ---" />
						<form:options items="${employeeData}" />

					</form:select></td>

			</tr>
			<tr>
				<td><input type="submit"></td>

			</tr>
			<tr>
				<td>
					<h5>${result}</h5>
				<td>
			</tr>
		</table>
	</form:form>

</body>
</html>