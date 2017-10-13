package com.students;

import java.util.ArrayList;
import java.util.Arrays;

// Roster class maintains ArrayList of all individual Student objects

public class Roster {

    //instantiate Student objects with given data

    int[] grades1 = {88,79,59};
    Student student1 = new Student(1,"John","Smith","John1989@gmail.com",20,grades1);
    int[] grades2 = {91,72,85};
    Student student2 = new Student(2,"Suzan","Erickson","Erickson_1990@gmailcom",19,grades2);
    int[] grades3 = {85,84,87};
    Student student3 = new Student(3,"Jack","Napoli","The_lawyer99yahoo.com",19,grades3);
    int[] grades4 = {91,98,82};
    Student student4 = new Student(4,"Erin","Black","Erin.black@comcast.com",22,grades4);
    int[] grades5 = {100,100,100};
    Student student5 = new Student(5,"Joey","Granger","sgtpepper36@gmail.com",34,grades5);

    private static ArrayList<Student> students;

    public Roster( ) {
        this.students = new ArrayList<Student>();
    }

    //add Student objects to Roster ArrayList

    public void addStudent(Student student) {
        students.add(student);

    }

    //remove Student object from Roster ArrayList by String studentID

    public static void remove(String studentId) {
        boolean found = false ;
        String nameofStudent = "";
        String message = "";
        int i = 0;
        int iSet = i;
        for (Student s : students) {
            if (String.valueOf(s.getStudentId()).equals(studentId)) {
                nameofStudent = s.getFname() + " " + s.getLname();
                iSet = i;
                found = true;
            }
            i++;
        }
        if (found == true) {
            students.remove(iSet);
            message = nameofStudent + " has been removed from database";
            System.out.println(message);
        } else {
            message = "Student not found in database";
            System.out.println(message);
        }
    }

    //print all Student objects from Roster ArrayList using Student print() method

    public static void print_all(){
        for (Student s : students){
            s.print();
        }

    }

    //print average grades of each individual Student objects

    public static void print_average_grade(String studentId) {

        int avg = 0;
        StringBuilder sb = new StringBuilder();
        for (Student s : students ) {

            int sum = 0;
            for (int i : s.getGrade()) {
                sum += i;
            }
            avg = sum/s.getGrade().length;
            sb.append(s.getStudentId() + "-" + avg + "\n");

        }
        System.out.println("Average Grades: "+ "\n" + sb.toString());

    }

    //print any invalid emails in individual Student objects, invalid parameters are missing @, missing ., or included space

    public static void print_invalid_emails() {
        StringBuilder sb = new StringBuilder();
        for (Student s : students) {
            if (s.getEmail().toLowerCase().contains("@") == false || s.getEmail().toLowerCase().contains(".") == false || s.getEmail().toLowerCase().contains(" ") == true ) {
                sb.append(s.getEmail() + " \n");
            }
        }
        System.out.println("The following emails are invalid: "+ "\n" + sb.toString());
    }

}


