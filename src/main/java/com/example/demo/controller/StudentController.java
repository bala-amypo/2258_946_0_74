package com.example.demo.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.*;
import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;

@RestController
public class StudentController {

    @Autowired
    StudentService ssr;

    @PostMapping("/adddata")
    public Student createData(@RequestBody Student stu) {
        return ssr.createData(stu);
    }

    @GetMapping("/getdata")
    public List<Student> fetchRecord() {   
        return ssr.fetchRecord();
    }
    @GetMapping("/fetchdatabyid/{id}")
    public Optional<Student> fetchDataById(@PathVariable int id){
        return ser.fetchDataById();

    }
}
