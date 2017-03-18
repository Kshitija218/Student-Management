<%-- <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>

<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<%@ page session="false"%>

<html>

<head>

<title>student Page</title>

<style type="text/css">
.tg {
	border-collapse: collapse;
	border-spacing: 0;
	border-color: #ccc;
}

.tg td {
	font-family: Arial, sans-serif;
	font-size: 14px;
	padding: 10px 5px;
	border-style: solid;
	border-width: 1px;
	overflow: hidden;
	word-break: normal;
	border-color: #ccc;
	color: #333;
	background-color: #fff;
}

.tg th {
	font-family: Arial, sans-serif;
	font-size: 14px;
	font-weight: normal;
	padding: 10px 5px;
	border-style: solid;
	border-width: 1px;
	overflow: hidden;
	word-break: normal;
	border-color: #ccc;
	color: #333;
	background-color: #f0f0f0;
}

.tg .tg-4eph {
	background-color: #f9f9f9
}
</style>

</head>

<body>

	<h1>student registration</h1>







	<form:form action="abc" commandName="studentdata">

<form:input path="id"/><br/>

<form:input path="name"/><br/>

<form:input path="country"/><br/>

</form:form>



	<br />

	<br />

	<br />





	<c:url var="addAction" value="/student/add"></c:url>



	<form:form action="${addAction}" modelAttribute="student">



		<table>

			<c:if test="${!empty student.name}">





			<tr>

				<td>ID</td>

				<td><input type="text" name="studId" value="${student.studId}" /></td>

			</tr>

			</c:if>

			<tr>

				<td>Name</td>

				<td><input type="text" name="studName"
					value="${student.studName}" /></td>

			</tr>
			<tr>
				<td>Age</td>
				<td><input type="text" name="age" path="age" /></td>
			</tr>

			<tr>

				<td colspan="2"><input type="submit"
					value="<spring:message text="sign-up"/>" />
		</table>

	</form:form>



</body>

</html>

 --%>



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
<body  >
	<h1>Registration Form</h1>
	<div class="ex">
		<form:form action="student/add" method="post" modelAttribute="student" style="background-color:gray">
			<table style="with: 50%">
				<tr>
					<td>NAME</td>
					<td><input type="text" name="studName" path="studName" /></td>

				</tr>
				<tr>
					<td>Age</td>
					<td><input type="text" name="age" path="age" /></td>
				</tr>
				
				<tr>
					<td>USERNAME</td>
					<td><input type="text" name="userName" path="userName" /></td>
				</tr>
				<tr>
					<td>PASSWORD</td>
					<td><input type="text" name="password" path="password" /></td>
				</tr>
				<tr>
					<td>QUALIFICATION</td>
					<td><input type="text" name="qlificatoin" path="qlificatoin" /></td>
				</tr>
				
				<tr>
					<td>SELECT LOCATION
						 <select name="address">
							<option>Pune</option>
							<option>Mumbai</option>
							<option>Nanded</option>
							<option>Latur</option>
							</select> <!-- <name ="submit"  path="address" /> -->
					</td>
				</tr>

				<tr>
					 <td>Gender<INPUT TYPE="radio" NAME="gender" path="gender" VALUE="male" CHECKED >
						Male   
						<INPUT TYPE="radio" NAME="gender"  path = "gender"  VALUE="female" >
						Female
						
						</td> 
				</tr>
				
				
				<%-- <td><form:radiobutton path="gender" value="Male" />Male <form:radiobutton
					path="gender" value="Female" />Female
				</td>  --%>
			
				
				

			</table>
			<input type="submit" value="Register" />
		</form:form>
	</div>

</body>
</html>
