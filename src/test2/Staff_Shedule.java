/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test2;

import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Isurunath
 */
public class Staff_Shedule extends javax.swing.JInternalFrame {

    /**
     * Creates new form Staff_Shedule
     */
    String Wardno;
    String id;
    public Staff_Shedule() {
        initComponents();
    }

    Staff_Shedule(String wardno){
        initComponents();
        Wardno = wardno;
        tabelload();
        IID.setVisible(false);
}
    
    
    public void tabelload(){
        
        try{
        
        
        Connection c = DBcon.connect();
        java.sql.Statement s=c.createStatement();
        ResultSet rs=s.executeQuery("SELECT Employee_Id,Employee_Name,Designation FROM add_staff where ward = '"+Wardno+"'");
        
        
        jTable1.setModel(DbUtils.resultSetToTableModel(rs));
        
        }catch (Exception e){
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        sdate = new javax.swing.JTextField();
        stime = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        edate = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        etime = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        IID = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(900, 450));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setBackground(new java.awt.Color(204, 204, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Title 1", "Title 2"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, 630, 100));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Staff");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Time Shedule", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Start");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Date");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Time");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 50, -1, -1));

        sdate.setBackground(new java.awt.Color(204, 204, 255));
        sdate.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel1.add(sdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 70, -1));

        stime.setBackground(new java.awt.Color(204, 204, 255));
        stime.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel1.add(stime, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 50, 70, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("End");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Date");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, -1, -1));

        edate.setBackground(new java.awt.Color(204, 204, 255));
        edate.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel1.add(edate, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 70, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Time");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 90, -1, -1));

        etime.setBackground(new java.awt.Color(204, 204, 255));
        etime.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel1.add(etime, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 90, 70, -1));
        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, -140, -1, 90));

        jTable2.setBackground(new java.awt.Color(204, 204, 255));
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
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTable2);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 630, 130));

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 51, 102));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/staff/image/add.png"))); // NOI18N
        jButton4.setText("Add");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 85, 100, -1));

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton5.setForeground(new java.awt.Color(0, 51, 102));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/staff/image/update.png"))); // NOI18N
        jButton5.setText("Update");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 83, 120, -1));

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton6.setForeground(new java.awt.Color(0, 51, 102));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/staff/image/Delete.png"))); // NOI18N
        jButton6.setText("Delete");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 80, 110, 40));

        IID.setText("jLabel8");
        jPanel1.add(IID, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 50, -1, -1));

        jButton1.setText("D");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, 40, -1));

        jButton2.setText("D");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, 40, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/test2/images/cover3.jpg"))); // NOI18N
        jLabel9.setText("jLabel9");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 850, 30));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/test2/images/cover3.jpg"))); // NOI18N
        jLabel10.setText("jLabel9");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 850, 220));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 850, 270));

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 51, 102));
        jButton3.setText("OK");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 440, 80, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/test2/images/blue.jpg"))); // NOI18N
        jLabel8.setText("jLabel1");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 890, 440));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

        int r=jTable1.getSelectedRow();

        id=jTable1.getValueAt(r, 0).toString();
        //String ipwd=jTable1.getValueAt(r, 1).toString();

        try {
            Connection c = DBcon.connect();
            java.sql.Statement s=c.createStatement();
            ResultSet rs=s.executeQuery("SELECT id,Start_Date,Start_Time,End_Date,End_Time FROM shedule where Employee_Id = '"+id+"'");

            jTable2.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1MouseClicked

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked

        int r=jTable2.getSelectedRow();
        String iid=jTable2.getValueAt(r, 0).toString();
        String sDate=jTable2.getValueAt(r, 1).toString();
        String sTime=jTable2.getValueAt(r, 2).toString();
        String eDate=jTable2.getValueAt(r, 3).toString();
        String eTime=jTable2.getValueAt(r, 4).toString();

        sdate.setText(sDate);
        stime.setText(sTime);
        edate.setText(eDate);
        etime.setText(eTime);
        IID.setText(iid);
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable2MouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        String startD = sdate.getText();
        String startT = stime.getText();
        String endD = edate.getText();
        String endT = etime.getText();

        if(startD.equals("")||startT.equals(" ")||endD.equals("")||endT.equals(" ")){
            JOptionPane.showMessageDialog(null,"Please fill the form to add Shedule");
        }
        else{
            try{

                Connection c = DBcon.connect();
                java.sql.Statement s = c.createStatement();
                s.executeUpdate("Insert into shedule(Employee_Id,Start_Date,Start_Time,End_Date,End_Time) values ('"+id+"','"+startD+"','"+startT+"','"+endD+"','"+endT+"')");

                ResultSet rs=s.executeQuery("SELECT id,Start_Date,Start_Time,End_Date,End_Time FROM shedule where Employee_Id = '"+id+"'");

                jTable2.setModel(DbUtils.resultSetToTableModel(rs));

            } catch(Exception e){

                JOptionPane.showConfirmDialog(null,e);
            }

        }

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        String iid = IID.getText();
        String startD = sdate.getText();
        String startT = stime.getText();
        String endD = edate.getText();
        String endT = etime.getText();

        try{

            Connection c = DBcon.connect();
            java.sql.Statement s = c.createStatement();
            s.executeUpdate("Update shedule set Start_Date = '"+startD+"' ,Start_Time = '"+startT+"' ,End_Date = '"+endD+"' ,End_Time ='"+endT+"' where id = '"+iid+"'");

            ResultSet rs=s.executeQuery("SELECT id,Start_Date,Start_Time,End_Date,End_Time FROM shedule where Employee_Id = '"+id+"'");

            jTable2.setModel(DbUtils.resultSetToTableModel(rs));

        } catch(Exception e){

            JOptionPane.showConfirmDialog(null,e);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed

        try{
            String iid = IID.getText();
            Connection c = DBcon.connect();
            java.sql.Statement s = c.createStatement();
            s.executeUpdate("delete from shedule where id = '"+iid+"'");

            ResultSet rs=s.executeQuery("SELECT id,Start_Date,Start_Time,End_Date,End_Time FROM shedule where id = '"+id+"'");

            jTable2.setModel(DbUtils.resultSetToTableModel(rs));

        } catch(Exception e){

            JOptionPane.showConfirmDialog(null,e);
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        //test2.DatePicker Dp=new test2.DatePicker(this);
        //edate.setText(Dp.setPickedDate());
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

       // test2.DatePicker Dp=new test2.DatePicker(this);
       // sdate.setText(Dp.setPickedDate());
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel IID;
    private javax.swing.JTextField edate;
    private javax.swing.JTextField etime;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField sdate;
    private javax.swing.JTextField stime;
    // End of variables declaration//GEN-END:variables
}
