<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h3>customer Info</h3>
	<table border="1">
		<thead>
			<tr>
				<th>Id</th>
				<th>Name</th>
				<th>Location</th>
				
			</tr>
		</thead>
		<tbody>
			<tr>
				<td>${CUSTOMER.id}</td>
				<td>${CUSTOMER.name}</td>
				<td>${CUSTOMER.location}</td>
				
			</tr>
		</tbody>
	</table>
</body>
</html>