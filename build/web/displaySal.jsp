<%-- 
    Document   : displaySal
    Created on : May 18, 2018, 12:49:11 AM
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
    <body>
        <table>
                    <tr>
                        <th>Name</th>
                        <th>Eno</th>
                        <th>Total Salary</th>
                    </tr>
                    <%
                        try{
                            Class.forName("com.mysql.jdbc.Driver");  
                            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/eventers","root","");
            
                            Statement stmt=con.createStatement();  
                            ResultSet rs=stmt.executeQuery("select e.Name,s.Eno,s.BasicSal from employee e, salary s where e.Eno=s.Eno");  
                            while(rs.next()){
                     %>

        
                    <tr>
                        <td><%=rs.getString("e.Name") %></td>
                        <td><%=rs.getInt("s.Eno") %></td>
                        <td><%=2*rs.getFloat("Mobile") %></td>
                    </tr>
                    
                    <% }con.close();  
                        }catch(Exception e)
                            { System.out.println(e);}  
                    %>
                </table>
    </body>
</html>
