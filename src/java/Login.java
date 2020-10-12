/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import connection.ConnectDB;
import java.sql.*;
/**
 *
 * @author User
 */
public class Login {
    private String uname,password;
    private ConnectDB db = new ConnectDB();
    private Connection newCon = null;
    
    public LoginDao(String uname, String pw) {
        this.uname = uname;
        this.password = pw;
    }
    
    public boolean check() throws ClassNotFoundException , SQLException{
        
        if (db.isConnected()) {
            newCon = DBConnect.getCon();
            
            Statement stmt = newCon.createStatement();
            String query = "select * from customer where c_username = '" +uname+ "' and password ='"+ password +"'";
            ResultSet rs=stmt.executeQuery(query);
            if(rs.next())
                return true;
            else 
                return false;
        }
        
        return false;
    }
}
