<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>



<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
form {
	max-width: 240px;
	margin: 35px auto;
	border-radius: 10px;
	padding: 30px;
	background-color: rgb(214, 234, 250);
	margin-top: 100px;
    text-align: center;
}

input[type='text'] {
	background: lightsteelblue;
	border: 1px;
	margin-bottom: 25px;
	box-shadow: 1px;
	color: rgb(13, 13, 12);
	background-color: white;
	width: 97%;
	padding: 7px;
	margin: 2px;
	height: auto;
	font-size: 15px;
}

input[type='submit'] {
	padding: 8px 16px;
	color: whitesmoke;
	background-color: rgb(44, 159, 44);
	font-size: 14px;
	margin: 5px 0px 0px;
	width: 40%;
	text-align: center;
	border-radius: 5px;
}
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
	<h1 style="color: green; text-align: center;">${eSave}${noEmp}</h1>
	<div>
		<form action="getEmployee">
		<h3 style="color: red;">${errFetch}</h3>
		<label><b>Enter employee id to fetch deatils:</b></label>
        <br>  
			<input type="text" name="empId"><br> <input
				type="submit">
		</form>
	</div>
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
			<tbody>	
				<td>${empName}</td>
				<td>${empCourse}</td>
				<td>${empGender}</td>
				<td>${empEmail}</td>
				<td>${empPhone}</td>
				<td>${empDob}</td>
				<td>${empAddress}</td>
				<td><a th:href="@{/download_document}">download</a> </td>
			</tbody>
		</tr>
	</table>
	
	<div>
		<form action="updateEmployeeByEmpId">
		<h4 style="color: green;">${updateEmp}</h4>
			
				<div><label for=""><h3>Enter employee id to update emp:</h3></label>
					<input type="text" name="empId">
				</div>
				<div><label for="">Enter employee name:</label>
					<input type="text" name="empName" value="${empName}">
				</div>
				<div><label for="">Enter employee course:</label>
					<input type="text" name="empCourse" value="${empCourse}">
				</div>
				<div><label for="">Enter employee gender:</label>
					<input type="text" name="empGender" value="${empGender}">
				</div>
				<div><label for="">Enter employee mail:</label>
					<input type="text" name="empMail" value="${empEmail}">
				</div>
				<div><label for="">Enter employee phone:</label>
					<input type="text" name="empPhone" value="${empPhone}">
				</div>
				<div><label for="">Enter employee dob:</label>
					<input type="date" name="empDate" >
				</div>
				<div><label for="">Enter employee address:</label>
					<input type="text" name="empAddress" value="${empAddress}">
				</div>
				<div><label for="">attach file:</label>
					<input type="file" name="empFile">
				</div>
				<div>
					<input type="submit" value="submit">
				</div>
		</form>
	</div>
		<div>
		<form action="deleteEmployeById">
		<h4 style="color: red;">${empDelete}</h4>
		<label><b>Enter employee id to delete deatils:</b></label>
        <br>  
			<input type="text" name="dltEmpId"><br> <input
				type="submit">
		</form>
	</div>
</body>
</html>