<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Index page</title>
</head>
<body>
<h2>Good Morning</h2>

<form action="hi" method="post">
Number1<input type="number" name="num1" /><br>
Number2<input type="number" name="num2"><br>
<input type="submit" value="+" name="type"><br>
<input type="submit" value="-" name="type"><br>
<input type="submit" value="*" name="type"><br>
<input type="submit" value="/" name="type"><br>
</form>


<%
String result=(String)request.getAttribute("message");
out.println(result);
	
%>

</body>
</html>