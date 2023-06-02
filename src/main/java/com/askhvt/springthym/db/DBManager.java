package com.askhvt.springthym.db;

import java.util.ArrayList;

public class DBManager {
    private static ArrayList<Student> students = new ArrayList<>();
    private static Long id = 3L;

    static {
        students.add(new Student(1L, "Askhat", "Kaim", 95, "A"));
        students.add(new Student(2L, "Duman", "Kerim", 85, "B"));
    }

    public static ArrayList<Student> getStudents(){
        return students;
    }

    public static void addStudent(Student student){
        student.setId(id);
        id++;
        students.add(student);
    }
}
