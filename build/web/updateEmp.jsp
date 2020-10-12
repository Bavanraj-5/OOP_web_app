<%-- 
    Document   : updateEmp
    Created on : May 17, 2018, 4:40:32 PM
    Author     : User
--%>
<%@ page import="java.sql.*" %> 
<%@ page import="java.io.*" %> 
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body bgcolor="lightblue">
        <div align="center">
        <h3> Employee Details</h3>
        <table>
            <tr>
                <th>Name</th>
                <th>Eno</th>
                <th>Mobile</th>
                <th>Address</th>
            </tr>
        <%
        try{
            Class.forName("com.mysql.jdbc.Driver");  
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/eventers","root","");
            
            Statement stmt=con.createStatement();  
            ResultSet rs=stmt.executeQuery("select * from employee");  
            while(rs.next()){
        %>

        
            <tr>
                <td><%=rs.getString("Name") %></td>
                <td><%=rs.getString("Eno") %></td>
                <td><%=rs.getString("Mobile") %></td>
                <td><%=rs.getString("Address") %></td>
            </tr>
        <% }con.close();  
        }catch(Exception e)
           { System.out.println(e);}  
        %>
        </table>
        
        <form method="post" action="UpdateServlet">
        <table>
            <tr><h1>Update Employee Details</h1></tr>
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
