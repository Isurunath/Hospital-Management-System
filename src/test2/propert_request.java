/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package test2;

import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author X55OL
 */
public class propert_request extends javax.swing.JFrame {

    /**
     * Creates new form propert_request
     */
    public propert_request() {
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
                loc.addItem(rs.getString("wardNO"));
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        type = new javax.swing.JTextField();
        quantity = new javax.swing.JTextField();
        loc = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Property Name");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, -1, -1));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Type");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, -1, -1));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Quantity");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, -1, -1));

        name.setBackground(new java.awt.Color(204, 204, 255));
        getContentPane().add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, 100, -1));

        type.setBackground(new java.awt.Color(204, 204, 255));
        getContentPane().add(type, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, 100, -1));

        quantity.setBackground(new java.awt.Color(204, 204, 255));
        getContentPane().add(quantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, 100, -1));

        loc.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "W001\t", "W002", "W003", "W004" }));
        loc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                locActionPerformed(evt);
            }
        });
        getContentPane().add(loc, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, 100, 30));

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Location");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, -1, -1));

        jButton1.setText("Request");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 260, -1, -1));

        jButton2.setText("cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 260, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/test2/images/back (2).jpg"))); // NOI18N
        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 400, 320));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        String Name = name.getText();
        String Type = type.getText();
        String Quan = quantity.getText();
        //String Type = type.getText();
        String Loc = loc.getSelectedItem().toString();
        
        if(Name.equals("")||Type.equals(" ")||Quan.equals("")||Loc.equals(" ")){
            JOptionPane.showMessageDialog(null,"Please fill the form to add request");
        }
        else{
        
        try{

            Connection c = DBcon.connect();
            java.sql.Statement s = c.createStatement();
            s.executeUpdate("Insert into request(Property_Name,Type,Quantity,Location) values ('"+Name+"','"+Type+"','"+Quan+"','"+Loc+"')");
            JOptionPane.showMessageDialog(null, "Request send Successfully");
            this.dispose();

        } catch(Exception e){

            JOptionPane.showConfirmDialog(null,e);
        }

        }
// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        this.dispose();
// TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void locActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_locActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_locActionPerformed

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
            java.util.logging.Logger.getLogger(propert_request.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(propert_request.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(propert_request.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(propert_request.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new propert_request().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JComboBox loc;
    private javax.swing.JTextField name;
    private javax.swing.JTextField quantity;
    private javax.swing.JTextField type;
    // End of variables declaration//GEN-END:variables
}
