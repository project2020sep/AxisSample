package org.example;


import com.training.repositories.StudentDAO;
import com.training.util.DBCon;

import java.sql.*;

public class Main {
    public static void main(String[] args) throws SQLException {
        System.out.println("Hello world!");
        DBCon.getConnection();
        StudentDAO dao = new StudentDAO();
        dao.getAll();

    }


//statementT/prepared
}