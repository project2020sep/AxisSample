package com.training.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBCon {
    public static Connection con;
    public static void getConnection() throws SQLException {
         con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","root");
        //System.out.println(con);

    }
}
