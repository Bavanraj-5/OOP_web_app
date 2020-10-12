<%-- 
    Document   : calc
    Created on : May 17, 2018, 11:32:24 PM
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
        <script type="text/javascript">
            function calculate(){
                var x = document.getElementById("bsal").value;
                var y = document.getElementById("otr").value;
                var z = document.getElementById("oth").value;
                var p = parseFloat(x)+(parseFloat(y) * parseFloat(z));
                document.getElementById("result").value = p;
            }
        </script>
    </head>
    <body bgcolor="pink">
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
            
            <form method="post" action="sendCal.jsp">
                <table>
                    <tr>
                        <tr><td>Employee Number</td><td><input type="text" id="Enum"></td></tr>
                        <tr><td>Basic Salary</td><td><input type="text" id="bsal"></td></tr>
                        <tr><td>OT Rate</td><td><input type="text" id="otr"></td></tr>
                        <tr><td>OT Hours</td><td><input type="text" id="oth"></td></tr>
                    </tr>

                </table>
                <table>
                    <tr>
                        <td><input type="button" value="Calculate Salary" onclick="calculate()"></td>
                        <td><input type="text" id="result"></td>
                    </tr>
                </table>
                <br><br>
                <input type="submit" value="Save Salary Details">
            </form>
        </div>            
    </body>
</html>
