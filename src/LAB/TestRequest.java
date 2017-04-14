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
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.JTextField;
import java.util.Locale;
/**
 *
 * @author SACHI
 */
public class TestRequest extends javax.swing.JFrame {

    Connection conn= null;
    ResultSet rs=null;
    PreparedStatement pst=null;
    
     AddReportDetails f=new AddReportDetails();
      int timeRun =0;
    /**
     * Creates new form TestRequest
     */
    public TestRequest() {
        initComponents();
          conn=DBaccess.ConnectDb();
        update_Table();
         currentdate();
      addCombobox1();
        new Thread()
       {
           public void run()
           {
               while (timeRun== 0){
        
            Calendar calc=new GregorianCalendar();
            int hour=calc.get(Calendar.HOUR);
           int min=calc.get(Calendar.MINUTE);
            int sec=calc.get(Calendar.SECOND);
            int type=calc.get(Calendar.AM_PM);
       
           String Day_Night="";
                   
                   if(type == 1)
                   {
                       Day_Night="PM";
                       
                   }
                   else
                   {
                       Day_Night="AM";
                       
                   }
                   String time = hour+":"+min+":"+sec+" "+Day_Night;
                  Time_txt.setText(time);
                   
               }
           }
            }.start();
        }
        
    
 public void currentdate(){
            
              Calendar set=new GregorianCalendar(); 
              int year=set.get(Calendar.YEAR);
              int month=set.get(Calendar.MONTH);
              int day=set.get(Calendar.DAY_OF_MONTH);
              
              
              Date_txt.setText(year+"-"+(month+1)+"-"+day);
            
            
        }
             public void addCombobox1(){
             Test_combo.addItem("Scan");
             Test_combo.addItem("Blood");
             Test_combo.addItem("MRI");
             Test_combo.addItem("X-Ray");
             Test_combo.addItem("Urine");
             Test_combo.addItem("Full Body Ceckup");
    
   
}
 public void update_Table(){
        
       try{
            String sql="select * from addinfo ";
            pst=conn.prepareStatement(sql);
            rs=pst.executeQuery();
            Patient_Table.setModel(DbUtils.resultSetToTableModel(rs));
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

        jLabel1 = new javax.swing.JLabel();
        Date_txt = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Time_txt = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Patient_Table = new javax.swing.JTable();
        search_Text = new javax.swing.JTextField();
        Search = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        delete_row = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        TypeofPatient = new javax.swing.JComboBox();
        Edit_date = new com.toedter.calendar.JDateChooser();
        edit_Text2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Test_combo = new javax.swing.JComboBox();
        Text_info = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Success = new javax.swing.JButton();
        Primary_ID = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Date-:");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 90, 50, 20));

        Date_txt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Date_txt.setForeground(new java.awt.Color(255, 255, 255));
        Date_txt.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Date_txt.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(Date_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 90, 80, 20));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Time-:");
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 90, -1, -1));

        Time_txt.setFont(new java.awt.Font("DS-Digital", 1, 14)); // NOI18N
        Time_txt.setForeground(new java.awt.Color(255, 255, 255));
        Time_txt.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Time_txt.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(Time_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 90, 100, 20));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Patient ID");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, -1, -1));

        Patient_Table.setBackground(new java.awt.Color(204, 204, 255));
        Patient_Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Patient_Table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Patient_TableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(Patient_Table);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 420, 820, 210));

        search_Text.setBackground(new java.awt.Color(204, 204, 255));
        search_Text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_TextActionPerformed(evt);
            }
        });
        getContentPane().add(search_Text, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 380, 120, -1));

        Search.setText("Search");
        Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchActionPerformed(evt);
            }
        });
        getContentPane().add(Search, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 380, 100, -1));

        jButton1.setText("Refresh");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 380, 100, -1));

        delete_row.setText("Delete");
        delete_row.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_rowActionPerformed(evt);
            }
        });
        getContentPane().add(delete_row, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 380, 100, -1));

        jButton3.setText("AddToTest");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 380, -1, -1));

        jButton10.setBackground(new java.awt.Color(204, 204, 204));
        jButton10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton10.setForeground(new java.awt.Color(255, 255, 255));
        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/test2/images/15106-illustration-of-a-red-close-button-pv.png"))); // NOI18N
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 10, 30, 30));

        jButton2.setText("VeiwTestDetails");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 380, -1, -1));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/test2/images/logo2.jpg"))); // NOI18N
        jLabel14.setText("jLabel5");
        jLabel14.setPreferredSize(new java.awt.Dimension(940, 110));
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 940, -1));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TypeofPatient.setBackground(new java.awt.Color(204, 204, 255));
        TypeofPatient.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "IPD", "OPD" }));
        jPanel1.add(TypeofPatient, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 220, -1));

        Edit_date.setBackground(new java.awt.Color(204, 204, 255));
        Edit_date.setDateFormatString("yyyy-MM-dd");
        jPanel1.add(Edit_date, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 221, -1));

        edit_Text2.setBackground(new java.awt.Color(204, 204, 255));
        edit_Text2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edit_Text2ActionPerformed(evt);
            }
        });
        jPanel1.add(edit_Text2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, 221, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Patient Name");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Patient Type");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Date for Test");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, -1, -1));

        Test_combo.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.add(Test_combo, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 50, 220, -1));

        Text_info.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.add(Text_info, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 100, 221, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Test Info");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 100, -1, 20));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Test Type");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 50, -1, 20));

        Success.setText("Save");
        Success.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SuccessActionPerformed(evt);
            }
        });
        jPanel1.add(Success, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 150, 99, -1));

        Primary_ID.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Primary_ID.setForeground(new java.awt.Color(255, 51, 0));
        jPanel1.add(Primary_ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 160, 17));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/test2/images/cover3.jpg"))); // NOI18N
        jLabel10.setText("jLabel10");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, -1, 210));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 820, 190));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/test2/images/blue.jpg"))); // NOI18N
        jLabel9.setText("jLabel9");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 940, 660));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void edit_Text2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edit_Text2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edit_Text2ActionPerformed

    private void SuccessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SuccessActionPerformed
        try{

            String sql="update addinfo set Patient_ID=?,Patient_Name=?,Patient_Type=?,Test_Date=?,Test_Type=?,Test_Info=? where Patient_ID=? ";
            pst=conn.prepareStatement(sql);
            pst.setString(1,Primary_ID.getText());
            pst.setString(2,edit_Text2.getText());
            pst.setString(3,TypeofPatient.getSelectedItem().toString());
            pst.setString(4,((JTextField)Edit_date.getDateEditor().getUiComponent()).getText());
            pst.setString(5,Test_combo.getSelectedItem().toString());
            pst.setString(6,Text_info.getText());

            pst.setString(7,Primary_ID.getText());

            pst.execute();
            JOptionPane.showMessageDialog(null,"Success");
            Primary_ID.setText("");
            edit_Text2.setText("");
            ((JTextField)Edit_date.getDateEditor().getUiComponent()).setText("");
            Test_combo.setSelectedIndex(0);
            Text_info.setText("");
            
            update_Table();

        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_SuccessActionPerformed

    private void Patient_TableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Patient_TableMouseClicked

        try {int row=Patient_Table.getSelectedRow();
            String add1=(Patient_Table.getModel().getValueAt(row,0).toString());
            String  add2=(Patient_Table.getModel().getValueAt(row,1).toString());
            String  add3=(Patient_Table.getModel().getValueAt(row,2).toString());
            String  add4=(Patient_Table.getModel().getValueAt(row,3).toString());
            String  add5=(Patient_Table.getModel().getValueAt(row,4).toString());
            String  add6=(Patient_Table.getModel().getValueAt(row,5).toString());

            Primary_ID.setText(add1);
            edit_Text2.setText(add2);
            TypeofPatient.setSelectedItem(add3);
            DateFormat format = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
            Date date = format.parse(add4);
            Edit_date.setDate(date);
            Test_combo.setSelectedItem(add5);
            Text_info.setText(add6);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Please select Data Row");
        }

    }//GEN-LAST:event_Patient_TableMouseClicked

    private void search_TextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_TextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_search_TextActionPerformed

    private void SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchActionPerformed
        String pid=search_Text.getText();

        String sql="select Patient_ID,Patient_Name,Test_date,Test_Type from addinfo where Patient_ID LIKE '%"+pid+"%'";
        try {
            pst=conn.prepareStatement(sql);
            rs = pst.executeQuery();
            Patient_Table.setModel(DbUtils.resultSetToTableModel(rs) );

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_SearchActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        update_Table();
        search_Text.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void delete_rowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_rowActionPerformed
        try{
            int row=Patient_Table.getSelectedRow();
            String Table_click=(Patient_Table.getModel().getValueAt(row,0).toString());

            int x=JOptionPane.showConfirmDialog(rootPane,"Do you Want To Delete..?");

            if(x==0){
                String sql="delete from addinfo where Patient_ID='"+Table_click+ "'";
                pst=conn.prepareStatement(sql);
                pst.execute();

                update_Table();
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Please Select the Row");
            
        }
    }//GEN-LAST:event_delete_rowActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       
         try {int row=Patient_Table.getSelectedRow();
            String add1=(Patient_Table.getModel().getValueAt(row,0).toString());
            String  add2=(Patient_Table.getModel().getValueAt(row,1).toString());

            String  add4=(Patient_Table.getModel().getValueAt(row,3).toString());
            String  add5=(Patient_Table.getModel().getValueAt(row,4).toString());

            f.getTestDetails(add1,add2,add4,add5);

            f.setVisible(true);
            //close ();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Please select Data Row");
        }
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       close();
        Addreport n=new Addreport();
        n.setVisible(true);

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed

        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton10ActionPerformed

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
            java.util.logging.Logger.getLogger(TestRequest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TestRequest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TestRequest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TestRequest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TestRequest().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Date_txt;
    private com.toedter.calendar.JDateChooser Edit_date;
    private javax.swing.JTable Patient_Table;
    private javax.swing.JLabel Primary_ID;
    private javax.swing.JButton Search;
    private javax.swing.JButton Success;
    private javax.swing.JComboBox Test_combo;
    private javax.swing.JTextField Text_info;
    private javax.swing.JLabel Time_txt;
    private javax.swing.JComboBox TypeofPatient;
    private javax.swing.JButton delete_row;
    private javax.swing.JTextField edit_Text2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField search_Text;
    // End of variables declaration//GEN-END:variables
}