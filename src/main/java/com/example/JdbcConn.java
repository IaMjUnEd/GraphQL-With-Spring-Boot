package com.example; // Java Program to Establish Connection in JDBC

// Importing database
import java.sql.*;
// Importing required classes
import java.util.*;

// Main class
class JdbcConn {

  // Main driver method
  public static void main(String[] args) throws ClassNotFoundException, SQLException {
    // Loading the required JDBC Driver class
    String url = "jdbc:mysql://localhost:3306/mysql";
    String username = "root";
    String password = "Sql!12345";

    System.out.println("Connecting database...");

    try (Connection connection = DriverManager.getConnection(url, username, password)) {
      System.out.println("Database connected!");
    } catch (SQLException e) {
      throw new IllegalStateException("Cannot connect the database!", e);
    }
  }
}
