<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>GC Coffee</title>
</head>
<body>
	<h1>Welcome to GC COFFEE</h1>
	
	<ul>
		
		<li><a href="/register-user">User Registration</a></li>
	</ul>
	
	<table border="1">
	<thead>
		<tr>
		 <td>Name</td>
		 <td>Description</td>
		 <td>Quantity</td>
		 <td>Price</td>
		</tr>
	</thead>
	<tbody>
	<c:forEach items="${test }" var="item">
	<tr> 
		<td>${item.name }</td>
		 <td>${item.description }</td>
		 <td>${item.quantity }</td>
		 <td>${item.price }</td>
		 	
	</tr>
	</c:forEach>
	</tbody>
	</table>
</body>
</html>


