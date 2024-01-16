package com.caveman.demo.service;

import com.caveman.demo.entity.Student;
import com.caveman.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public Student saveStudent(String name) {
        Student student = Student.createStudent(name);
        return studentRepository.save(student);
    }

    public Student getStudentByName(String name) {
        return studentRepository.findByName(name);
    }
}
