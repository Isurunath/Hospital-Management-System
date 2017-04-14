package pharmacy;


import pharmacy.code.dbconnect;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.UIManager;
import net.proteanit.sql.DbUtils;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author DELL
 */
  public class range extends javax.swing.JFrame {

   Connection con = null;
   PreparedStatement pst = null;
   ResultSet sd= null;
   //[] values = new float[] {0.1f, 0.2f, 0.3f};
   String[] dete= new  String[]{ "Oxycontin","Suboxone","Hydrocodone","Impax","Cefadroxil","Insulin","Glyclopyramide","Tramadol","Chlorpropamide","Pioglitazone","Levomilnacipran","Dulaglutide"};
    String[] det=new String[]{"Impax_Labo","Accredo_Group","Acorda-Therapeutics,","Ilpax","Gilead Sciences","Myers Squibb & gener","Tibotec","Boehringer Ingelheim","Phoneropica","Trimeris and Roche","Phoneropica"};
   
   public static  int autocpmlt(String data, String[] det){
       try {
           
           for (int i = 0; i < det.length; i++) {
            if(data.equals(det[i].substring(0,data.length()))) {  
           return i;
           }
           
       } }
           catch (Exception e) {
       }
       return -1;

   }
  
    public range() {
        initComponents();
        //CONNECT TO DB
        con= dbconnect.connect();
        //TABLE LOAD
        tableload();
        tableload2();
        updatetable();
        
//        
//       edate.getJCalendar().setMaxSelectableDate(Calendar.getInstance().getTime());
//        
//        Calendar cal =Calendar.getInstance();
//       cal.add( Calendar.DAY_OF_YEAR, -30);
//        Date sevenDaysAgo = cal.getTime();
//        System.out.println(sevenDaysAgo);
//        edate.getJCalendar().setMaxSelectableDate(sevenDaysAgo);
//        
        
        
            
       edate.getJCalendar().setMinSelectableDate(Calendar.getInstance().getTime());
        
        Calendar cal =Calendar.getInstance();
       cal.add( Calendar.DAY_OF_YEAR,Calendar.DAY_OF_YEAR);
        Date thirtyDateAgo = cal.getTime();
        System.out.println(thirtyDateAgo);
        edate.getJCalendar().setMinSelectableDate(thirtyDateAgo);
        
        
        
        
        
        
    }
   public  static void addtextandselecttotextfiel(JTextField maname, String newdata){
        
       String ddta="";
       int noactual= maname.getText().length();
       ddta=newdata.substring(noactual,newdata.length());
       
       if(newdata.isEmpty()|| ddta.isEmpty()){
           
           return;
       }
         try {
            maname.getDocument().insertString(maname.getCaretPosition(), ddta, null);
                
        } catch (Exception e) {
        }
         
         maname.select(noactual, maname.getText().length());
    }
    
    
    public  static void addtextandselecttotextfield(JTextField Medicine_Name, String newdata){
        
       String ddta="";
       int noactual= Medicine_Name.getText().length();
       ddta=newdata.substring(noactual,newdata.length());
       
       if(newdata.isEmpty()|| ddta.isEmpty()){
           
           return;
       }
         try {
            Medicine_Name.getDocument().insertString(Medicine_Name.getCaretPosition(), ddta, null);
                
        } catch (Exception e) {
        }
         
         Medicine_Name.select(noactual, Medicine_Name.getText().length());
    }
    

    
    public static String gettextto (String data, String[] dete){
        
        int position= autocpmlt(data, dete);
        
        if(position==-1){
            
            return  data;
            
        }
         return dete [position];
    }
    
    
      public static String gettextt (String data, String[] det){
        
        int position= autocpmlt(data, det);
        
        if(position==-1){
            
            return  data;
            
        }
         return det [position];
    }
    
    
    
        public void tableload()
        {
            try{
              //   String sql="SELECT Medicine_ID,Medicine_Name,Medicine_Type,Quantity,Date,Manufacture_Name,Manufacture_Date,Expiry_Date FROM med_reg";
              String sql="SELECT * FROM med_reg";
                pst=con.prepareStatement(sql); 
               sd =pst.executeQuery();
              jTable1.setModel(DbUtils.resultSetToTableModel(sd));
               
               
            }
            catch(Exception e)
            {
                
            }
            
        }
    
              public String currentdate(){
        
        Calendar cal= new GregorianCalendar();
        int month=cal.get(Calendar.MONTH);
        int year=cal.get(Calendar.YEAR);  
        int day=cal.get(Calendar.DAY_OF_MONTH);  
        String current=(year+"/"+(month+1)+"/"+day);
        return  current;
    }
        
        
                public void tableload2()
        {
            try{
              //   String sql="SELECT Medicine_ID,Medicine_Name,Medicine_Type,Quantity,Date,Manufacture_Name,Manufacture_Date,Expiry_Date FROM med_reg";
              String sql="SELECT * FROM med_reg WHERE Medicine_Name=Medcn_Name";
                pst=con.prepareStatement(sql); 
               sd =pst.executeQuery();
               jTable1.setModel(DbUtils.resultSetToTableModel(sd));
               
               
            }
            catch(Exception e)
            {
                
            }
           
        }
    
                
                public  void updatetable()
                {
                    try {
                        
                        String sw="SELECT * FROM med_reg WHERE Medicine_Name=Medicine_Name AND Medicine_Type=Medicine_Type";
                         pst=con.prepareStatement(sw); 
               sd =pst.executeQuery();
               jTable1.setModel(DbUtils.resultSetToTableModel(sd));
                        
                        
                        
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        mdate = new com.toedter.calendar.JDateChooser();
        Medicine_Type = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        edate = new com.toedter.calendar.JDateChooser();
        maname = new javax.swing.JTextField();
        Quantity = new javax.swing.JTextField();
        Medicine_Name = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        delete = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        Medcn_Name = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(940, 650));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jPanel1KeyTyped(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setBackground(new java.awt.Color(204, 204, 255));
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
        jTable1.setCellSelectionEnabled(true);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 460, 670, 170));

        jButton3.setText("Save");
        jButton3.setName(""); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jButton3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jButton3KeyTyped(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 410, -1, -1));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mdate.setBackground(new java.awt.Color(204, 204, 255));
        mdate.setDateFormatString("yyyy-MM-dd");
        jPanel2.add(mdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 100, 134, 29));

        Medicine_Type.setBackground(new java.awt.Color(204, 204, 255));
        Medicine_Type.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Liquid", "Tablet", "Capsules" }));
        Medicine_Type.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Medicine_TypeActionPerformed(evt);
            }
        });
        jPanel2.add(Medicine_Type, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 134, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Medicine Name");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 76, 22));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Manufacture Date");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 110, -1, -1));

        edate.setBackground(new java.awt.Color(204, 204, 255));
        edate.setDateFormatString("yyyy-MM-dd");
        edate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                edateMouseClicked(evt);
            }
        });
        jPanel2.add(edate, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 150, 134, 31));

        maname.setBackground(new java.awt.Color(204, 204, 255));
        maname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manameActionPerformed(evt);
            }
        });
        maname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                manameKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                manameKeyTyped(evt);
            }
        });
        jPanel2.add(maname, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 40, 134, 32));

        Quantity.setBackground(new java.awt.Color(204, 204, 255));
        Quantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QuantityActionPerformed(evt);
            }
        });
        Quantity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                QuantityKeyTyped(evt);
            }
        });
        jPanel2.add(Quantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, 134, 32));

        Medicine_Name.setBackground(new java.awt.Color(204, 204, 255));
        Medicine_Name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Medicine_NameActionPerformed(evt);
            }
        });
        Medicine_Name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Medicine_NameKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Medicine_NameKeyTyped(evt);
            }
        });
        jPanel2.add(Medicine_Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, 134, 32));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Manufacture Name");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 50, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Expiry Date");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 160, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Medicine Type");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, -1, 25));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Quantity");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/test2/images/cover3.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 220));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 680, -1));

        delete.setText("Delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        jPanel1.add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 410, -1, -1));

        jButton5.setText("Search");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 410, -1, 30));

        Medcn_Name.setBackground(new java.awt.Color(204, 204, 255));
        Medcn_Name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Medcn_NameKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Medcn_NameKeyTyped(evt);
            }
        });
        jPanel1.add(Medcn_Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 410, 138, 30));

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/staff/image/out.png"))); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 10, 30, 30));

        jButton1.setText("Update");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 410, -1, -1));

        jLabel9.setText("Medicine Name");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 390, 79, 25));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/test2/images/logo2.jpg"))); // NOI18N
        jLabel14.setText("jLabel5");
        jLabel14.setPreferredSize(new java.awt.Dimension(940, 110));
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 940, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/test2/images/blue.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 940, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 940, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPanel1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel1KeyTyped

    private void Medcn_NameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Medcn_NameKeyTyped
        char c=evt.getKeyChar();
        if(!(c=='a'||c=='b'||c=='c'||c=='d'||c=='e'||c=='f'||c=='g'||c=='h'||c=='i'||c=='j'||c=='k'||c=='l'||c=='m'||c=='n'||c=='o'||c=='p'||c=='q'||c=='r'||c=='s'||c=='t'||c=='u'||c=='v'||c=='w'||c=='x'||c=='y'||c=='z'||c=='A'||c=='B'||c=='D'||c=='E'||c=='F'||c=='G'||c=='H'||c=='I'||c=='J'||c=='K'||c=='L'||c=='M'||c=='N'||c=='O'||c=='P'||c=='Q'||c=='R'||c=='S'||c=='T'||c=='U'||c=='V'||c=='W'||c=='X'||c=='Y'||c=='Z'||c=='0'||c=='1'||c=='2'||c=='3'||c=='4'||c=='5'||c=='6'||c=='7'||c=='8'||c=='9'))
        {
            getToolkit().beep();
            evt.consume();

        }

        // TODO add your handling code here:
    }//GEN-LAST:event_Medcn_NameKeyTyped

    private void Medcn_NameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Medcn_NameKeyReleased

        if(!(evt.getKeyCode()>= 65 && evt.getKeyCode()<=90 || evt.getKeyCode()>=96 && evt.getKeyCode()<=105 || evt.getKeyCode()==evt.VK_ENTER) )
        {
            return;
        }
        if(Medcn_Name.getText().isEmpty()){

            return;
        }

        if(dete.length==0){

            return;
        }
        addtextandselecttotextfield(Medcn_Name, gettextto(Medicine_Name.getText(), dete));

        // TODO add your handling code here:
    }//GEN-LAST:event_Medcn_NameKeyReleased

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

        String name=Medcn_Name.getText();
        try {

            String asd="SELECT * FROM med_reg WHERE Medicine_Name='"+name+"'";

            pst=con.prepareStatement(asd);
            sd =pst.executeQuery();
            jTable1.setModel(DbUtils.resultSetToTableModel(sd));

        } catch (Exception e) {
        }

        // String medicinId=Medcn_Name.getText();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        if(Medicine_Name.getText().toString().equals("")&&Medicine_Type.getSelectedItem().toString().equals("")&&Quantity.getText().toString().equals("")&&maname.getText().toString().equals(""))
        {
            JOptionPane.showMessageDialog(null, "No values to be deleted!");

        }
        else{
            String kk="DELETE  FROM med_reg WHERE Medicine_Name=?";

            try {

                pst=con.prepareStatement(kk);
                pst.setString(1, Medicine_Name.getText());
                pst.execute();
                JOptionPane.showMessageDialog(null, "Deleted !");

            } catch (Exception e) {
            }

            updatetable();

            // TODO add your handling code here:
    }//GEN-LAST:event_deleteActionPerformed

    private void edateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_edateMouseClicked

        // TODO add your handling code here:
    }//GEN-LAST:event_edateMouseClicked

    private void Medicine_TypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Medicine_TypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Medicine_TypeActionPerformed

    private void manameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_manameKeyTyped
        char c=evt.getKeyChar();
        if(!(c=='a'||c=='b'||c=='c'||c=='d'||c=='e'||c=='f'||c=='g'||c=='h'||c=='i'||c=='j'||c=='k'||c=='l'||c=='m'||c=='n'||c=='o'||c=='p'||c=='q'||c=='r'||c=='s'||c=='t'||c=='u'||c=='v'||c=='w'||c=='x'||c=='y'||c=='z'||c=='A'||c=='B'||c=='C'||c=='D'||c=='E'||c=='F'||c=='G'||c=='H'||c=='I'||c=='J'||c=='K'||c=='L'||c=='M'||c=='N'||c=='O'||c=='P'||c=='Q'||c=='R'||c=='S'||c=='T'||c=='U'||c=='V'||c=='W'||c=='X'||c=='Y'||c=='Z'))
        {
            getToolkit().beep();
            evt.consume();

        }

        // TODO add your handling code here:
    }//GEN-LAST:event_manameKeyTyped

    private void manameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_manameKeyReleased

        if(!(evt.getKeyCode()>= 65 && evt.getKeyCode()<=90 || evt.getKeyCode()>=96 && evt.getKeyCode()<=105 || evt.getKeyCode()==evt.VK_ENTER) )
        {
            return;
        }
        if(maname.getText().isEmpty()){

            return;
        }

        if(det.length==0){

            return;
        }
        addtextandselecttotextfiel(maname, gettextt(maname.getText(), det));

        // TODO add your handling code here:
    }//GEN-LAST:event_manameKeyReleased

    private void manameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_manameActionPerformed

    private void jButton3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton3KeyTyped

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3KeyTyped

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        //    if(!Medicine_ID.getText().toString().equals("")&&!Medicine_Name.getText().toString().equals("")&&!Medicine_Type.getSelectedIndex(0).toString().equals("")&&!Quantity.getText().toString().equals("")&&!maname.getText().toString().equals("")&&!mdate.getDateEditor().getDate().getUiComponent()equals("")&&!edate.getDateEditor().getUiComponent().equals(""))
        if(!Medicine_Name.getText().toString().equals("")&&!Medicine_Type.getSelectedItem().toString().equals("")&&!Quantity.getText().toString().equals("")&&!maname.getText().toString().equals(""))

        {

            try{
                //   String exd= ((JTextField)edate.getDateEditor().getUiComponent()).getText();
                // String date= currentdate()+30;
                //  if((exd.equals(date)))
                {          String q="INSERT INTO med_reg(Medicine_Name,Medicine_Type,Quantity,Manufacture_Name,Manufacture_Date,Expiry_Date) values(?,?,?,?,?,?)";
                    /*+ " +medicineId+"','"+medicineName+"','"+medicineType+"','"+quantity+"','"+Manfname+"','"+mnfdate+"','"+exdate+"')";*/
                pst=con.prepareStatement(q);
                //        pst.setString(1,Medicine_ID.getText());
                pst.setString(1,Medicine_Name.getText());
                pst.setString(2, (String) Medicine_Type.getSelectedItem());
                pst.setString(3,Quantity.getText());
                pst.setString(4,maname.getText());
                pst.setString(5,((JTextField)mdate.getDateEditor().getUiComponent()).getText());
                pst.setString(6,((JTextField)edate.getDateEditor().getUiComponent()).getText());
                pst.execute();

                JOptionPane.showMessageDialog(null,"Saved Successfully");

                //            Medicine_ID.setText("");
                Medicine_Name.setText("");
                Medicine_Type.setSelectedIndex(0);
                Quantity.setText("");
                // String date= mdate.getText();
                maname.setText("");
                mdate.setDate(null);
                edate.setDate(null);

                //LOAD TABLE
                tableload();
            }
        }
        catch(Exception e){

            JOptionPane.showMessageDialog(null, e);

        }

        }
        else{
            JOptionPane.showMessageDialog(null, "please fill all the field!!");
        }

    }//GEN-LAST:event_jButton3ActionPerformed

    private void Medicine_NameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Medicine_NameKeyTyped

        char c=evt.getKeyChar();
        if(!(c=='a'||c=='b'||c=='c'||c=='d'||c=='e'||c=='f'||c=='g'||c=='h'||c=='i'||c=='j'||c=='k'||c=='l'||c=='m'||c=='n'||c=='o'||c=='p'||c=='q'||c=='r'||c=='s'||c=='t'||c=='u'||c=='v'||c=='w'||c=='x'||c=='y'||c=='z'||c=='A'||c=='B'||c=='D'||c=='E'||c=='F'||c=='G'||c=='H'||c=='I'||c=='J'||c=='K'||c=='L'||c=='M'||c=='N'||c=='O'||c=='P'||c=='Q'||c=='R'||c=='S'||c=='T'||c=='U'||c=='V'||c=='W'||c=='X'||c=='Y'||c=='Z'||c=='0'||c=='1'||c=='2'||c=='3'||c=='4'||c=='5'||c=='6'||c=='7'||c=='8'||c=='9'))
        {
            getToolkit().beep();
            evt.consume();

        }

        // TODO add your handling code here:
    }//GEN-LAST:event_Medicine_NameKeyTyped

    private void Medicine_NameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Medicine_NameKeyReleased

        if(!(evt.getKeyCode()>= 65 && evt.getKeyCode()<=90 || evt.getKeyCode()>=96 && evt.getKeyCode()<=105 || evt.getKeyCode()==evt.VK_ENTER) )
        {
            return;
        }
        if(Medicine_Name.getText().isEmpty()){

            return;
        }

        if(dete.length==0){

            return;
        }
        addtextandselecttotextfield(Medicine_Name, gettextto(Medicine_Name.getText(), dete));

        // TODO add your handling code here:
    }//GEN-LAST:event_Medicine_NameKeyReleased

    private void Medicine_NameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Medicine_NameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Medicine_NameActionPerformed

    private void QuantityKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_QuantityKeyTyped

        char c=evt.getKeyChar();
        if(!(Character.isDigit(c) || (c==KeyEvent.VK_BACK_SPACE) ||(c==KeyEvent.VK_DELETE)))
        {
            getToolkit().beep();
            evt.consume();
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_QuantityKeyTyped

    private void QuantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QuantityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_QuantityActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

       try{ int r=jTable1.getSelectedRow();
        String id=jTable1.getValueAt(r, 0).toString();
        String name=jTable1.getValueAt(r, 1).toString();
        String type=jTable1.getValueAt(r, 2).toString();
        String qnt=jTable1.getValueAt(r, 3).toString();
        String mnm=jTable1.getValueAt(r, 4).toString();
        String mdt=jTable1.getValueAt(r, 5).toString();
        String xdt=jTable1.getValueAt(r, 6).toString();

        //         Medicine_ID.setText(mid);
        Medicine_Name.setText(name);
        Medicine_Type.setSelectedItem(type);
        Quantity.setText(qnt);
        maname.setText(mnm);
        mdate.setDateFormatString(mdt);
        edate.setDateFormatString(xdt);
       }catch(Exception e){
           
       }
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        phmcy_hm o1= new  phmcy_hm();
        o1.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

             try {

            //String val1= Medicine_ID.getText();
            String val2=Medicine_Name.getText();
            String val3=Medicine_Type.getSelectedItem().toString();
            String val4=Quantity.getText();
            String val5=maname.getText();
            String val6=mdate.getDateFormatString();
            String val7=edate.getDateFormatString();

            String sql="UPDATE med_reg SET  Medicine_Name='"+val2+"' , Medicine_Type='"+val3+"', Quantity='"+val4+"', Manufacture_Name='"+val5+"' , Manufacture_Date='"+val6+"' , Expiry_Date='"+val7+"' WHERE Medicine_Name='"+val2+"' AND Medicine_Type='"+val3+"' " ;
            pst= con.prepareStatement(sql);
            pst.execute();

            JOptionPane.showMessageDialog(null,"Successfully Update");
            updatetable();

        } catch (Exception e) {
        }
// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed
    
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
               /* if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }*/   UIManager.setLookAndFeel("com.jtattoo.plaf.acryl.AcrylLookAndFeel");
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(range.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(range.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(range.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(range.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new range().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Medcn_Name;
    private javax.swing.JTextField Medicine_Name;
    private javax.swing.JComboBox Medicine_Type;
    private javax.swing.JTextField Quantity;
    private javax.swing.JButton delete;
    private com.toedter.calendar.JDateChooser edate;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField maname;
    private com.toedter.calendar.JDateChooser mdate;
    // End of variables declaration//GEN-END:variables
}
