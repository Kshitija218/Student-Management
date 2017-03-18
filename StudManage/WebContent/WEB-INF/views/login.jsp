<%@page isELIgnored="false"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page session="false"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User Data</title>
</head>
<style>
div.ex {
	text-align: right width:300px;
	padding: 10px;
	/* border: 5px solid grey; */
	margin: 0px

}
</style>
<body >
	<h1>Login Form</h1>
	<div class="ex">
		<form:form action="student/login" method="post" modelAttribute="studentLogin">
			<table style="with: 50%">
								<tr>
					<td>USERNAME</td>
					<td><input type="text" name="userName" path="userName" /></td>
				</tr>
				<tr>
					<td>PASSWORD</td>
					<td><input type="password" name="password" path="password" /></td>
				</tr>
				
			</table>
			<input type="submit" value="Login" />
		</form:form>
	</div>

</body>
</html>
