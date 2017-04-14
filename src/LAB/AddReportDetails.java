

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package LAB;

import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author SACHI
 */
public class AddReportDetails extends javax.swing.JFrame {

    Connection conn= null;
    ResultSet rs=null;
    PreparedStatement pst=null;
    public AddReportDetails() {
        initComponents();
        conn=DBaccess.ConnectDb();
        addCombobox1();
    }
void addCombobox1(){
    Test_type.addItem("Scan");
    Test_type.addItem("Blood");
    Test_type.addItem("MRI");
    Test_type.addItem("X-Ray");
    Test_type.addItem("Urine");
    Test_type.addItem("Full Body Ceckup");
    
    st_item.addItem("Pending");
    st_item.addItem("Succesfull");
    st_item.addItem("Cancel");
}
public void getTestDetails(String add1,String add2,String add4,String add5) throws ParseException{
    
    ID_txt.setText(add1);
    Name_txt.setText(add2);
    DateFormat format = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
   Date date = format.parse(add4);
   Date_info.setDate(date);
   Test_type.setSelectedItem(add5);
    
}
public void AutoDelete(){
    
    try{
        
        String sql="DELETE addinfo FROM addinfo INNER JOIN report_details ON addinfo.Patient_ID = report_details.Patient_ID ";
        pst=conn.prepareStatement(sql);
        pst.execute();
        
        
    }catch(Exception e){
      JOptionPane.showMessageDialog(null, e);  
        
    }
    
    
    
}
public void close(){
        WindowEvent winClosingEvent= new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
         Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
 }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        save_report = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        ID_txt = new javax.swing.JTextField();
        Date_info = new com.toedter.calendar.JDateChooser();
        Test_type = new javax.swing.JComboBox();
        st_item = new javax.swing.JComboBox();
        report_d = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        Sex_Info = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        Age = new javax.swing.JTextField();
        Name_txt = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        save_report.setText("Save");
        save_report.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save_reportActionPerformed(evt);
            }
        });
        getContentPane().add(save_report, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 210, 90, 50));

        jLabel1.setText("Patient ID:-");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, -1, -1));

        jLabel2.setText("Test Date:-");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 110, -1, -1));

        jLabel3.setText("Test Type:-");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, -1, -1));

        jLabel4.setText("Status:-");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 160, -1, -1));

        jLabel5.setText("Report Details");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, -1, -1));
        getContentPane().add(ID_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 212, -1));

        Date_info.setDateFormatString(" yyyy-MM-dd");
        getContentPane().add(Date_info, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 110, 115, -1));

        Test_type.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Test_typeActionPerformed(evt);
            }
        });
        getContentPane().add(Test_type, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, 212, -1));

        st_item.setToolTipText("");
        st_item.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                st_itemActionPerformed(evt);
            }
        });
        getContentPane().add(st_item, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 160, 115, -1));
        getContentPane().add(report_d, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, 212, 33));

        jLabel6.setText("Sex:-");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 70, -1, -1));

        Sex_Info.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Male", "Female" }));
        getContentPane().add(Sex_Info, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 70, 112, -1));

        jLabel7.setText("Age:-");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, -1, -1));
        getContentPane().add(Age, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 74, -1));
        getContentPane().add(Name_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 212, -1));

        jButton4.setBackground(new java.awt.Color(0, 102, 204));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("X");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 10, 40, 30));

        jLabel9.setText("Patient Name:-");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, -1, -1));

        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/test2/images/back (2).jpg"))); // NOI18N
        jLabel29.setText("jLabel28");
        getContentPane().add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 700, 350));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void save_reportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save_reportActionPerformed
        String pattern="[0-9]+";
        
        try{
            String sql="Insert into report_details(Patient_ID,Patient_Name,sex,Patient_Age,Test_Date,Test_Type,Status,Test_details) value(?,?,?,?,?,?,?,?)";
            pst=conn.prepareStatement(sql);
            pst.setString(1,ID_txt.getText());
             pst.setString(2,Name_txt.getText());
             String value1=Sex_Info.getSelectedItem().toString();
            pst.setString(3,value1);
             pst.setString(4,Age.getText());
             String age=Age.getText();
             if(age.length()==2 && age.matches(pattern))
             {
            pst.setString(5,((JTextField)Date_info.getDateEditor().getUiComponent()).getText());
            String value2=Test_type.getSelectedItem().toString();
            pst.setString(6,value2);
            String value3=st_item.getSelectedItem().toString();
            pst.setString(7,value3);
            pst.setString(8,report_d.getText());
           
            
            pst.execute();
            
            
            
            JOptionPane.showMessageDialog(null,"Saved");
            
            AutoDelete();
            ID_txt.setText("");
            Name_txt.setText("");
            Sex_Info.setSelectedIndex(0);
            Age.setText("");
            ((JTextField)Date_info.getDateEditor().getUiComponent()).setText("");
            Test_type.setSelectedIndex(0);
            st_item.setSelectedIndex(0);
            report_d.setText("");
            
             close();
             Addreport s= new Addreport();
             s.setVisible(true);
            
            
             }
             else{
                 JOptionPane.showMessageDialog(null,"Invalid Age","", JOptionPane.ERROR_MESSAGE);
             }
            
          }catch(Exception e){
          JOptionPane.showMessageDialog(null, e);
         
                                                    
  
          }        
    }//GEN-LAST:event_save_reportActionPerformed

    private void Test_typeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Test_typeActionPerformed
      
    }//GEN-LAST:event_Test_typeActionPerformed

    private void st_itemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_st_itemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_st_itemActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        this.dispose();

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AddReportDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddReportDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddReportDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddReportDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddReportDetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Age;
    private com.toedter.calendar.JDateChooser Date_info;
    private javax.swing.JTextField ID_txt;
    private javax.swing.JTextField Name_txt;
    private javax.swing.JComboBox Sex_Info;
    private javax.swing.JComboBox Test_type;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField report_d;
    private javax.swing.JButton save_report;
    private javax.swing.JComboBox st_item;
    // End of variables declaration//GEN-END:variables

}