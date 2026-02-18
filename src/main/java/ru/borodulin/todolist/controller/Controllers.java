package ru.borodulin.todolist.controller;


import org.springframework.web.bind.annotation.*;
import ru.borodulin.todolist.model.Task;
import ru.borodulin.todolist.repository.TaskJsonRepository;
import ru.borodulin.todolist.service.TaskService;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

@RestController
public class Controllers {

    private TaskService taskService;
    TaskJsonRepository taskJsonRepository = new TaskJsonRepository();

    public Controllers(TaskService taskService) {
        this.taskService = taskService;

    }

    @PostMapping("/createTask")

    public void create(@RequestBody Task task) {
        System.out.println(task);
        taskService.createTask(task);
    }

    @GetMapping("/getAll")
    public List<Task> getAll() {
        return taskService.getAll();
    }

    @DeleteMapping ("/delete/{id}")
    public void delete(@PathVariable int id){
        taskService.delete(id);
    }

    @PutMapping ("/change/{id}")
    public void change (@PathVariable int id, @RequestBody List<Task> task){
        taskService.change(id, task);
    }

}



