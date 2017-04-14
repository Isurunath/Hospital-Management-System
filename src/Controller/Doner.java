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
public class Doner {

    public String saveDoner(String ID, String Name, String Age, String Weight, String Address, String Tp, String Sex, String BloodType, String RHD) {
        try {
            String insertTableSQL = "INSERT INTO doner"
                    + "(id, name, age, weight,address,tp,sex,bloodtype,rhd,regdate) VALUES"
                    + "(?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement preparedStatement = DB.getconn().prepareStatement(insertTableSQL);
            preparedStatement.setString(1, ID);
            preparedStatement.setString(2, Name);
            preparedStatement.setString(3, Age);
            preparedStatement.setString(4, Weight);
            preparedStatement.setString(5, Address);
            preparedStatement.setString(6, Tp);
            preparedStatement.setString(7, Sex);
            preparedStatement.setString(8, BloodType);
            preparedStatement.setString(9, RHD);
            preparedStatement.setString(10, DateTime.getDateTime());
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

    public ResultSet getDoner(String ID) {
        ResultSet rs=null;
        try {
            String insertTableSQL = "SELECT * FROM doner WHERE id='" + ID + "'";
            PreparedStatement preparedStatement = DB.getconn().prepareStatement(insertTableSQL);

            rs = preparedStatement.executeQuery();
            return rs;

        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, e);
            
        }
       return rs; 
    }

  

    public String updateDoner(String ID, String Name, String Age, String Weight, String Address, String Tp, String Sex, String BloodType, String RHD) {
     try {
            String insertTableSQL = "UPDATE doner SET  name = ?, age = ?, weight = ?,address = ?, tp = ?,sex = ?,BloodType=?,rhd = ? WHERE id ='"+ID+"'";
                 
            PreparedStatement preparedStatement = DB.getconn().prepareStatement(insertTableSQL);
           // preparedStatement.setString(1, ID);
            preparedStatement.setString(1, Name);
            preparedStatement.setString(2, Age);
            preparedStatement.setString(3, Weight);
            preparedStatement.setString(4, Address);
            preparedStatement.setString(5, Tp);
            preparedStatement.setString(6, Sex);
            preparedStatement.setString(7, BloodType);
            preparedStatement.setString(8, RHD);
            preparedStatement.executeUpdate();
            return "Update completed !";
        
        } catch (Exception e) {
            System.out.println(e);
            return "Saving error !";
        }   
    }
    
}
