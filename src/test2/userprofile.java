/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test2;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static javax.swing.UIManager.getString;
import staff.addLeave;

/**
 *
 * @author isurunath
 */
public final class userprofile extends javax.swing.JFrame {

    /**
     * Creates new form userprofile
     */
    
        //String iusername;
         String iname;
    public userprofile() {
        initComponents();
        clock();
    }
    
    userprofile(String username){
        
        initComponents();
        clock();
        //iusername = username;
         iname = username;
        //String iaccount = account;
        
        //name.setText(iname);
        //accounttype.setText(iaccount);
        getid(iname);
        
        
    }
    void getid(String username){
        try {
         
         Connection c = DBcon.connect();
         java.sql.Statement s=c.createStatement();
         ResultSet st =s.executeQuery("SELECT * from add_staff where User_Name = '"+username+"'");
         
         while(st.next()){
             
        name.setText(st.getString("User_Name"));
        id.setText(st.getString("Employee_Id"));
        desi.setText(st.getString("Designation"));
         
         }
         //jLabel6.setText(iusername);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "sdfsdf");
        }
        
        
    }
    
     public final void clock(){
        new Thread(){
            public void run(){
                
                while(true){
                    try {
                        
                        GregorianCalendar cal = new GregorianCalendar();
                        int year = cal.get(Calendar.YEAR);
                        int days = cal.get(Calendar.DATE);
                        int month = cal.get(Calendar.MONTH)+1;
                        
                        
                        int hour = cal.get(Calendar.HOUR);
                        int min = cal.get(Calendar.MINUTE);
                        int sec = cal.get(Calendar.SECOND);
                        int Ap = cal.get(Calendar.AM_PM);
                        
                        String day ="";
                        
                        if(Ap ==1){
                            day = "PM";
                        }
                        else{
                            day = "AM";
                        }
                        
                        clock.setText(hour+":"+min+":"+sec+" "+day);
                        date.setText(days+"|"+month+"|"+year);
                      
                    } catch (Exception e) {
                    }
                    
                    
                }
                
            }
        }.start();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        id = new javax.swing.JLabel();
        desi = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        date = new javax.swing.JLabel();
        clock = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(681, 578));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/test2/images/profile.jpg"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 180, -1, 120));

        jButton1.setBackground(new java.awt.Color(0, 0, 204));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Mark Attendance");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 190, 140, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Name");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("StaffID");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Designation");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, -1, -1));

        name.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        name.setForeground(new java.awt.Color(255, 255, 255));
        name.setText("jLabel5");
        getContentPane().add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, -1, -1));

        id.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        id.setForeground(new java.awt.Color(255, 255, 255));
        id.setText("jLabel6");
        getContentPane().add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, -1, -1));

        desi.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        desi.setForeground(new java.awt.Color(255, 255, 255));
        desi.setText("jLabel7");
        getContentPane().add(desi, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, -1, -1));

        jButton2.setBackground(new java.awt.Color(0, 0, 204));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Mark Leave");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 230, 140, 30));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Shedule"));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Date", "Start Time", "End Time", "Ward"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 630, 220));

        jButton3.setText("OK");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 610, 70, -1));

        jButton10.setBackground(new java.awt.Color(204, 204, 204));
        jButton10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton10.setForeground(new java.awt.Color(255, 255, 255));
        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/test2/images/15106-illustration-of-a-red-close-button-pv.png"))); // NOI18N
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 10, 30, 30));

        date.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        date.setText("jLabel5");
        getContentPane().add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 140, -1, -1));

        clock.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        clock.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        clock.setText("jLabel5");
        getContentPane().add(clock, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 140, -1, 20));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/test2/images/logo2.jpg"))); // NOI18N
        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 680, -1));

        jButton4.setBackground(new java.awt.Color(0, 0, 204));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Add Leave");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 270, 140, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/test2/images/blue.jpg"))); // NOI18N
        jLabel6.setText("jLabel6");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 0, 730, 590));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
            
        this.dispose();
        new login1().setVisible(true);
        
// TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Calendar cal = Calendar.getInstance();
        String indate = dateFormat.format(cal.getTime());
        
        try {
            
            
            Connection c = DBcon.connect();
            java.sql.Statement s=c.createStatement();
            ResultSet rs=s.executeQuery("SELECT * FROM attendance where staffID = '"+iname+"' and status = 'incomplete' ");
            int count = 0;
            while(rs.next()){
                count = count+1;
            }
            
            if(count == 0){
            
            s.executeUpdate("Insert into attendance (staffID,workin_date,status) values ('"+iname+"','"+indate+"','incomplete')");
            JOptionPane.showMessageDialog(rootPane, "Attendance Marked Successfully");
            }
            else
            {
                JOptionPane.showMessageDialog(rootPane, "You Have already Marked your Attendance ");
            }
        } catch (Exception e) {
        }





// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Calendar cal = Calendar.getInstance();
        String outdate = dateFormat.format(cal.getTime());
        
        
        try {
            Connection c = DBcon.connect();
            java.sql.Statement s=c.createStatement();
            
            ResultSet rs=s.executeQuery("SELECT * FROM attendance where staffID = '"+iname+"' and status = 'incomplete' ");
            int count = 0;
            while(rs.next()){
                count = count+1;
            }
            
            if(count!=0){
                
                    s.executeUpdate("update attendance set workout_date = '"+outdate+"', status = 'complete' where staffID = '"+iname+"' and status = 'incomplete'");
                    JOptionPane.showMessageDialog(rootPane, "Your Leave Marked Successflly");
            }
            else
            {
                JOptionPane.showMessageDialog(rootPane, "You Havent Marked your Attendance ");
            }
            } catch (Exception e) {
        }





// TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed

        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

           
                new addLeave(iname).setVisible(true);
                //this.dispose();
                

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
            java.util.logging.Logger.getLogger(userprofile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(userprofile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(userprofile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(userprofile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new userprofile().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel clock;
    private javax.swing.JLabel date;
    private javax.swing.JLabel desi;
    private javax.swing.JLabel id;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel name;
    // End of variables declaration//GEN-END:variables
}