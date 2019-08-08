<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>Customers Details</h3>
	<table border="1">
		<thead>
			<tr>
				<th>Id</th>
				<th>Name</th>
				<th>Location</th>
				
			</tr>
		</thead>
		<tbody>
			<c:forEach var="cust" items="${CUSTOMERSLIST}">
				<tr>
					<td>${customers.id}</td>
					<td>${customers.name}</td>
					<td>${customers.location}</td>
					
				</tr>
			</c:forEach>
		</tbody>
	</table>

</body>
</html>