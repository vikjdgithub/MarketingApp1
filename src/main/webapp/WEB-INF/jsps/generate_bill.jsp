<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>create lead</title>
</head>
<body>
<h2>Create|| lead</h2>
<form action="generateBill" method="post">

FirstName<input type="text" name="firstName" value="${contact.firstName }"><br>
LastName<input type="text" name="lastName" value="${contact.lastName }"><br>

Email<input type="email" name="email" value="${contact.email }"><br>
Mobile<input type="number" name="mobile" value="${contact.mobile }"><br>
Product<input type="text" name="product"><br>
Amount<input type="number" name="amount"><br>

<input type="submit" value="GenerateBill">

</form>


</body>
</html>