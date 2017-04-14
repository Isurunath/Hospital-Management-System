/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controller;

import DB.DB;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author anthonydonx
 */
public class Stock {
  public String updateStock(String ID,String volume,String BloodType,String RHD,String Type){
      double newVolume=0;
      try {
           String selectQ="SELECT * FROM stock WHERE bloodtype='"+BloodType+"' AND rhd='"+RHD+"'";
            PreparedStatement preparedStatement1 = DB.getconn().prepareStatement(selectQ);
           ResultSet rs=  preparedStatement1.executeQuery();
           while (rs.next()) {               
             newVolume=Double.parseDouble(rs.getString("volume"))+Double.parseDouble(volume);
           }
           
            String insertTableSQL = "UPDATE stock SET   volume = ? WHERE bloodtype ='"+BloodType+"' AND rhd ='"+RHD+"'";
                 
            PreparedStatement preparedStatement = DB.getconn().prepareStatement(insertTableSQL);
            preparedStatement.setString(1, String.valueOf(newVolume));
            
            preparedStatement.executeUpdate();
            return "Update completed !";
        
        } catch (Exception e) {
            System.out.println(e);
            return "Saving error !";
        }      
  }
  
  public ResultSet getStock(){
      ResultSet rs=null;
        try {
            String insertTableSQL = "SELECT * FROM stock ";
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
