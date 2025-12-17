package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;

@RestController
public class StudentController {

    @Autowired
    StudentService ssr;

    @PostMapping("/adddata")
    public Student createDate(@RequestBody Student stu){
        return  ssr.createData(stu);
    }

    @GetMapping("/getdata")
    
    public Student fetchRecord(){
        return ssr.fetchRecord();
    }
}