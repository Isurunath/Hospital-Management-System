/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package property;

import Ambulance.*;
import staff.*;
import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.util.*;
import java.io.*;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.design.*;
import net.sf.jasperreports.view.*;

public class MyiReportViewer extends JFrame
{

public MyiReportViewer(String fileName)
{
this(fileName,null);
}

public MyiReportViewer(String fileName,HashMap parameter)
{
super("Employee Report");
try
{

/* load the required JDBC driver and create the connection
here JDBC-ODBC Bridge Driver is used*/
 //Class.forName("com.mysql.jdbc.Driver"); 
      //Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/reserve","root","");
     Class.forName("com.mysql.jdbc.Driver");
    com.mysql.jdbc.Connection c=(com.mysql.jdbc.Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/HMS","root","");
//Way 1
/*JasperDesign jasperDesign = JasperManager.loadXmlDesign(fileName);
JasperReport jasperReport = JasperCompileManager.compileReport(jasperDesign);
JasperPrint print = JasperFillManager.fillReport(jasperReport, parameter, con);*/

//Way 2
/*JasperReport jasperReport = JasperCompileManager.compileReport(fileName);
JasperPrint print = JasperFillManager.fillReport(jasperReport, parameter, con);*/

/*Way 3 (Here the parameter file should be in .jasper extension i.e., the compiled report)*/
JasperPrint print = JasperFillManager.fillReport(fileName, parameter, c);

JRViewer viewer=new JRViewer(print);

Container c1=getContentPane();
c1.add(viewer);
}
catch(ClassNotFoundException cnfe)
{
cnfe.printStackTrace();
}
catch(SQLException sqle)
{
sqle.printStackTrace();
}
catch(JRException jre)
{
jre.printStackTrace();
}

setBounds(10,10,1000,1000);
setDefaultCloseOperation(DISPOSE_ON_CLOSE);


}

public static void main(String args[])
{
/* A sample calling */
/*HashMap param=new HashMap();
param.put("reportParameterName",valueForTheParameter);
MyiReportViewer viewer=new MyiReportViewer("Report File Name With Extension",param);
viewer.setVisible(true);*/
}
}
