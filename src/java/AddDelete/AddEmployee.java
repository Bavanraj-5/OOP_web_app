/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AddDelete;
import java.sql.*;
import Employee.Employee;
import connection.ConnectDB;

/**
 *
 * @author User
 */
public class AddEmployee {
    public boolean addEmp(Employee emp) {		
	try {
            Connection con=ConnectDB.getDBConnection();
            Statement st = con.createStatement();
            int i = st.executeUpdate("INSERT INTO employee(Name,Eno,Mobile,Address) VALUES('"+emp.getName()+"','"+emp.getEno()+"','"+emp.getContact()+"','"+emp.getAdd()+"')");
            return true;
	}catch(Exception e) {
            System.out.println(e);
		}
	return false;
    }
}
