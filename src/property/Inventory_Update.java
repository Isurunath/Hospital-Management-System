/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package property;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
import test2.DBcon;

/**
 *
 * @author ¬Suranu¬
 */
public class Inventory_Update extends javax.swing.JInternalFrame {
    
    Connection c = null;
     PreparedStatement pst =null;
     ResultSet rs = null;

    /**
     * Creates new form Inventory_Update
     */
    public Inventory_Update() {
        initComponents();
         stableload();
         load();
    }
    
    void load(){
        
            try {
            c = DBcon.connect();
            java.sql.Statement s=c.createStatement();
            rs = s.executeQuery("Select * from supplier");
            while(rs.next()){
                sidbox.addItem(rs.getString("SupplierId"));
            }
            
        } catch (Exception e) {
        }
        
    }
    
    public void stableload()
    {
        try {
            
            c = DBcon.connect();
            //String sql = "SELECT PID,SID,name,type,quantity,date,warrenty_period,location FROM inventoryup";
             
          String sq="SELECT * FROM inventoryup";
            pst=c.prepareStatement(sq);
            rs = pst.executeQuery();
             
           jTable2.setModel(DbUtils.resultSetToTableModel(rs));
            
            
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(rootPane, e);
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
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        namebox = new javax.swing.JTextField();
        qtybox = new javax.swing.JTextField();
        typebox = new javax.swing.JComboBox();
        ADD = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        datebox = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        wbox = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        sidbox = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        searchType = new javax.swing.JComboBox();
        search = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        searchbox = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 204));
        setPreferredSize(new java.awt.Dimension(920, 484));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Add property"));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Type");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 130, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Quantity");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Name");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("PropertyID");
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));

        namebox.setBackground(new java.awt.Color(204, 204, 255));
        jPanel4.add(namebox, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 90, -1));

        qtybox.setBackground(new java.awt.Color(204, 204, 255));
        jPanel4.add(qtybox, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 90, -1));

        typebox.setBackground(new java.awt.Color(204, 204, 255));
        typebox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Labotary", "Machines", "Electrical", "Other" }));
        jPanel4.add(typebox, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 130, 90, -1));

        ADD.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        ADD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/staff/image/add.png"))); // NOI18N
        ADD.setText("ADD");
        ADD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ADDActionPerformed(evt);
            }
        });
        jPanel4.add(ADD, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 150, 110, 40));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Date");
        jPanel4.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 170, -1, -1));

        datebox.setBackground(new java.awt.Color(204, 204, 255));
        datebox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateboxActionPerformed(evt);
            }
        });
        jPanel4.add(datebox, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 170, 90, -1));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("SupplierID");
        jPanel4.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 90, -1, -1));

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("WarrentyPeriod");
        jPanel4.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));

        wbox.setBackground(new java.awt.Color(204, 204, 255));
        jPanel4.add(wbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 90, -1));

        jLabel6.setText("PID");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 90, -1));

        jButton3.setText("D");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 170, 50, 20));

        sidbox.setBackground(new java.awt.Color(204, 204, 255));
        jPanel4.add(sidbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 90, 90, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/test2/images/cover3.jpg"))); // NOI18N
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 830, 190));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 850, 220));

        jTable2.setBackground(new java.awt.Color(204, 204, 255));
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "PropertyID", "Name", "Quantity", "SupplierID", "IssueDate", "Status", "Location"
            }
        ));
        jTable2.setGridColor(new java.awt.Color(153, 153, 153));
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 840, 140));

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/staff/image/update.png"))); // NOI18N
        jButton4.setText("Update");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 260, -1, -1));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/staff/image/Delete.png"))); // NOI18N
        jButton2.setText("Delete");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 260, -1, -1));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/staff/image/Search.png"))); // NOI18N
        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 260, 120, -1));

        searchType.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        searchType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SupplierId", "Name", "Type" }));
        getContentPane().add(searchType, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, 110, 40));
        getContentPane().add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 110, 40));

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton5.setText("Quantity Search");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 260, 130, 40));
        getContentPane().add(searchbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 260, 100, 40));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/test2/images/blue.jpg"))); // NOI18N
        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 460));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ADDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ADDActionPerformed
        
        if(!namebox.getText().toString().equals("")&&!qtybox.getText().toString().equals("")&&!wbox.getText().toString().equals("")&&!sidbox.getSelectedItem().toString().equals("")&&!typebox.getSelectedItem().toString().equals("")&&!datebox.getText().toString().equals(""))
        {
            
            String pattern="[0-9]+";
            String pattern1="[a-zA-Z ]+";
            
             String name = namebox.getText();
                 if(!namebox.getText().equals("") && name.matches(pattern1))
                 {
                    String qty = qtybox.getText();
                 if( qty.matches(pattern))
                 {
                    
                      String warrenty = wbox.getText();
                 if( warrenty.matches(pattern))
                 {
            
        int x=JOptionPane.showConfirmDialog(rootPane, "Do you want to add this record?");
            if(x==0){
        
        String Sid = sidbox.getSelectedItem().toString();
        //String name = namebox.getText();
        String type = typebox.getSelectedItem().toString();
        //String qty = qtybox.getText();
        String date = datebox.getText();
        //String warrenty = wbox.getText();
        String location = "Stock";
        

        try {
            c = DBcon.connect();
            java.sql.Statement s=c.createStatement();
            s.executeUpdate("Insert into inventoryup (SupplierId,Name,Type,Quantity,Date,Warrenty,Location) values ('"+Sid+"','"+name+"','"+type+"','"+qty+"','"+date+"','"+warrenty+"','"+location+"')");
            stableload();
            
                jLabel6.setText("");
                sidbox.setSelectedIndex(0);
                namebox.setText("");
                typebox.setSelectedIndex(0);
                qtybox.setText("");
                datebox.setText("");
                wbox.setText("");
                
                
                
              
          
        } catch (Exception e) {
            
           JOptionPane.showMessageDialog(null, "This record is already exists","",JOptionPane.ERROR_MESSAGE);
        }
            }
            
            else if(x==1){
               jLabel6.setText("");
                sidbox.setSelectedIndex(0);
                namebox.setText("");
                typebox.setSelectedIndex(0);
                qtybox.setText("");
                datebox.setText("");
                wbox.setText("");
                
                
                
            }

            else if(x==2){
                jLabel6.setText("");
                sidbox.setSelectedIndex(0);
                namebox.setText("");
                typebox.setSelectedIndex(0);
                qtybox.setText("");
                datebox.setText("");
                wbox.setText("");
               
            }
                 }
                  else
                {
                    JOptionPane.showMessageDialog(null, "Invalid Warrenty Details","",JOptionPane.ERROR_MESSAGE);
                }
                 }
                  else
                {
                    JOptionPane.showMessageDialog(null, "Invalid Quantity Details","",JOptionPane.ERROR_MESSAGE);
                }
                 }
                  else
                {
                    JOptionPane.showMessageDialog(null, "Invalid Name Details","",JOptionPane.ERROR_MESSAGE);
                }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Enter Essential Details","",JOptionPane.ERROR_MESSAGE);
        }
                
    }//GEN-LAST:event_ADDActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        int x=JOptionPane.showConfirmDialog(null, "Do you want to really update? ");
        
        if(x==0)
        {
        String Pid=jLabel6.getText();
        String Sid = sidbox.getSelectedItem().toString();
        String name = namebox.getText();
        String type = typebox.getSelectedItem().toString();
        String qty = qtybox.getText();
        String date = datebox.getText();
        String warrenty = wbox.getText();
        String location = "Stock";
        
                
                
                 
                String sql=" UPDATE inventoryup SET SupplierId= '"+Sid+"',Name= '"+name+"',Type= '"+type+"',Quantity= '"+qty+"',Date= '"+date+"',Warrenty='"+warrenty+"',Location= '"+location+"' where PropertyId= '"+Pid+"'";
              try {
                 c = DBcon.connect();
                pst=c.prepareStatement(sql);
                pst.execute();
                 stableload();
                
                 jLabel6.setText("");
                sidbox.setSelectedIndex(0);
                namebox.setText("");
                typebox.setSelectedIndex(0);
                qtybox.setText("");
                datebox.setText("");
                wbox.setText("");
                
                
                
            } catch (Exception e) {
            }
        }
        
        else if(x==1){
                 jLabel6.setText("");
                sidbox.setSelectedIndex(0);
                namebox.setText("");
                typebox.setSelectedIndex(0);
                qtybox.setText("");
                datebox.setText("");
                wbox.setText("");
                
            }

            else if(x==2){
                 jLabel6.setText("");
                sidbox.setSelectedIndex(0);
                namebox.setText("");
                typebox.setSelectedIndex(0);
                qtybox.setText("");
                datebox.setText("");
                wbox.setText("");
                
            }
            
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         String search1 = search.getText();
         String type= searchType.getSelectedItem().toString();
         
         try {
            c = DBcon.connect();
            
            String sql = "SELECT * FROM inventoryup where "+type+" LIKE '%"+search1+"%'";
            pst=c.prepareStatement(sql);
            rs = pst.executeQuery();
            
             jTable2.setModel(DbUtils.resultSetToTableModel(rs));
            
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         int x=JOptionPane.showConfirmDialog(null, "Do you want to really delete? ");
         
         if(x==0)
         {
             String Pid= jLabel6.getText();
             
             String sql="DELETE from inventoryup where PropertyId='"+Pid+"'";
             
             try {
                  c = DBcon.connect();
              pst=c.prepareStatement(sql);
              pst.execute();
               stableload();
               
                 jLabel6.setText("");
                sidbox.setSelectedIndex(0);
                namebox.setText("");
                typebox.setSelectedIndex(0);
                qtybox.setText("");
                datebox.setText("");
                wbox.setText("");
                
                 
                 
             } catch (Exception e) {
             }
         }
         
         else if(x==1){
                jLabel6.setText("");
                sidbox.setSelectedIndex(0);
                namebox.setText("");
                typebox.setSelectedIndex(0);
                qtybox.setText("");
                datebox.setText("");
                wbox.setText("");
                
            }

            else if(x==2){
                jLabel6.setText("");
                sidbox.setSelectedIndex(0);
                namebox.setText("");
                typebox.setSelectedIndex(0);
                qtybox.setText("");
                datebox.setText("");
                wbox.setText("");
                
            }
         
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
         int r = jTable2.getSelectedRow();
        
        String Pid = jTable2.getValueAt(r, 0).toString();
        String Sid = jTable2.getValueAt(r, 1).toString();
        String name = jTable2.getValueAt(r, 2).toString();
        String type = jTable2.getValueAt(r, 3).toString();
        String quantity = jTable2.getValueAt(r, 4).toString();
        String date = jTable2.getValueAt(r, 5).toString();
        String warrenty = jTable2.getValueAt(r, 6).toString();
         String location = jTable2.getValueAt(r, 7).toString();
        
        
        sidbox.setSelectedItem(Sid);
        namebox.setText(name);
        typebox.setSelectedItem(type);
        qtybox.setText(quantity);
        datebox.setText(date);
        wbox.setText(warrenty);
        
        jLabel6.setText(Pid);
    }//GEN-LAST:event_jTable2MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        // DatePicker Dp=new DatePicker(this);
     //   datebox.setText(Dp.setPickedDate());
            DatePicker Dp=new DatePicker(null);
        datebox.setText(Dp.setPickedDate());
    }//GEN-LAST:event_jButton3ActionPerformed

    private void dateboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dateboxActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        String search = searchbox.getText();
         
         
         try {
            c = DBcon.connect();
            
            String sql = "SELECT Name,Type,SUM(quantity) AS Total, Location FROM inventoryup where name LIKE '%"+search+"%' ";
            pst=c.prepareStatement(sql);
            rs = pst.executeQuery();
            
             jTable2.setModel(DbUtils.resultSetToTableModel(rs));
            
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton5ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ADD;
    private javax.swing.JTextField datebox;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField namebox;
    private javax.swing.JTextField qtybox;
    private javax.swing.JTextField search;
    private javax.swing.JComboBox searchType;
    private javax.swing.JTextField searchbox;
    private javax.swing.JComboBox sidbox;
    private javax.swing.JComboBox typebox;
    private javax.swing.JTextField wbox;
    // End of variables declaration//GEN-END:variables
}
