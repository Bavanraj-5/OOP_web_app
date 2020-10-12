<%-- 
    Document   : addEmp
    Created on : May 17, 2018, 2:59:44 PM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>TODO supply a title</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body bgcolor="green">
        <div align="center">
        <h1>Add Employee Details</h1>
        <form method="post" action="AddServlet">
        <table border="3%">
            <tr><td>   Employee Name: </td><td><input type="text" name="name"></td></tr>
            <tr><td>   Employee Number: </td><td><input type="text" name="eno"></td></tr>
            <tr><td>   Contact Number: </td><td><input type="text" name="contact"></td></tr>
            <tr><td>   Address: </td><td><input type="text" name="address"></td></tr>
        </table>
            <input type="submit" value="Submit"><br>
        </form>
        <br><br>
        <a href="adminMain.jsp"><b>Go Back</b></a>
        </div>
    </body>
</html>