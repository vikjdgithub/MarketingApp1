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
<form action="save" method="post">

FirstName<input type="text" name="firstName"><br>
LastName<input type="text" name="lastName"><br>
Source:
<select name="source">
<option>NewsPaper</option>
<option>TV Ads</option>
<option>SocialMedia</option>
<option>others</option>
</select><br>
Email<input type="email" name="email"><br>
Mobile<input type="number" name="mobile"><br>
<input type="submit" value="save">
</form>
${msg }

</body>
</html>