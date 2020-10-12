/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AddDelete;
import java.sql.*;

import Employee.Employee;
import connection.ConnectDB;

public class UpdateEmployee {
    public boolean updateEmp(Employee emp) {
        try {
		Connection con = ConnectDB.getDBConnection();  	
		Statement st = con.createStatement();
		String query = "UPDATE employee SET Eno='"+emp.getEno()+"',Mobile='"+emp.getContact()+"',Address='"+emp.getAdd()+"' WHERE Name='"+emp.getName()+"'";
		st.executeUpdate(query);

		return true;	
            }catch(Exception e){
		System.out.println(e);} 
        return false;
	}
}
