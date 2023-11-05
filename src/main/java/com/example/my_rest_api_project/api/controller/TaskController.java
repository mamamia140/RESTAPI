package com.example.my_rest_api_project.api.controller;

import com.example.my_rest_api_project.api.model.Task;
import com.example.my_rest_api_project.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Collection;

@RestController
public class TaskController {

    private TaskService service;

    @Autowired
    public TaskController(TaskService service){
        this.service = service;
    }
    @GetMapping("/task")
    public Collection<Task> getTasks(){
        return service.getTasks();
    }
}
