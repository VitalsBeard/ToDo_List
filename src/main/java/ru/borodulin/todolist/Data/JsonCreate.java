package ru.borodulin.todolist.Data;

import org.springframework.stereotype.Repository;
import ru.borodulin.todolist.Service.Task;
import tools.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;


@Repository
public class JsonCreate {
ObjectMapper mapper = new ObjectMapper();

if (!file.exists()) {
        File file = new File("src/main/resources/tasks.json");
}


    public void writeJson(Task task) throws IOException {
        mapper.writeValue(file, task);
    }

    public String getInfo() throws IOException {
        return mapper.readValue(file, String.class);
    }
}
