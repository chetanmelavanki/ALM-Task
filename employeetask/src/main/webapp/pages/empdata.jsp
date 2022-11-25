<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
a {
	color: red;
}
table, th, td {
	border: 1px solid black;
	margin-left: auto;
	margin-right: auto;
}
body {
	text-align: center;
	background:white;
}
</style>
</head>
<body>
<h2>${errData}</h2>
    <h1>Employee Detail</h1>
	<table>
		<tr>
			<th>Emp_Name</th>
			<th>Emp_Course</th>
			<th>Emp_Gender</th>
			<th>Emp_Email</th>
			<th>Emp_Phone_No</th>
			<th>Emp_Dob</th>
			<th>Emp_Address</th>
			<th>Emp_File</th>
		</tr>
		<tr>
			<td>${empName}</td>
			<td>${empCourse}</td>
			<td>${empGender}</td>
			<td>${empEmail}</td>
			<td>${empPhone}</td>
			<td>${empDob}</td>
			<td>${empAddress}</td>
			<td>${empFile}</td>
		</tr>
	</table>
	<br>
</body>
</html>