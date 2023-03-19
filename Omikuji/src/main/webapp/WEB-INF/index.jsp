<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
   <!-- New line below to use the JSP Standard Tag Library -->
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<!-- for Bootstrap CSS -->
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<!-- YOUR own local CSS -->
<link rel="stylesheet" href="/css/style.css"/>
<!-- For any Bootstrap that uses JS -->
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
<title>Omikuji Form</title>
</head>
<body>


	<form action="/omikuji/create" method="post">
	<div>
		<label  for="text"> pick any no. from 5 to 25</label>
		<input type="number" name="number"></input>
	</div>
	<div>
		<label for="text"> Enter the name of the city</label>
		<input type="text" name="city"></input>
	</div>
	<div>
		<label for="text"> Enter the name of any real person</label>
		<input type="text" name="name"></input> 
	</div>
	<div>
		<label for="text"> Enter the professional endeavor or hobby</label>
		<input type="text" name="hobby"></input>
	</div>
	<div>
		<label for="text"> Enter any type of living thing</label>
		<input type="text" name="living"></input>
	</div>
	<div>
		<label for="text"> Say something good to someone</label>
		<textarea name="message" rows="4" cols="50"></textarea>
	</div>
	<button type="submit" class=""> Submit</button>
	</form>




</body>
</html>