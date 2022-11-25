<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
.form1 {
	max-width: 350px;
	margin: 35px auto;
	border-radius: 10px;
	padding: 40px;
	background-color: rgb(214, 234, 250);
	/* margin-top: 50px; */
}


h1 {
	margin: 0 0 30px 0;
	text-align: center;
	margin-top: 5px;
}

input[type='text'], textarea {
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

input[type='file'] {
	background: white;
	border: 1px;
	box-shadow: 1px;
	padding: 5px;
	margin: 2px;
	width: 97%;
}

label {
	margin: 2px;
}

select {
	background: lightsteelblue;
	border: 1px;
	margin-bottom: 25px;
	box-shadow: 1px;
	color: rgb(12, 12, 2);
	background-color: white;
	width: 100%;
	padding: 6px;
	margin: 0;
	height: auto;
	font-size: 15px;
}

input[type='submit'] {
	padding: 8px 16px;
	color: whitesmoke;
	background-color: rgb(44, 159, 44);
	font-size: 15px;
	margin: 5px 0px 0px;
	width: 50%;
	text-align: center;
	border-radius: 5px;
	margin-left: 80px;
}
</style>
</head>

<body>
	<form class="form1" action="addEmployee" method="post">
		<div class="container">
			<center>
			<h4 style="color: red;">${errName}${errCource}${errGender}${errMail}${errPhone}${errDob}${errAddress}${errFile}</h4>
				<h1>Employee Details Form  </h1>
				
			</center>
			<hr>
			<label> Name :</label> <input type="text" name="empName"
				placeholder="Enter full Name" size="15" /> <br> <br>
			<div>
				<label> Course : </label> <select name="empCourse">
					<option value="Course">Course</option>
					<option value="BCA">BCA</option>
					<option value="BBA">BBA</option>
					<option value="B.Tech">B.Tech</option>
					<option value="MBA">MBA</option>
					<option value="MCA">MCA</option>
					<option value="M.Tech">M.Tech</option>
				</select>
			</div>
			<br>
			<div>
				<label> Gender : </label><br> <input type="radio" value="Male"
					name="empGender" checked> Male <input type="radio"
					value="Female" name="empGender"> Female <input type="radio"
					value="Other" name="empGender"> Other

			</div>
			<br> <label for="email">Email:</label> <input type="text"
				placeholder="enter email" name="empMail"> <br>
			<br> <label> Phone : </label> <input type="text"
				name="empPhone" placeholder="phone no." size="10"> <br>
			<br> <label for="dob" style="width: 15px;">Date of
				birth:</label><br> <input type="date" name="empDate"> <br>
			<br> Current Address :
			<textarea name="empAddress" cols="40" rows="2"
				placeholder="Current Address" value="address">
		</textarea>
			<br>
			<br> <label>Attach your Id proof :</label><br> <input
				type="file" id="myFile" name="empFile" size="500"> <br>
			<br> <input type="submit" value="Submit">
	</form>
</body>

</html>