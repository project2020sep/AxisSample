package com.training.repositories;

import com.training.entities.Student;
import com.training.util.DBCon;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class StudentDAO {


    public ArrayList<Student> getAll(){

        ArrayList<Student> slist = new ArrayList<Student>();
        ResultSet s;
        Student s1;
        try {//database

            Statement st = DBCon.con.createStatement()
            s = st.executeQuery("select * from student1");
            while(s.next()) {
                int rno =  s.getInt(1);
                String sname =s.getString(2);
//preparing the student object
                s1 = new Student();
                s1.setRno(rno);
                s1.setSname(sname);
//adding to arraylist
                slist.add(s1);

            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        //returning the arraylist of student objects
        return slist;

    }
}
