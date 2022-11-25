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
</style>
</head>
<body>
	<h1 style="color: green; text-align: center;">${eSave}</h1>
	<div>
		<form action="getEmployee">
		<label><b>Enter employee id to fetch deatils:</b></label>
        <br>  
			<input type="text" name="empId"><br> <input
				type="submit">
		</form>
	</div>
</body>
</html>