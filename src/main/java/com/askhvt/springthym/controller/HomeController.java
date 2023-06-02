package com.askhvt.springthym.controller;

import com.askhvt.springthym.db.DBManager;
import com.askhvt.springthym.db.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;

@Controller
public class HomeController {

    @GetMapping(value = "/")
    public String indexPage(Model model){
        ArrayList<Student> studentArray= DBManager.getStudents();
        model.addAttribute("students", studentArray);
        return "index";
    }

    @GetMapping(value = "/add-student")
    public String addStudentPage(Model model){
        return "addstudent";
    }

    @PostMapping(value = "/add-student")
    public String addStudent(Student student){
        DBManager.addStudent(student);
        return "redirect:/";
    }


}
