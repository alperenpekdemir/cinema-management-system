==============================================================
  Cinema Management System - Group 9
  SE 204 - Software Construction
==============================================================

HOW TO OPEN IN NETBEANS
------------------------
1. Open NetBeans IDE (15 or newer recommended)
2. Go to: File → Open Project
3. Navigate to and select the "CinemaMS" folder
4. NetBeans will detect the project automatically
5. Click "Open Project"

ADD MYSQL CONNECTOR (IMPORTANT!)
----------------------------------
1. Download: mysql-connector-j-8.x.x.jar
   From: https://dev.mysql.com/downloads/connector/j/
2. Place the JAR file inside the "lib" folder of this project
3. In NetBeans: Right-click project → Properties → Libraries → Add JAR
4. Select the JAR from the lib folder

DATABASE CONNECTION
--------------------
The app connects automatically to the online database:
  Host    : 193.203.166.109
  Port    : 3306
  Database: u997807830_SE204Project
  User    : u997807830_SE204SoftConst

Tables are created automatically on first run (IF NOT EXISTS).

FIRST LOGIN
-----------
Before running, insert one admin user into the database manually:
  INSERT INTO Group9_Employees
    (FirstName, LastName, Position, Email, Phone, Salary, Username, Password, Role)
  VALUES
    ('Admin', 'User', 'Administrator', 'admin@cinema.com', '555-0000',
     5000, 'admin', 'admin123', 'ADMIN');

Then login with: admin / admin123

PROJECT STRUCTURE
------------------
CinemaMS/
├── src/
│   ├── Main.java              ← Entry point
│   ├── db/
│   │   ├── OnlineDB.java      ← Database connection
│   │   └── DatabaseManager.java ← Table creation
│   ├── model/
│   │   ├── Movie.java
│   │   ├── Hall.java
│   │   ├── Employee.java
│   │   ├── Customer.java
│   │   ├── Screening.java
│   │   └── Ticket.java
│   ├── dao/
│   │   ├── MovieDAO.java      ← CRUD for movies
│   │   ├── HallDAO.java
│   │   ├── EmployeeDAO.java   ← includes login()
│   │   ├── CustomerDAO.java
│   │   ├── ScreeningDAO.java
│   │   └── TicketDAO.java
│   └── ui/
│       ├── LoginFrame.java    ← Login screen
│       ├── MainFrame.java     ← Tabbed main window
│       ├── MoviePanel.java
│       ├── HallPanel.java
│       ├── ScreeningPanel.java
│       ├── TicketPanel.java
│       ├── CustomerPanel.java
│       ├── EmployeePanel.java ← Admin only
│       └── ProfilePanel.java  ← Change password
├── lib/                       ← PUT mysql-connector-j.jar HERE
├── nbproject/                 ← NetBeans config files
├── build.xml
└── manifest.mf

==============================================================
