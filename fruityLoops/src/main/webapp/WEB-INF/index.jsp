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

<title>FruityLoops</title>
</head>
<body>
<table class="table table-striped table-hover table-dark">
		<thead>
			<tr>
				<th> Fruits</th>
				<th>Price </th>
			</tr>
		</thead>
		<tbody>
		
			<c:forEach var="fruityLoops" items="${fruityLoop }">
			
				<tr>
					<td> <c:out value="${fruityLoops.name}"/> </td>
					<td> <c:out value="${fruityLoops.price }"></c:out> </td>
				</tr>
				
			</c:forEach>
		</tbody>
		
</table>
</body>
</html>