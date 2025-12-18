package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    StudentService ser;

    @PostMapping("/add")
    public Student createData(@RequestBody Student stu) {
        return ser.createData(stu);
    }

    @GetMapping("/getall")
    public List<Student> fetchAll() {
        return ser.fetchRecord();
    }

    @GetMapping("/get/{id}")
    public Optional<Student> fetchById(@PathVariable Long id) {
        return ser.fetchDataById(id);
    }
    @PutMapping("updatedata/{id}")
    public String deleteDataById(@PathVariable Long id,RequestBody Student stu){
        return ser.
    }
}
