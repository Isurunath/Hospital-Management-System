package DB;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class DB {

    private static Connection con;
    private static String host;

    public static Connection getconn() {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/HMS", "root", "");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return con;
    }

    public static void change(String s) {
        if (con == null) {
            getconn();
        }
        try {
            con.createStatement().executeUpdate(s);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }

    public static ResultSet search(String s) throws SQLException {
        if (con == null) {
            getconn();

        }

        return con.createStatement().executeQuery(s);

    }
}
