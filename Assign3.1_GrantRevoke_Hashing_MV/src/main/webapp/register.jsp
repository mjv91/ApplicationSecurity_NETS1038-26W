<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration Page</title>
</head>

<body>

<h2>Registration Page</h2>

<form action="RegisterServlet" method="post">

Username:<br>
<input type="text" name="username" required><br><br>

Password:<br>
<input type="password" name="password" required><br><br>

Mobile Number:<br>
<input type="text" name="mobile" required><br><br>

Email ID:<br>
<input type="email" name="email" required><br><br>

<input type="submit" value="Submit">

</form>

</body>
</html>