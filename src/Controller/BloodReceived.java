/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DB.DB;
import DB.DateTime;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author anthonydonx
 */
public class BloodReceived {

    public String saveGRN(String id, String volume, String bloodtype, String rhd, String type) {
        try {
            String insertTableSQL = "INSERT INTO bloodreceived"
                    + "(id, volume,receivedate,bloodtype,rhd,type) VALUES"
                    + "(?,?,?,?,?,?)";
            PreparedStatement preparedStatement = DB.getconn().prepareStatement(insertTableSQL);
            preparedStatement.setString(1, id);
            preparedStatement.setString(2, volume);
            preparedStatement.setString(3, DateTime.getDateTime());
            preparedStatement.setString(4, bloodtype);
            preparedStatement.setString(5, rhd);
            preparedStatement.setString(6, type);
            preparedStatement.executeUpdate();
            return "Save completed !";
        } catch (Exception ex) {
            System.out.println(ex);
            return "Error in saving !";
        }
    }
    
     public ResultSet getGRN(String ID) {
        ResultSet rs=null;
        try {
            String insertTableSQL = "SELECT * FROM bloodreceived WHERE id='" + ID + "'";
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
