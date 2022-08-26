<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lead Information</title>
</head>
<body>
<h2>Lead|| Info</h2>
ID:${lead.id }<br>
FirstName:${lead.firstName }<br>
LastName: ${lead.lastName }<br>
Email:${lead.email }<br>
Mobile:${lead.mobile }<br>

<form action="convertlead" method="post">
<input type="hidden" name="id" value ="${lead.id }">
<input type="submit" value="convert">
</form>

</body>
</html>