<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h3>CUSTOMER Info</h3>
	<form action="save" method="post">
		<table border="1">

			<tbody>
				<tr>
					<td>Id</td>
					<td><input type="text" name="id" value="${CUSTOMER.id}"
						readonly="readonly"></td>
				</tr>
				<tr>
					<td>Name</td>
					<td><input type="text" name="name" value="${CUSTOMER.name}"></td>
				</tr>
				<tr>
					<td>Location</td>
					<td><input type="text" name="location" value="${CUSTOMER.location}"></td>
				</tr>
				
			</tbody>
		</table>
		<input type="submit" value="update">
	</form>
</body>
</html>