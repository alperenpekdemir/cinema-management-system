import db.DatabaseManager;
import db.OnlineDB;

import javax.swing.*;
import java.sql.*;
import ui.LoginScreen;

public class Main {
    public static void main(String[] args) {
        // Set look and feel
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception ignored) {}

        // Initialize database tables
        Connection con = OnlineDB.connectOnlineDB();
        if (con != null) {
            DatabaseManager dbManager = new DatabaseManager(con);
            dbManager.createAllTables();
        } else {
            JOptionPane.showMessageDialog(null,
                "Could not connect to the database!\nCheck your internet connection.",
                "Connection Error", JOptionPane.ERROR_MESSAGE);
        }

        // Launch login window
java.awt.EventQueue.invokeLater(() -> new LoginScreen().setVisible(true));        
    }
}
