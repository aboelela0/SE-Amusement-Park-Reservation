/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package group_7_online_amusement_park_reservation_system;

/**
 *
 * @author dell
 */


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DB {
   private static DB DB;
    String userName;
    String password;
    String dbName;
    Connection con;

    private DB() {
        userName = "root";
        password = "root";
        dbName = "online_amusement_park_reservation_system_db";
        
        try {
            // Load the JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Establish connection to the database
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + dbName, userName, password);
            System.out.println("DB is nice");
        } catch (Exception e) {
            System.err.println("DATABASE CONNECTION ERROR: " + e.toString());
        }
    }

    public static DB getInstance() {
        if (DB == null) {
            DB = new DB();
        }
        return DB;
    }

    public Connection getConnection() {
        return con;
    }

}
