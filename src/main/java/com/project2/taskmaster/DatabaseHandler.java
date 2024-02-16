package com.project2.taskmaster;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseHandler {
    // database is connected when url is initialized
    private static final String DATABASE_URL = "jdbc:sqlite:taskMasterDB.db";

    public void createTable() {
        String sql = "CREATE TABLE IF NOT EXISTS taskMasterUsers (\n"
                + " id INTEGER PRIMARY KEY AUTOINCREMENT,\n"
                + " username TEXT NOT NULL,\n"
                + " password TEXT NOT NULL\n"
                + ");";
        try (Connection conn = DriverManager.getConnection(DATABASE_URL);
             Statement stmt = conn.createStatement()) {
            stmt.execute(sql);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error creating table: " + e.getMessage());
        }
    }
}
