package ru.borodulin.todolist.service;

import org.springframework.stereotype.Service;
import ru.borodulin.todolist.controller.Controllers;
import ru.borodulin.todolist.model.Task;
import ru.borodulin.todolist.repository.TaskJsonRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class TaskService {

    private TaskJsonRepository taskJsonRepository;

    public TaskService(TaskJsonRepository taskJsonRepository) {
        this.taskJsonRepository = taskJsonRepository;
    }

    public void createTask(Task task) {
       taskJsonRepository.writeJson(task);
    }
    public List<Task> getAll() {
        return  taskJsonRepository.allTasks();
    }
}
