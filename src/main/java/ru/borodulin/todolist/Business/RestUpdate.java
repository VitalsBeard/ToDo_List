package ru.borodulin.todolist.Business;

import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.borodulin.todolist.Data.JsonCreate;
import ru.borodulin.todolist.Service.Task;

import java.io.IOException;
import java.time.LocalDateTime;

@RestController
public class RestUpdate {
    @PutMapping ("/update")
    public void update(String title, String description, boolean isDone, LocalDateTime date, int id) {
        JsonCreate jsonCreate = new JsonCreate();
        try {
            jsonCreate.writeJson(new Task(title, description, isDone, date, id));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
