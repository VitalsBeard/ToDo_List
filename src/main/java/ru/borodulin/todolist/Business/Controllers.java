package ru.borodulin.todolist.Business;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.borodulin.todolist.Data.JsonCreate;
import ru.borodulin.todolist.Service.Task;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

@RestController
public class Controllers {
    @GetMapping("/info")
    public List<Task> getInfo() throws Exception {
        Path path = Paths.get(getClass().getClassLoader().getResource("tasks.json").toURI());
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(path.toFile(), new TypeReference<List<Task>>() {});
    }
    @PutMapping("/update")
    public void update(String title, String description, boolean isDone, String date, int id) {
        JsonCreate jsonCreate = new JsonCreate();

    }
}

