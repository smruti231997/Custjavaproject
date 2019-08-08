<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>add customer</title>
</head>
<body>
<h3>Enter Customer details</h3>

	<form action="cust/save" method="post">
		<table border=2>


			<tr>
				<th>Customer Id<input style="align: left;" type="text" name="id"
					required autofocus /></th>
			</tr>
			<br>
			<tr>
				<th>Customer Name<input type="text" name="name" required
					autofocus /></th>
			<tr>
				<br>
			<tr>
				<th>Customer Location <input type="radio" name="location"
					value="Cuttack"> Cuttack <input type="radio"
					name="location" value="Bhubaneswar">Bhubaneswar <input
					type="radio" name="location" value="Balasore"> Balasore <input
					type="radio" name="location" value="Khorda"> Khorda
				</th>
			</tr>
			<br>
			
			<tr>
				<th><input type="submit" value="Add customer"></th>
			</tr>

		</table>
	</form>
</body>
</html>