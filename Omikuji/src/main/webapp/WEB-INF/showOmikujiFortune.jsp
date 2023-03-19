<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!-- New line below to use the JSP Standard Tag Library -->
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Omikuji Result</title>
</head>
<body>
<h1> Heres your Omikuji</h1>
<h3> <c:out value="${result}" /> </h3>
<a href="/"> go back!</a>
</body>
</html>