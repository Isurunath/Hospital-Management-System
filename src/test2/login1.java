/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test2;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;

/**
 *
 * @author Isurunath
 */
public class login1 extends javax.swing.JFrame {

    /**
     * Creates new form login1
     */
    
    
    
    public login1() {
        initComponents();
        clock();
        
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

        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        password = new javax.swing.JPasswordField();
        date = new javax.swing.JLabel();
        clock = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton3.setText("System Login");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, 110, -1));

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 255));
        jLabel1.setText("Username");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 210, -1, 20));

        username.setBackground(new java.awt.Color(0, 51, 204));
        username.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        username.setForeground(new java.awt.Color(204, 204, 255));
        getContentPane().add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 210, 130, 30));

        jButton1.setBackground(new java.awt.Color(153, 153, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 153));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/test2/images/login-button.png"))); // NOI18N
        jButton1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 290, 110, 30));

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 255));
        jLabel3.setText("Password");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 250, -1, 20));

        jButton2.setBackground(new java.awt.Color(0, 102, 204));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/test2/images/15106-illustration-of-a-red-close-button-pv.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 10, 40, 30));

        password.setBackground(new java.awt.Color(51, 0, 255));
        password.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        password.setForeground(new java.awt.Color(153, 153, 255));
        getContentPane().add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 250, 130, 30));

        date.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        date.setText("jLabel5");
        getContentPane().add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 30, -1, -1));

        clock.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        clock.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        clock.setText("jLabel5");
        getContentPane().add(clock, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 10, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/test2/images/login1.jpg"))); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 340));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
            
        this.dispose();
        
// TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        
         try {

            String usr = username.getText();
            String pwd = password.getText();
            //String act = account.getSelectedItem().toString();
            String found = "true";
            
            if(usr.equals("")||pwd.equals("")){
                JOptionPane.showMessageDialog(rootPane, "Please Input username and password");
            }

            else{

                Connection c = DBcon.connect();
                java.sql.Statement s=c.createStatement();
                ResultSet rs=s.executeQuery("SELECT * FROM add_staff");

                while(rs.next()){

                    if(usr.equals(rs.getString("User_Name"))&&pwd.equals(rs.getString("Password"))){
                        
                        new userprofile(usr).setVisible(true);
                        this.dispose();
                        
                        found = "true";
                        break;
                    }
                    else{
                        found = "false";
                    }

                }
            }

            if(found.equals("false"))
            JOptionPane.showMessageDialog(rootPane, "Invaild Username or password");

        } catch (Exception e) {
            e.printStackTrace();
        }









// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

       new systemlogin().setVisible(true);
       //this.dispose();
// TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(login1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel clock;
    private javax.swing.JLabel date;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField password;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables

    private static class Calender {

        public Calender() {
        }
    }
}
