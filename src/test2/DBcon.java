
package test2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBcon {
    
    public static java.sql.Connection connect() throws ClassNotFoundException, SQLException{
        
    Class.forName("com.mysql.jdbc.Driver");
    Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/HMS","root","");
    return c;
    
    }
    
    /*
    public static Connection connect(){
        
   
        Connection con =null;
        try {
            
            Class.forName("con.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/itp","root","");
            
        } catch (Exception e) {
            System.out.println(e);
        }
        
      
        return con;
       
    }*/
    
}
