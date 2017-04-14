/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DB.DB;
import DB.DateTime;
import com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author anthonydonx
 */
public class DonerBank {

    public String saveDonerBank(String name, String hospital, String address, String tp, String bloodtype, String rhd) {
     try {
            String insertTableSQL = "INSERT INTO donerbanks VALUES(?,?,?,?,?,?,?)";
            PreparedStatement preparedStatement = DB.getconn().prepareStatement(insertTableSQL);
            preparedStatement.setString(1, name);
            preparedStatement.setString(2, hospital);
            preparedStatement.setString(3, address);
            preparedStatement.setString(4, bloodtype);
            preparedStatement.setString(5, rhd);
            preparedStatement.setString(6, tp);
            
            preparedStatement.setString(7, DateTime.getDateTime());
            preparedStatement.executeUpdate();
            return "Save completed !";
        } catch (MySQLIntegrityConstraintViolationException ex) {
            System.out.println(ex);
            return "Donner already exits !";
        } catch (Exception e) {
            System.out.println(e);
            return "Saving error !";
        }  
    }

    public String updateDonerBank(String name, String hospital, String address, String tp, String bloodtype, String rhd) {
    try {
            String insertTableSQL = "UPDATE donerbanks SET   hospital = ?, address = ?,bloodtype = ?, rhd = ?,tp = ? WHERE name ='"+name+"'";
                 
            PreparedStatement preparedStatement = DB.getconn().prepareStatement(insertTableSQL);
            preparedStatement.setString(1, hospital);
            preparedStatement.setString(2, address);
            preparedStatement.setString(3, tp);
            preparedStatement.setString(4, bloodtype);
            preparedStatement.setString(5, rhd);
            preparedStatement.executeUpdate();
            return "Update completed !";
        
        } catch (Exception e) {
            System.out.println(e);
            return "Saving error !";
        }      
    }

    public ResultSet getDonerBank(String ID) {
     ResultSet rs=null;
        try {
            String insertTableSQL = "SELECT * FROM donerbanks WHERE name='" + ID + "'";
            PreparedStatement preparedStatement = DB.getconn().prepareStatement(insertTableSQL);

            rs = preparedStatement.executeQuery();
            return rs;

        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, e);
            
        }
       return rs;    
    }
    
}
