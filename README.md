# Cinema Management System

A Java-based desktop application for managing cinema operations, developed as a university team project. The system provides CRUD functionality for handling customers, cinema halls, tickets, personnel, and occupancy-related data through a graphical user interface (Swing/JFrame).

The application connects to a remote MySQL database via JDBC, allowing real-time data management across multiple cinema entities.

## Features
- Customer management (Create, Read, Update, Delete)
- Cinema hall and seat occupancy tracking
- Ticket creation and management
- Personnel records management
- Real-time data synchronization with a remote MySQL database
- User-friendly graphical interface built with Java Swing

## Technologies Used
- **Java** (Core language)
- **Java Swing / JFrame** (GUI)
- **MySQL** (Database)
- **JDBC** (Database connectivity)
- **NetBeans IDE** (Development environment)
- **Apache Ant** (Build system)

## Project Type
University team project — developed as part of an Object-Oriented Programming course.

## My Contribution
This was a 10-person team project. My personal contributions include:
- Designing and implementing the majority of the application logic
- Developing CRUD operations for customers, halls, tickets, and personnel
- Building the Swing-based GUI screens
- Integrating the application with the MySQL database via JDBC
- Handling user input validation and error management

The database schema setup was partially provided by the instructor, and database-side implementation was handled by another team member.

## How to Run
1. Clone the repository:
   ```bash
   git clone https://github.com/alperenpekdemir/cinema-management-system.git
Open the project in NetBeans IDE
Configure your MySQL database connection in the database configuration class:
Set your database URL
Set your username and password
Make sure the MySQL JDBC driver is added to the project libraries
Build and run the project
Requirements
Java JDK 8 or higher
NetBeans IDE (recommended)
MySQL Server
MySQL JDBC Driver (Connector/J)
Notes
Database credentials in the source code have been replaced with placeholders for security reasons. You must configure your own database connection details before running the project.
This project was developed for educational purposes as part of a university course.
Author
Alperen Pekdemir
