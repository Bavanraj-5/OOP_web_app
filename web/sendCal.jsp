<%-- 
    Document   : sendCal
    Created on : May 19, 2018, 12:35:30 PM
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
        <%
            String eno=request.getParameter("Enum");
            String salary=request.getParameter("bsal");
            String otr=request.getParameter("otr");
            String othrs=request.getParameter("oth");
            String tot=request.getParameter("result");

        try{
            Class.forName("com.mysql.jdbc.Driver");  
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/eventers","root","");
            
            Statement stmt=con.createStatement();  
            stmt.executeUpdate("INSERT INTO salary(Eno,BasicSal,OTrate,OThrs,TotalSal) VALUES('"+eno+"','"+salary+"','"+otr+"','"+othrs+"','"+tot+"')");
            out.println("Successfully Added"); 
        }catch(Exception e)
           { System.out.println(e);}  
        %>
    </body>
</html>
