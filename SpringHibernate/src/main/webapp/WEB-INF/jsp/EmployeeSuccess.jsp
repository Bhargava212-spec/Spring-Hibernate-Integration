<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
table {
  font-family: arial, sans-serif;
  border-collapse: collapse;
  width: 100%;
}

td, th {
  border: 1px solid #dddddd;
  text-align: left;
  padding: 8px;
}

tr:nth-child(even) {
  background-color: #dddddd;
}
</style>
</head>
<body>
<h2>Employee Details</h2>
<table>
<tr>
    <th> Employee Id </th>
    <th> Name </th>
    <th> Age </th>
    <th> Address </th>
    <th> Gender </th>
    <th> Date Of Join </th>
    <th> Email </th>
    <th> Action </th>
          
</tr>
<c:forEach items="${employeeList}" var="employee">
<tr>
   <td>${employee.employeeid}</td>
    <td>${employee.name}</td>
    <td>${employee.age}</td>
    <td>${employee.address}</td>
    <td>${employee.gender}</td>
    <td>${employee.doj}</td>
    <td>${employee.email}</td>
    <td>
    	<a href="<c:url value='/fetchById/${employee.employeeid}'/>" >
    		<svg enable-background="new 0 0 45 45" height="45px" id="Layer_1" version="1.1" viewBox="0 0 45 45" width="45px" xml:space="preserve" xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink"><g><rect fill="#231F20" height="23" transform="matrix(-0.7071 -0.7072 0.7072 -0.7071 38.2666 48.6029)" width="11" x="23.7" y="4.875"/><path d="M44.087,3.686l-2.494-2.494c-1.377-1.377-3.61-1.377-4.987,0L34.856,2.94l7.778,7.778l1.749-1.749   C45.761,7.593,45.465,5.063,44.087,3.686z" fill="#231F20"/><polygon fill="#231F20" points="16,22.229 16,30 23.246,30  "/><path d="M29,40H5V16h12.555l5-5H3.5C1.843,11,0,11.843,0,13.5v28C0,43.156,1.843,45,3.5,45h28   c1.656,0,2.5-1.844,2.5-3.5V23.596l-5,5V40z" fill="#231F20"/></g></svg>
    	 </a>
    	<a href="<c:url value='/deleteEmp/${employee.employeeid}'/>" >
    		<svg version="1.1" id="Capa_1" xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink" x="0px" y="0px"
				 width="25px" height="25px" viewBox="0 0 488.936 488.936" style="enable-background:new 0 0 488.936 488.936;"
			     xml:space="preserve">
				<g>
					<g>
						<path d="M381.16,111.948H107.376c-6.468,0-12.667,2.819-17.171,7.457c-4.504,4.649-6.934,11.014-6.738,17.477l9.323,307.69
							c0.39,12.92,10.972,23.312,23.903,23.312h20.136v-21.012c0-24.121,19.368-44.049,43.488-44.049h127.896
							c24.131,0,43.893,19.928,43.893,44.049v21.012h19.73c12.933,0,23.52-10.346,23.913-23.268l9.314-307.7
							c0.195-6.462-2.234-12.863-6.738-17.513C393.821,114.767,387.634,111.948,381.16,111.948z"/>
						<path d="M309.166,435.355H181.271c-6.163,0-11.915,4.383-11.915,11.516v30.969c0,6.672,5.342,11.096,11.915,11.096h127.895
							c6.323,0,11.366-4.773,11.366-11.096v-30.969C320.532,440.561,315.489,435.355,309.166,435.355z"/>
						<path d="M427.696,27.106C427.696,12.138,415.563,0,400.591,0H88.344C73.372,0,61.239,12.138,61.239,27.106v30.946
							c0,14.973,12.133,27.106,27.105,27.106H400.59c14.973,0,27.105-12.133,27.105-27.106L427.696,27.106L427.696,27.106z"/>
					</g>
				</g>
			</svg>
    	 </a>
    </td>
</tr>
</c:forEach>
</table>

</body>
</html>