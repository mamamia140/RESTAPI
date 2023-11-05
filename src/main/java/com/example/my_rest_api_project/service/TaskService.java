package com.example.my_rest_api_project.service;

import com.example.my_rest_api_project.api.model.Status;
import com.example.my_rest_api_project.api.model.Task;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;

@Service
public class TaskService {

    Collection<Task> taskList;

    public TaskService(){
        taskList = new ArrayList<Task>();

        taskList.add(new Task("task1", Status.UNFINISHED, "simpletasknumber1"));

        taskList.add(new Task("task2", Status.UNFINISHED, "simpletasknumber2"));

        taskList.add(new Task("task3", Status.FINISHED, "simpletasknumber3"));
    }
    public Collection<Task> getTasks() {
        return taskList;
    }
}
