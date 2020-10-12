/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AddDelete;
import connection.ConnectDB;
import java.sql.*;

public class DeleteEmployee {

        
    public boolean deleteEmp(String name){
        try {
            Connection con = ConnectDB.getDBConnection();
            Statement myStm= con.createStatement();
	
            String query = "DELETE FROM employee WHERE Name='"+name+"'";				
            myStm.executeUpdate(query);
            return true;
        }catch (Exception e) {
            e.printStackTrace();}
        return false;
    }
}
