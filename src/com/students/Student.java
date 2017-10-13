package com.students;

import java.util.ArrayList;
import java.util.Arrays;

// Student class used to maintain individual student data

public class Student {

    private int studentId;
    private String fname;
    private String lname;
    private String email;
    private int age;
    private int[] grade;

    public Student(int studentId, String fname, String lname, String email, int age, int[] grade) {
        this.studentId = studentId;
        this.fname = fname;
        this.lname = lname;
        this.email = email;
        this.age = age;
        this.grade = grade;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int[] getGrade() {
        return grade;
    }

    public void setGrade(int[] grade) {
        this.grade = grade;
    }

    public void print() {
        System.out.println(this.

            getStudentId( ) +"\t"+"Firstname:"+this.

            getFname( ) +"\t"+"Lastname:"+this.

            getLname( ) +"\t"+"Age:"+this.

            getAge( ) +"\t"+"Grades:"+Arrays.toString(this.

            getGrade( ))+'\n');


    }

}
