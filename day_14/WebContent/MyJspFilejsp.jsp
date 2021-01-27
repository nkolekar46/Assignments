<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP Practice</title>
</head>
<body>


 <div align="center">
  <h1>Employee Login Form</h1>
  <form method="post">
   <table style="with: 100%">
    <tr>
     <td>UserName</td>
     <td><input type="text" name="username" /></td>
    </tr>
    <tr>
     <td>Password</td>
     <td><input type="password" name="password" /></td>
    </tr>

   </table>
   <input type="submit" value="Submit" />	
  </form>
 
</div>


<%
String msg = (String)request.getAttribute("message");
if(msg != null)
	out.println(msg);

%>

<% 
	String user=request.getParameter("username");
//	String pass=request.getParameter("password");

	
	try
	{
	int num=Integer.parseInt(request.getParameter("username"));
	int fact=1;
	for(int i=1; i<=num; i++)
	{
		fact=fact*i;
	
	}
	 response.getWriter().println(fact);
	}
	catch(NumberFormatException e)
	{
		out.println("as");
	}
	
	%>	
	

</body>
</html>







