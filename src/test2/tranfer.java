/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test2;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Isurunath
 */
public class tranfer extends javax.swing.JFrame {

    /**
     * Creates new form tranfer
     */
    
    String PID;
    public tranfer() {
        initComponents();
    }
    
    public tranfer(String pid) {
         PID =pid;
        initComponents();
        wardload();
    }
    
    final void wardload(){
        
        try {
            Connection c = DBcon.connect();
            java.sql.Statement s=c.createStatement();
            ResultSet rs=s.executeQuery("SELECT * FROM ward");
            
            while(rs.next())
            {
                tward1.addItem(rs.getString("wardNO"));
            }
            
        } catch (Exception e) {
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        tward = new javax.swing.JComboBox();
        tbed = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        tward1 = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        tbed1 = new javax.swing.JComboBox();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Tranfer"));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setText("WardID");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        tward.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "W001\t", "W002", "W003" }));
        tward.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twardActionPerformed(evt);
            }
        });
        jPanel1.add(tward, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        tbed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbedActionPerformed(evt);
            }
        });
        jPanel1.add(tbed, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, 50, -1));

        jLabel9.setText("BedID");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, -1, -1));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Tranfer"));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("WardID");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));

        tward1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "W001", "W002", "W003" }));
        tward1.setEnabled(false);
        tward1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tward1ActionPerformed(evt);
            }
        });
        jPanel2.add(tward1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("BedID");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, -1, -1));

        jButton1.setBackground(new java.awt.Color(51, 0, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("OK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 310, 50, -1));

        tbed1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "B01", "B02", "B03", "B04", "B05", "B06", "B07", "B08", "B09", "B10", "B11", "B12", "B13", "B14", "B15", "B16", "B17", "B18", "B19", "B20", "B21", "B22", "B23", "B24", "B25", "B26", "B27", "B28", "B29", "B30", "B31", "B32", "B33", "B34", "B35", "B36", "B37", "B38", "B39", "B40", " ", " ", " ", " ", " " }));
        tbed1.setEnabled(false);
        jPanel2.add(tbed1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, -1, -1));

        jRadioButton1.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jRadioButton1.setText("Inside Hospital");
        jRadioButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton1MouseClicked(evt);
            }
        });
        jPanel2.add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        jRadioButton2.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jRadioButton2.setText("Between Hospitals");
        jRadioButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton2MouseClicked(evt);
            }
        });
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Reason");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        jTextArea1.setBackground(new java.awt.Color(204, 204, 255));
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 310, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/test2/images/cover4.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 20, 390, 340));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 58, 350, 340));

        jButton4.setText("X");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(314, 11, 40, -1));

        jPanel3.setBackground(new java.awt.Color(0, 0, 51));
        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/test2/images/back (2).jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, 410));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void twardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_twardActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_twardActionPerformed

    private void tbedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tbedActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        int x=JOptionPane.showConfirmDialog(null, "Do you want to trnsfer this patient? ");
         
         if(x==0)
         {
             if(jRadioButton1.isSelected()){
        
                String ward = tward1.getSelectedItem().toString();
                String bed = tbed1.getSelectedItem().toString();


                try {
                    Connection c = DBcon.connect();
                    java.sql.Statement s = c.createStatement();
                    int count = 0;
                    ResultSet rs = s.executeQuery("Select * from Bed where wardID = '"+ward+"' and bedID = '"+bed+"'");
                    while(rs.next()){
                        count = count +1;
                    }
                    if(count == 0){
                    s.executeUpdate("Delete from Bed where patientID = '"+PID+"'");
                    s.executeUpdate("Insert into Bed (wardID,bedID,patientID) values ('"+ward+"','"+bed+"','"+PID+"')");
                    this.dispose();
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(rootPane, "Bed is not available");
                    }

                    // TODO add your handling code here:
                } catch (Exception e) {
                    JOptionPane.showConfirmDialog(null,e);
                }
             }
             else if(jRadioButton2.isSelected()){
                 
                 try {
                 String reason = jTextArea1.getText();
                 Connection c = DBcon.connect();
                 java.sql.Statement s = c.createStatement();
                 s.executeUpdate("Delete from Bed where patientID = '"+PID+"'");
                 s.executeUpdate("Insert into hospital_transfer (patientID,reason) values ('"+PID+"','"+reason+"')");
                 this.dispose();
                 } catch (Exception e) {
                     
                     JOptionPane.showMessageDialog(rootPane, "Wrong Entry");
                     
                 }
                 
                 
             }
             
         }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tward1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tward1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tward1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        
       // new patient().setVisible(true);
        this.dispose();

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton1MouseClicked

        jRadioButton2.setSelected(!jRadioButton1.isSelected());
        tward1.setEnabled(jRadioButton1.isSelected());
        tbed1.setEnabled(jRadioButton1.isSelected());

// TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1MouseClicked

    private void jRadioButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton2MouseClicked

        jRadioButton1.setSelected(false);
         tward1.setEnabled(false);
        tbed1.setEnabled(false);
// TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton2MouseClicked

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
            java.util.logging.Logger.getLogger(tranfer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tranfer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tranfer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tranfer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tranfer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField tbed;
    private javax.swing.JComboBox tbed1;
    private javax.swing.JComboBox tward;
    private javax.swing.JComboBox tward1;
    // End of variables declaration//GEN-END:variables
}
