<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="sendEmail" method="post">
		<pre>
			To   <input type="text" name="to" value="${email}" />
			From <input type="text" name="subject" />
			<textarea name="body" rows="8" cols="70">
			</textarea>
			<input type="submit" value= "send email" />
		</pre>
	</form>
	
</body>
</html>