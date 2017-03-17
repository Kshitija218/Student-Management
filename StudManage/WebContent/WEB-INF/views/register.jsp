<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page session="false" %>
<html>
<head>
	<title>student Page</title>
	<style type="text/css">
		.tg  {border-collapse:collapse;border-spacing:0;border-color:#ccc;}
		.tg td{font-family:Arial, sans-serif;font-size:14px;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:#ccc;color:#333;background-color:#fff;}
		.tg th{font-family:Arial, sans-serif;font-size:14px;font-weight:normal;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:#ccc;color:#333;background-color:#f0f0f0;}
		.tg .tg-4eph{background-color:#f9f9f9}
	</style>
</head>
<body>
<h1>
	student registration
</h1>



<%-- <form:form action="abc" commandName="studentdata">
<form:input path="id"/><br/>
<form:input path="name"/><br/>
<form:input path="country"/><br/>
</form:form>
 --%>
<br/>
<br/>
<br/>


<c:url var="addAction" value="/student/add" ></c:url>

<form:form action="${addAction}" modelAttribute="student">

<table>
	<%-- <c:if test="${!empty student.name}"> --%>
	
	
	<tr>
		<td>ID</td>
		<td><input type="text" name="studId" value="${student.studId}"/></td>
	</tr>
	<%-- </c:if> --%>
	<tr>
		<td>Name</td>
		<td><input type="text" name="studName" value="${student.studName}"/></td>
	</tr>
	<tr>
	<td colspan="2">
	<input type="submit" value= "<spring:message text="sign-up"/>" />
	
</table>	
</form:form>

</body>
</html>
