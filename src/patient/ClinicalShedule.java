/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patient;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author SAM
 */
public class ClinicalShedule extends javax.swing.JFrame {
     Connection c=null;
    PreparedStatement pst =null;
    ResultSet rs=null;

    /**
     * Creates new form ClinicalShedule
     */
    public ClinicalShedule() {
        initComponents();
        tableload2();
    }
    
     public  void tableload2(){

        try {
            
            String sql="SELECT * from clinic ";
            c=DB.mycon();
            pst=c.prepareStatement(sql);
            rs=pst.executeQuery();
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));
            
            
            
                    
    } catch (Exception e) {
        e.printStackTrace();
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

        jPanel9 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        txtconsu = new javax.swing.JTextField();
        txtctime = new javax.swing.JTextField();
        txtwname = new javax.swing.JTextField();
        ctype = new javax.swing.JComboBox();
        cdate = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        txtno = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtclname = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        s = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(940, 650));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder("Clinic Details"));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Cliinic Type");
        jPanel9.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Cliinic Date");
        jPanel9.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Cliinic Time");
        jPanel9.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 30, -1, -1));

        jLabel36.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setText("Ward No");
        jPanel9.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 60, -1, -1));

        jLabel37.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setText("Consultant ");
        jPanel9.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 90, -1, -1));
        jPanel9.add(txtconsu, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 90, 80, -1));
        jPanel9.add(txtctime, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 30, 80, -1));
        jPanel9.add(txtwname, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 60, 80, -1));

        ctype.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Weeekly", "Monthly" }));
        jPanel9.add(ctype, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 80, -1));

        cdate.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" }));
        jPanel9.add(cdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Clinic No");
        jPanel9.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, -1, -1));
        jPanel9.add(txtno, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, 80, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Clinic Name");
        jPanel9.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, -1, 20));
        jPanel9.add(txtclname, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 80, -1));

        jButton1.setText("Assign");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel9.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 170, 80, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/test2/images/cover3.jpg"))); // NOI18N
        jLabel4.setText("jLabel4");
        jPanel9.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, -1));

        getContentPane().add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 850, 210));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 430, 850, 200));

        jButton2.setText("Search");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 390, -1, -1));

        jButton3.setText("Delete");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 390, -1, -1));

        jButton4.setText("Update");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 390, -1, -1));

        jButton5.setText("Clear");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 390, 70, -1));

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/staff/image/out.png"))); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 10, 30, 30));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/test2/images/logo2.jpg"))); // NOI18N
        jLabel13.setText("jLabel5");
        jLabel13.setPreferredSize(new java.awt.Dimension(940, 110));
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 940, -1));
        getContentPane().add(s, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, 100, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/test2/images/blue.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 950, 580));

        setSize(new java.awt.Dimension(940, 650));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
try {
    
                    String no=txtno.getText();
                    String name=txtclname.getText();
                    String time=txtctime.getText();
                    String consu=txtconsu.getText();
                    String ward=txtwname.getText();
                    String ctyp=ctype.getSelectedItem().toString();
                    String cdat=cdate.getSelectedItem().toString();
        
                    
        Connection c=DB.mycon();
        Statement s=c.createStatement();
        s.executeUpdate("INSERT INTO clinic (clname,cltype,cldate,cltime,ward,consult) values ('"+name+"','"+ctyp+"','"+cdat+"','"+time+"','"+ward+"','"+consu+"')");
        
            JOptionPane.showMessageDialog(null, "  Assign Successfull","",JOptionPane.INFORMATION_MESSAGE);
                
                    txtno.setText("");
                    txtclname.setText("");
                    txtctime.setText("");
                    txtconsu.setText("");
                    txtwname.setText("");
                    ctype.setSelectedIndex(0);
                    cdate.setSelectedIndex(0);
            tableload2();
        } catch (Exception e) {
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
         int r=jTable1.getSelectedRow();

        String no=jTable1.getValueAt(r,0).toString();
        String cname=jTable1.getValueAt(r,1).toString();
        String type=jTable1.getValueAt(r,2).toString();
        String date=jTable1.getValueAt(r,3).toString();
        String time=jTable1.getValueAt(r,4).toString();
        String war=jTable1.getValueAt(r,5).toString();
          String cons=jTable1.getValueAt(r,6).toString();
        
        
        txtno.setText(no);
        txtclname.setText(cname);
    
        ctype.setSelectedItem(type);
            cdate.setSelectedItem(date);
        txtctime.setText(time);
        txtwname.setText(war);
        txtconsu.setText(cons);
        //ctype.setSelectedItem(gender);
    
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         try {
             
            String x = s.getText();
            Connection c=DB.mycon();
            Statement s=c.createStatement();
            ResultSet rs=s.executeQuery("SELECT * FROM clinic WHERE clno='"+x+"'");
            while(rs.next()){

            
                txtclname.setText(rs.getString("clname"));
               
                  ctype.setSelectedItem(rs.getString("cltype"));
                  cdate.setSelectedItem(rs.getString("cldate"));
                    txtctime.setText(rs.getString("cltime"));
                    txtwname.setText(rs.getString("ward"));
               txtconsu.setText(rs.getString("consult"));
                
                 tableload2();
              
            }
            
            
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        try {
            int x=JOptionPane.showConfirmDialog(rootPane,"DO YOU WANT TO DELETE?????");
                 if( x==0){ 
            Connection c=DB.mycon();
            Statement s= c.createStatement();
              s.executeUpdate("DELETE FROM clinic WHERE clno='"+txtno.getText()+"'");
              JOptionPane.showMessageDialog(null, " Patient Deletion Successfull","",JOptionPane.INFORMATION_MESSAGE);
              tableload2();
                 }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
         try {
              
            int x =JOptionPane.showConfirmDialog(null,"Do you want to update?");
        if(x==0)
        {
          
                    String no=txtno.getText();
                    String name=txtclname.getText();
                    String time=txtctime.getText();
                    String consu=txtconsu.getText();
                    String ward=txtwname.getText();
                    String ctyp=ctype.getSelectedItem().toString();
                    String cdat=cdate.getSelectedItem().toString();
        
            
             Connection c=DB.mycon();
        Statement s=c.createStatement();
        s.executeUpdate("UPDATE clinic SET clname='"+name+"',cltype='"+ctyp+"',cldate='"+cdat+"',cltime='"+time+"',ward='"+ward+"',consult='"+consu+"' WHERE clno='"+no+"'");
            JOptionPane.showMessageDialog(null, " Clinic Updating Successfull","",JOptionPane.INFORMATION_MESSAGE);
            tableload2();
        }
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        txtno.setText("");
                    txtclname.setText("");
                    txtctime.setText("");
                    txtconsu.setText("");
                    txtwname.setText("");
                    ctype.setSelectedIndex(0);
                    cdate.setSelectedIndex(0);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        new PatientHome().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton7ActionPerformed

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
            java.util.logging.Logger.getLogger(ClinicalShedule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClinicalShedule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClinicalShedule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClinicalShedule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClinicalShedule().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cdate;
    private javax.swing.JComboBox ctype;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField s;
    private javax.swing.JTextField txtclname;
    private javax.swing.JTextField txtconsu;
    private javax.swing.JTextField txtctime;
    private javax.swing.JTextField txtno;
    private javax.swing.JTextField txtwname;
    // End of variables declaration//GEN-END:variables
}
