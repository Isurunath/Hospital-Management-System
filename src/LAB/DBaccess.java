/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package LAB;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author SACHI
 */
public class DBaccess {
    
    Connection conn=null;
    public static java.sql.Connection ConnectDb(){
    
    try{
        Class.forName("com.mysql.jdbc.Driver");
        java.sql.Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/HMS","root","");
     return conn;   
    }catch(Exception e){
     JOptionPane.showMessageDialog(null, e);
      return null;
    }
    }
}