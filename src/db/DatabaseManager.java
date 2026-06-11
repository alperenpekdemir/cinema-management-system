package db;

import java.sql.*;

public class DatabaseManager {

    private Connection con;

    public DatabaseManager(Connection con) {
        this.con = con;
    }

    public void createAllTables() {
        createMoviesTable();
        createHallsTable();
        createEmployeesTable();
        createCustomersTable();
        createScreeningsTable();
        createTicketsTable();
        
        // Tablolar oluştuktan sonra otomatik admin ekleme metodunu çağırıyoruz
        createDefaultAdmin(); 
        
        System.out.println("All tables created/verified successfully.");
    }

    private void createMoviesTable() {
        String sql = "CREATE TABLE IF NOT EXISTS Group9_Movies (" +
                     "MovieID INT(6) AUTO_INCREMENT PRIMARY KEY, " +
                     "Title VARCHAR(200) NOT NULL, " +
                     "Genre VARCHAR(50), " +
                     "Duration INT(4), " +
                     "Language VARCHAR(50), " +
                     "Rating VARCHAR(10), " +
                     "Director VARCHAR(100), " +
                     "ReleaseYear INT(4)" +
                     ");";
        executeSQL(sql, "Group9_Movies");
    }

    private void createHallsTable() {
        String sql = "CREATE TABLE IF NOT EXISTS Group9_Halls (" +
                     "HallID INT(4) AUTO_INCREMENT PRIMARY KEY, " +
                     "HallName VARCHAR(100) NOT NULL, " +
                     "Capacity INT(4), " +
                     "HallType VARCHAR(20)" +
                     ");";
        executeSQL(sql, "Group9_Halls");
    }

    private void createEmployeesTable() {
        String sql = "CREATE TABLE IF NOT EXISTS Group9_Employees (" +
                     "EmployeeID INT(6) AUTO_INCREMENT PRIMARY KEY, " +
                     "FirstName VARCHAR(100) NOT NULL, " +
                     "LastName VARCHAR(100) NOT NULL, " +
                     "Position VARCHAR(100), " +
                     "Email VARCHAR(150), " +
                     "Phone VARCHAR(20), " +
                     "Salary DOUBLE, " +
                     "Username VARCHAR(50) UNIQUE, " +
                     "Password VARCHAR(100), " +
                     "Role VARCHAR(20)" +
                     ");";
        executeSQL(sql, "Group9_Employees");
    }

    private void createCustomersTable() {
        String sql = "CREATE TABLE IF NOT EXISTS Group9_Customers (" +
                     "CustomerID INT(6) AUTO_INCREMENT PRIMARY KEY, " +
                     "FirstName VARCHAR(100) NOT NULL, " +
                     "LastName VARCHAR(100) NOT NULL, " +
                     "Email VARCHAR(150), " +
                     "Phone VARCHAR(20), " +
                     "DateOfBirth DATE" +
                     ");";
        executeSQL(sql, "Group9_Customers");
    }

    private void createScreeningsTable() {
        String sql = "CREATE TABLE IF NOT EXISTS Group9_Screenings (" +
                     "ScreeningID INT(6) AUTO_INCREMENT PRIMARY KEY, " +
                     "MovieID INT(6), " +
                     "HallID INT(4), " +
                     "ScreeningTime DATETIME, " +
                     "Price DOUBLE, " +
                     "AvailableSeats INT(4), " +
                     "FOREIGN KEY (MovieID) REFERENCES Group9_Movies(MovieID), " +
                     "FOREIGN KEY (HallID) REFERENCES Group9_Halls(HallID)" +
                     ");";
        executeSQL(sql, "Group9_Screenings");
    }

    private void createTicketsTable() {
        String sql = "CREATE TABLE IF NOT EXISTS Group9_Tickets (" +
                     "TicketID INT(8) AUTO_INCREMENT PRIMARY KEY, " +
                     "ScreeningID INT(6), " +
                     "CustomerID INT(6), " +
                     "EmployeeID INT(6), " +
                     "SeatNumber VARCHAR(10), " +
                     "TotalPrice DOUBLE, " +
                     "PurchaseTime DATETIME, " +
                     "Status VARCHAR(20), " +
                     "FOREIGN KEY (ScreeningID) REFERENCES Group9_Screenings(ScreeningID), " +
                     "FOREIGN KEY (CustomerID) REFERENCES Group9_Customers(CustomerID), " +
                     "FOREIGN KEY (EmployeeID) REFERENCES Group9_Employees(EmployeeID)" +
                     ");";
        executeSQL(sql, "Group9_Tickets");
    }
    
    // --- YENİ EKLENEN OTOMATİK ADMİN METODU ---
    private void createDefaultAdmin() {
        String checkSql = "SELECT * FROM Group9_Employees WHERE Username = 'admin1'";
        String insertSql = "INSERT INTO Group9_Employees (FirstName, LastName, Position, Email, Phone, Salary, Username, Password, Role) " +
                           "VALUES ('Admin', 'User', 'Administrator', 'admin@cinema.com', '555-0000', 5000, 'admin1', 'admin1234', 'ADMIN')";

        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(checkSql);

            // Eğer rs.next() false dönerse, bu kullanıcı adında biri yok demektir. Ekliyoruz.
            if (!rs.next()) {
                st.executeUpdate(insertSql);
                System.out.println("Default admin created successfully! (Username: admin1 / Password: admin1234)");
            } else {
                System.out.println("Default admin already exists. Skipping creation.");
            }
        } catch (SQLException e) {
            System.out.println("Error checking/creating default admin: " + e.getMessage());
        }
    }

    private void executeSQL(String sql, String tableName) {
        try {
            Statement st = con.createStatement();
            st.executeUpdate(sql);
            System.out.println("Table " + tableName + " created/verified.");
        } catch (SQLException e) {
            System.out.println("Error creating table " + tableName + ": " + e.getMessage());
        }
    }
}