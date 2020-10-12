
package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConnectDB { 
	private static Connection connect;
	    
	public static Connection getDBConnection(){ 
            try{
		String driver ="com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/eventers"; 
		String username = "root"; 
		String password = "";
			  
		if(connect == null)
                {
                    Class.forName(driver); 
                    connect = DriverManager.getConnection(url,username,password); 
                }		
            } catch(Exception e){
		System.out.println(e);
		}
            return connect;  
	}  
	
}  