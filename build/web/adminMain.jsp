<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<%@ page import="java.sql.*" %> 
<%@ page import="java.io.*" %> 
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>TODO supply a title</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body bgcolor="Yellow">
        <div align="center">
            <h1> Employee Details</h1>
                <table width="50%" border="5%">
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
            <br><br>
            <a href="addEmp.jsp"><b>Add Employee</b></a><br><br>
            <a href="deleteEmp.jsp"><b>Delete Employee</b></a><br><br>
            <a href="updateEmp.jsp"><b>Update Employee</b></a><br><br>
            <a href="calc.jsp"><b>Calculate Salary</b></a>
        </div>
    </body>
</html>
