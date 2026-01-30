package ru.borodulin.todolist.controller;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.borodulin.todolist.model.Task;
import ru.borodulin.todolist.service.TaskService;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

@RestController
public class Controllers {

    private TaskService taskService;

    public Controllers(TaskService taskService) {
        this.taskService = taskService;

    }

    @PutMapping("/createTask")
    public void create(Task task) {
       taskService.createTask(task);
    }

    @GetMapping("/getAll")
    public List<Task> getAll() {
        return taskService.getAll();
    }
}

