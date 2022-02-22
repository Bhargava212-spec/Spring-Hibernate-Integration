<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Updation Page</title>
</head>
<body>
<h3>Employee Updation Details</h3>
<c:url var="updateaction" value="/updateEmp"/>
<form:form action="${updateaction}" method="post" modelAttribute="editForm">
<table>
<tr>
   <td>Employee Id:</td>
   <td><form:input type="text" path="employeeid" readonly="true"/></td>
</tr>
<tr>
   <td>Employee Name:</td>
   <td><form:input type="text" path="name" /><font color="red"><form:errors path="name"/></font></td>
</tr>
<tr>
   <td>Age:</td>
   <td><form:input type="text" path="age" readonly="true"/></td>
</tr>
<tr>
   <td>Address:</td>
   <td><form:input type="text" path="address"/><font color="red"><form:errors path="age"/></font></td>
</tr>
<tr>
   <td>Gender:</td>
   <td><form:radiobutton path="gender" value="male" onclick="return false"/>Male
       <form:radiobutton path="gender" value="female" onclick="return false"/>Female
   </td>
 <tr>
   <td>Date of join:</td>
   <td><form:input type="text" path="doj"/><font color="red"><form:errors path="doj"/></font></td>
</tr>
<tr>
   <td>Email:</td>
   <td><form:input type="text" path="email"/><font color="red"><form:errors path="email"/></font></td>
</tr>
<tr>
     <td><input type="submit" value="Update Employee"/></td>
 </tr>
   </table>
</form:form>
</body>
</html>