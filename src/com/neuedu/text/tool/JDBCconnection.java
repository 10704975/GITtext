package com.neuedu.text.tool;

import java.sql.Connection;
import java.sql.DriverManager;

public class JDBCconnection {
    public static Connection getConnection() throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/wang","root","123456");
    }
}
