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
 * @author Isurunath
 */
public final class opdprescriptions extends javax.swing.JFrame {

    Connection c=null;
    PreparedStatement pst =null;
    ResultSet rs=null;
        String x;
        String ppid;
        
    
    /**
     * Creates new form prescriptions
     */
    public opdprescriptions() {
        initComponents();
    }
     opdprescriptions( String pid) {
        initComponents();
        ppid =pid;
        //jlabel6.setText(ppid);
        txtpid4.setText(ppid);
       // txtpid4.setText(ppid);
        getid();
        tableload2();
        
    }
    
     
       public  void tableload2(){

        try {
            
            String sql="SELECT * from clinic";
            c=DB.mycon();
            pst=c.prepareStatement(sql);
            rs=pst.executeQuery();
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));
            
            
            
                    
    } catch (Exception e) {
        e.printStackTrace();
    }
    
    }
     
    
    
    
     public void getid(){
        
        try {
            
            
             c = DB.mycon();
             Statement s=c.createStatement();
             rs = s.executeQuery("SELECT * FROM p1 where pid= '"+ppid+"'");
             
             while(rs.next()){
                txtpid4.setText(rs.getString("pid"));
             //   txtrdate2.setText(rs.getString("rdate"));
                txtname2.setText(rs.getString("name"));
               // txtdob2.setText(rs.getString("dob"));
               // txtage2.setText(rs.getString("age"));
               // cgen2.setSelectedItem(rs.getString("gender"));
               //cblood2.setSelectedItem(rs.getString("blood"));
                //txtnic2.setText(rs.getString("nic"));
               //txtadd.setText(rs.getString("address"));

                //txtcno3.setText(rs.getString("contact"));
                //txtgurad3.setText(rs.getString("guard"));
                //txtemail3.setText(rs.getString("email"));
               // txtdept4.setText(rs.getString("dept"));
                //txtwardno4.setText(rs.getString("wardno"));
                //txtwardname4.setText(rs.getString("wardname"));
                //txtcons4.setText(rs.getString("cons"));

                    //txtpres.getText();
               // namelabel.setText(rs.getString("name"));
             }
                
         
            
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(rootPane, "INVAILD USER");
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

        jlabel6 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        txtmo = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        txtng = new javax.swing.JTextField();
        txtev = new javax.swing.JTextField();
        txtname2 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        txtpid4 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtno = new javax.swing.JLabel();
        txtclname = new javax.swing.JLabel();
        ctype = new javax.swing.JLabel();
        txtconsu = new javax.swing.JLabel();
        cdate = new javax.swing.JLabel();
        txtctime = new javax.swing.JLabel();
        txtwname1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jjj = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(940, 650));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jlabel6.setText("Patients ID");
        getContentPane().add(jlabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        jLabel33.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel33.setText("Morning");
        getContentPane().add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, -1, -1));

        txtmo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmoActionPerformed(evt);
            }
        });
        getContentPane().add(txtmo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, 160, 40));

        jLabel34.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel34.setText("Evening");
        getContentPane().add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, -1, -1));

        jLabel35.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel35.setText("Night");
        getContentPane().add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, -1, -1));
        getContentPane().add(txtng, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 350, 160, 40));
        getContentPane().add(txtev, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 290, 160, 40));

        txtname2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtname2.setText("name");
        getContentPane().add(txtname2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 140, 60, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Patient Name");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, -1, -1));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setText("Assign Prescriptions");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 360, 160, 30));

        txtpid4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtpid4.setText("id");
        getContentPane().add(txtpid4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, 20, -1));

        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Clinic Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Cliinic Type");
        jPanel9.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Cliinic Date");
        jPanel9.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("Cliinic Time");
        jPanel9.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 40, -1, -1));

        jLabel36.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel36.setText("Ward No");
        jPanel9.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 80, -1, -1));

        jLabel37.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel37.setText("Consultant ");
        jPanel9.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 110, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Clinic No");
        jPanel9.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Clinic Name");
        jPanel9.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        txtno.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtno.setText("clinicno");
        jPanel9.add(txtno, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 90, -1));

        txtclname.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtclname.setText("clinicname");
        jPanel9.add(txtclname, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, 90, -1));

        ctype.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        ctype.setText("clinictype");
        jPanel9.add(ctype, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 90, -1));

        txtconsu.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtconsu.setText("consulta");
        jPanel9.add(txtconsu, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 110, 90, -1));

        cdate.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cdate.setText("clinicdate");
        jPanel9.add(cdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, 90, -1));

        txtctime.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtctime.setText("clinictime");
        jPanel9.add(txtctime, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 40, 90, -1));

        txtwname1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtwname1.setText("clinicwardno");
        jPanel9.add(txtwname1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 80, 90, -1));

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

        jPanel9.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 20, 410, 140));

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton3.setText("Delete");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel9.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 170, 110, 30));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton2.setText("Assign To Clinics");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel9.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 170, 130, 30));

        getContentPane().add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, 910, 210));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/test2/images/logo2.jpg"))); // NOI18N
        jLabel13.setText("jLabel5");
        jLabel13.setPreferredSize(new java.awt.Dimension(940, 110));
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 940, -1));

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton6.setText("Patient Home");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 30, -1, -1));

        jjj.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jjj.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Prescription Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N
        getContentPane().add(jjj, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 910, 220));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/test2/images/blue.jpg"))); // NOI18N
        jLabel5.setText("jLabel1");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 950, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtmoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtmoActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        
        int r=jTable1.getSelectedRow();
        
          String clno=jTable1.getValueAt(r,0).toString();
        String clname=jTable1.getValueAt(r,1).toString();
        String typ=jTable1.getValueAt(r,2).toString();
        String dat=jTable1.getValueAt(r,3).toString();
           String time=jTable1.getValueAt(r,4).toString();
              String ward=jTable1.getValueAt(r,5).toString();
                 String cons=jTable1.getValueAt(r,6).toString();
                 
                 
                  txtno.setText(clno); 
                 txtclname.setText(clname);
                 ctype.setText(typ);
                cdate.setText(dat);
                txtctime.setText(time);
                txtwname1.setText(ward);
                txtconsu.setText(cons);
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
                    String id=txtpid4.getText();
                    String name=txtname2.getText();
                    String no=txtno.getText();
                    String clname=txtclname.getText();
                    String time=txtctime.getText();
                    String consu=txtconsu.getText();
                    String ward=txtwname1.getText();
                    String ctyp=ctype.getText();
                    String cdat=cdate.getText();
        
        try {
      Connection c =DB.mycon();
        Statement s =c.createStatement();
                
        
        //s.executeUpdate("INSERT INTO paclinic3 (id,name,clno,clname,cltype,cldate,cltime,ward,consult) values ('"+id+"','"+name+"','"+no+"','"+clname+"','"+ctyp+"','"+cdat+"','"+time+"','"+ward+"','"+consu+"')");
     //    s.executeUpdate("INSERT INTO paclinic3 (id,name,clno,clname,cltype,cldate,cltime,ward,consult) values ('"+id+"','"+name+"','"+no+"','"+clname+"','"+ctyp+"','"+cdat+"','"+time+"','"+ward+"','"+consu+"')");
       s.executeUpdate("INSERT INTO paclinic3 (id,name,clno,clname,cltype,cldate,cltime,ward,consult) values ('"+id+"','"+name+"','"+no+"','"+clname+"','"+ctyp+"','"+cdat+"','"+time+"','"+ward+"','"+consu+"')");
        
        
        JOptionPane.showMessageDialog(null, " Clinic Assigining Successfull","",JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
               JOptionPane.showMessageDialog(null, e);
        }
  
        
        
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
                    String id=txtpid4.getText();
                    String name=txtname2.getText();
                    String mor=txtmo.getText();
                    String eve=txtev.getText();
                    String ngt=txtng.getText();
            
        
        try {
            
            Connection c =DB.mycon();
            Statement s=c.createStatement();
            
            s.executeUpdate("INSERT INTO pres (id,name,mor,eve,ngt) values ('"+id+"','"+name+"','"+mor+"','"+eve+"','"+ngt+"' )");
            
        } catch (Exception e) {
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        try {
            int x=JOptionPane.showConfirmDialog(rootPane,"DO YOU WANT TO DELETE?????");
                 if( x==0){ 
               Connection c=DB.mycon();
            Statement s= c.createStatement();
              s.executeUpdate("DELETE  FROM  paclinic3 WHERE id='"+txtpid4.getText()+"' && clname='"+txtclname.getText()+"' ");
                JOptionPane.showMessageDialog(null, " Clinic Delete Successfull","",JOptionPane.INFORMATION_MESSAGE);
                 }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(opdprescriptions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(opdprescriptions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(opdprescriptions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(opdprescriptions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new opdprescriptions().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cdate;
    private javax.swing.JLabel ctype;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel jjj;
    private javax.swing.JLabel jlabel6;
    private javax.swing.JLabel txtclname;
    private javax.swing.JLabel txtconsu;
    private javax.swing.JLabel txtctime;
    private javax.swing.JTextField txtev;
    private javax.swing.JTextField txtmo;
    private javax.swing.JLabel txtname2;
    private javax.swing.JTextField txtng;
    private javax.swing.JLabel txtno;
    private javax.swing.JLabel txtpid4;
    private javax.swing.JLabel txtwname1;
    // End of variables declaration//GEN-END:variables
}
