package com.students;

public class Main {





    public static void main(String[] args) {
        // write your code here
        Roster sl = new Roster();
        sl.addStudent(sl.student1);
        sl.addStudent(sl.student2);
        sl.addStudent(sl.student3);
        sl.addStudent(sl.student4);
        sl.addStudent(sl.student5);
        sl.print_all();
        sl.print_invalid_emails();
        sl.print_average_grade("1");
        sl.remove("3");
        sl.remove("3");



    }
}
