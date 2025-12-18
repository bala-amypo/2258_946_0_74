package com.example.demo.controller;

import java.util.*;

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
        Optional<Student> student=ser.fetchDataById(id);
        if(student.isPresent()){
            stu.setId(id);
            ser.createData(stu);
            return "Data Updated Succrssfully";
        }
        else{
            return id+"not found";
        }
    }
    @DeleteMapping("/deletedata/{id}")
    public String deleteDataBy(@PathVaraiable Long id){
        if(student.isPresent()){
            ser.deleteData(id);
            return "Data deleted Successfully";
        }
        else{
            return id+"not found";
        }
    }
}
