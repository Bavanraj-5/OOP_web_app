/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AddDelete;
import java.sql.*;
import Employee.Salary;
import connection.ConnectDB;

/**
 *
 * @author User
 */
public class Calculate {
    public boolean calculateSal(Salary sal) {		
	try {
            Connection con=ConnectDB.getDBConnection();
            Statement st = con.createStatement();
            int i = st.executeUpdate("INSERT INTO salary(Eno,BasicSal,OTrate,OThrs,TotalSal) VALUES('"+sal.getEno()+"','"+sal.getSal()+"','"+sal.getOtr()+"','"+sal.getOthrs()+"','"+sal.getTot()+"')");
			
            if (i>0) {
		return true;
            }
	}catch(Exception e) {
            System.out.println(e);
		}
	return false;
    }
    
}
