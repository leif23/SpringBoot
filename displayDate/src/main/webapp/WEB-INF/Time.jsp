 <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
   
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script type="text/javascript" src="/js/app.js"></script>
<title>Time </title>
</head>
<body>


 <c:out value="${time}"/>


<script>
function myAlertMessage(){
	
	alert("The time is ")
}
</script>


</body>
</html>