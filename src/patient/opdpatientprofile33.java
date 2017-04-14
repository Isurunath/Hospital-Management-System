/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patient;

import java.awt.Image;
import java.io.File;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Isurunath
 */
public final class opdpatientprofile33 extends javax.swing.JFrame {
     Connection c=null;
    PreparedStatement pst =null;
    ResultSet rs=null;
        String x;
        String ppid;
        
    
    /**
     * Creates new form patientprofile
     */
    public opdpatientprofile33() {
        initComponents();
        getid();
        tableload2();
    }
    
       opdpatientprofile33( String pid) {
        initComponents();
        ppid =pid;
        jLabel5.setText(ppid);
        getid();
        tableload2();
        
    }
     public void getid(){
        
        try {
            
            
             c = DB.mycon();
             Statement s=c.createStatement();
             rs = s.executeQuery
        //("SELECT * FROM p1 WHERE pid='"+txtpid3.getText()+"'");
        ("SELECT * FROM p1 where pid= '"+ppid+"'");
             
             while(rs.next()){
              //  txtpid3.setText(rs.getString("pid"));
                txtrdate3.setText(rs.getString("rdate"));
                txtname3.setText(rs.getString("name"));
                txtdob3.setText(rs.getString("dob"));
                txtage3.setText(rs.getString("age"));
                cgen33.setText(rs.getString("gender"));
                cblood33.setText(rs.getString("blood"));
                txtnic3.setText(rs.getString("nic"));
                txtadd3.setText(rs.getString("address"));

                txtcno3.setText(rs.getString("contact"));
                txtgurad3.setText(rs.getString("guard"));
              //  txtemail3.setText(rs.getString("email"));
                txtdept3.setText(rs.getString("dept"));
               // txtwardno3.setText(rs.getString("wardno"));
               // txtwardname3.setText(rs.getString("wardname"));
                txtcons3.setText(rs.getString("consult"));

                    txtpres.setText(rs.getString("pres"));
               // namelabel.setText(rs.getString("name"));
                    
                      lblpath.setText(rs.getString("image")); 
             }
             
              File f1=new File(lblpath.getText().toString());
        
        Image im=ImageIO.read(f1);
        im=im.getScaledInstance(lblimg.getWidth(),lblimg.getHeight(),Image.SCALE_SMOOTH);
        lblimg.setIcon(new ImageIcon(im));
    
         
            
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(rootPane, "select user");
        }
     }
     
     public  void tableload2(){

        try {
            
            String sql="SELECT * from paclinic3 where id='"+ppid+"'";
         
            c=DB.mycon();
            pst=c.prepareStatement(sql);
            rs=pst.executeQuery();
            jTable2.setModel(DbUtils.resultSetToTableModel(rs));
            
            
            
                    
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

        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtrdate3 = new javax.swing.JLabel();
        txtname3 = new javax.swing.JLabel();
        txtdob3 = new javax.swing.JLabel();
        txtage3 = new javax.swing.JLabel();
        txtnic3 = new javax.swing.JLabel();
        cgen33 = new javax.swing.JLabel();
        cblood33 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtadd3 = new javax.swing.JLabel();
        txtcno3 = new javax.swing.JLabel();
        txtgurad3 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        txtdept3 = new javax.swing.JLabel();
        txtcons3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtpres = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        lblimg = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        lblpath = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(940, 650));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Patient Details"));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setText("Registerd Date");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));

        jLabel4.setText("Name");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        jLabel9.setText("Date of Birth");
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        jLabel10.setText("Age");
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        jLabel11.setText("Blood Group");
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, -1));

        jLabel12.setText("Gender");
        jPanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));

        jLabel14.setText("NIC");
        jPanel4.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, -1));

        txtrdate3.setText("Date");
        jPanel4.add(txtrdate3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, 120, -1));

        txtname3.setText("name");
        jPanel4.add(txtname3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 110, -1));

        txtdob3.setText("date");
        jPanel4.add(txtdob3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 110, -1));

        txtage3.setText("age");
        jPanel4.add(txtage3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 110, -1));

        txtnic3.setText("nic");
        jPanel4.add(txtnic3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, 100, -1));

        cgen33.setText("gender");
        jPanel4.add(cgen33, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, 100, -1));

        cblood33.setText("blood");
        jPanel4.add(cblood33, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, 100, -1));

        jLabel1.setText("Patients ID");
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        jLabel5.setText("id");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 30, -1));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 270, 280));

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Contact Details"));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setText("Address");
        jPanel5.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        jLabel2.setText("Contact No");
        jPanel5.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, -1, -1));

        jLabel16.setText("Guardian");
        jPanel5.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        txtadd3.setText("address");
        jPanel5.add(txtadd3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, 80, -1));

        txtcno3.setText("contact");
        jPanel5.add(txtcno3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, 80, -1));

        txtgurad3.setText("guardian");
        jPanel5.add(txtgurad3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 80, -1));

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 130, 240, 280));

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Hospital Details"));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel18.setText("Department");
        jPanel6.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        jLabel19.setText("Cosultant");
        jPanel6.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        txtdept3.setText("department");
        jPanel6.add(txtdept3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, 100, -1));

        txtcons3.setText("consult");
        jPanel6.add(txtcons3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 100, -1));

        jLabel6.setText("Prescriptions");
        jPanel6.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        txtpres.setText("prescription");
        jPanel6.add(txtpres, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 110, -1));

        getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 130, -1, 280));

        jButton2.setText("Prescriptions");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 420, 140, 30));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable2);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, 890, 180));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/test2/images/logo2.jpg"))); // NOI18N
        jLabel13.setText("jLabel5");
        jLabel13.setPreferredSize(new java.awt.Dimension(940, 110));
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 940, -1));

        lblimg.setText("Image");
        getContentPane().add(lblimg, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 130, 110, 160));

        jButton6.setText("Patient Home");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 20, -1, -1));

        lblpath.setText("Path");
        getContentPane().add(lblpath, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 430, -1, -1));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/test2/images/blue.jpg"))); // NOI18N
        jLabel17.setText("jLabel1");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 950, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         new opdprescriptions(ppid).setVisible(true);
        this.dispose(); 

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        new PatientHome().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton6ActionPerformed

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
            java.util.logging.Logger.getLogger(opdpatientprofile33.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(opdpatientprofile33.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(opdpatientprofile33.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(opdpatientprofile33.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new opdpatientprofile33().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cblood33;
    private javax.swing.JLabel cgen33;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel lblimg;
    private javax.swing.JLabel lblpath;
    private javax.swing.JLabel txtadd3;
    private javax.swing.JLabel txtage3;
    private javax.swing.JLabel txtcno3;
    private javax.swing.JLabel txtcons3;
    private javax.swing.JLabel txtdept3;
    private javax.swing.JLabel txtdob3;
    private javax.swing.JLabel txtgurad3;
    private javax.swing.JLabel txtname3;
    private javax.swing.JLabel txtnic3;
    private javax.swing.JLabel txtpres;
    private javax.swing.JLabel txtrdate3;
    // End of variables declaration//GEN-END:variables
}