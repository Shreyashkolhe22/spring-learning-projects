package com.todo.Todoapp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class TaskController {

    @GetMapping("/taskpage")
    public String taskPgae()
    {
        return "taskpage";
    }

    @PostMapping("/save")
    public String submittask(task task)
    {
        return "Result";
    }
}
