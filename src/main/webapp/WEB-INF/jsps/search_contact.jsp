<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    <%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>search contact</title>
</head>
<body>
<a href="/">create lead</a>
<h2>Search || Contact</h2>
<table>
<tr>
<th>FirstName</th>
<th>LastName</th>
<th>Email</th>
<th>Mobile</th>
<th>Billing</th>
</tr>
<c:forEach var="contact" items="${contacts }">
<tr>
<td><a href="contactinfo?id=${contact.id }">${contact.firstName }</a></td>
<td>${contact.lastName }</td>
<td>${contact.email }</td>
<td>${contact.mobile }</td>
<td><a href="showGenerateBillPage?id=${contact.id }">create bill</a></td>
</tr>
</c:forEach>
</table>
</body>
</html>