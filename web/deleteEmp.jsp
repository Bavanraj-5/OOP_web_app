<%-- 
    Document   : deleteEmp
    Created on : May 17, 2018, 3:24:27 PM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body bgcolor="red">
        <div align="center">
        <h1>Delete Employee</h1>
        <form method="post" action="DeleteServlet">
            <table>
                <tr><td><b>Enter Employee Name: </b></td><td><input type="text" name="name"/></td>
            </table>
            <input type="submit" value="Delete"/>
        </form>
        <br><br>
        <a href="adminMain.jsp"><b>Go Back</b></a>
        </div>
    </body>
</html>
