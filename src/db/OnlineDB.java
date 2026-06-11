package db;

import java.sql.*;

public class OnlineDB {
    Statement st=null;
    PreparedStatement pst= null;
    ResultSet rs= null;
    private static final String URL = "URL_HERE";
    private static final String USER = "USERNAME_HERE";
    private static final String PASSWORD = "PASSWORD_HERE";

    public static Connection connectOnlineDB() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
            return connection;
        } catch (Exception e) {
            System.out.println("Not connected: " + e.getMessage());
            return null;
        }
    }
}