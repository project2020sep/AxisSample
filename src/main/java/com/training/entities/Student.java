package com.training.entities;

public class Student {
    int rno;
    String sname;
    String email;
    String phone;

    public Student() {
        }

    public Student(int rno, String sname, String email, String phone) {
        this.rno = rno;
        this.sname = sname;
        this.email = email;
        this.phone = phone;
    }

    public int getRno() {
        return rno;
    }

    public void setRno(int rno) {
        this.rno = rno;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rno=" + rno +
                ", sname='" + sname + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
