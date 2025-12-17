package com.example.demo.service;
import com.example.demo.repository.StudentRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Student;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentRepository repo;

    @Override
    //create (or) Insert data
    public Student createData(Student stu) {
        return repo.save(stu);

    }

    @Override
    // Fetch all records
    public List<Student> fetchRecord() {
        return repo.findA11();
    }

}