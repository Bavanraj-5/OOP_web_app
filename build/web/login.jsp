<%-- 
    Document   : login
    Created on : May 19, 2018, 1:27:47 PM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form name="abc" method="GET" onsubmit="LoginServlet">
			<p align="center">
			<b>Username</b>  <input type="text" name="userName"/><br><br>
			<b>Password</b>  <input type="password" name="passwordField"/><br>
                        <input type="submit" value="Login"/>
			</p>
        </form>
    </body>
</html>
