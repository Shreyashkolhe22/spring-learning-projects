package com.example.Spring.security;

import com.example.Spring.security.model.Student;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class DemoController {

    ArrayList<Student> students=new ArrayList<Student>(List.of(new Student(1,"aish"),new Student(2,"Mnajiri")));

    @GetMapping("csrf-token")
    public CsrfToken getCsrfToken(HttpServletRequest request) {
        return (CsrfToken) request.getAttribute("_csrf");
    }

    @GetMapping("/hello")
    public String hello()
    {
        return "welcome to page";
    }

    @GetMapping("/students")
    public List<Student> getstudents()
    {
        return students;
    }

    @PostMapping("/student")
    public String add(@RequestBody Student student)
    {
        students.add(student);
        return "sucess";
    }
}
