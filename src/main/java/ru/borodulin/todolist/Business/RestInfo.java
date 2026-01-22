package ru.borodulin.todolist.Business;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.borodulin.todolist.Data.JsonCreate;
import ru.borodulin.todolist.Service.Task;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@RestController
public class RestInfo {
    @GetMapping("/info")
    public String getInfo() throws Exception {
        Path path = Paths.get(getClass().getClassLoader().getResource("tasks.json").toURI());
        return Files.readString(path);
    }
    @PutMapping("/update")
    public void update(String title, String description, boolean isDone, String date, int id) {
        JsonCreate jsonCreate = new JsonCreate();
        try {
            jsonCreate.writeJson(new Task(title, description, isDone, date, id));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
