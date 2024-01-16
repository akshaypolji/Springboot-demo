package com.caveman.demo.controller;

import com.caveman.demo.model.Greeting;
import com.caveman.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {

    private final StudentService studentService;

    @Autowired
    public GreetingController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name, Model model) {
        String greetingMessage = String.format("Hello %s!", name);
        model.addAttribute("greeting", new Greeting(greetingMessage));
        return "hello";
    }

    @PostMapping("/addStudent")
    public String addStudent(@RequestParam String studentName) {
        studentService.saveStudent(studentName);
        return "redirect:/hello";
    }

    @GetMapping("/getStudent")
    public String getStudent(@RequestParam String studentName, Model model) {
        model.addAttribute("student", studentService.getStudentByName(studentName));
        return "student";
    }
}