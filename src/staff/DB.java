/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package staff;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Deerasinghe
 */
public class DB {
    
     public static Connection mycon() throws ClassNotFoundException, SQLException{
    Class.forName("com.mysql.jdbc.Driver");
    Connection c=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/HMS","root","");
    
    return c;
     }
    
}
