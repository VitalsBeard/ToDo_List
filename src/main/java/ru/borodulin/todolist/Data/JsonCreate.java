package ru.borodulin.todolist.Data;

import org.springframework.stereotype.Repository;
import ru.borodulin.todolist.Service.Task;
import tools.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;


@Repository
public class JsonCreate {
ObjectMapper mapper = new ObjectMapper();
String path = "src/main/resources/tasks.json";
File file = new File(path);
List<Task> tasks = new ArrayList<>();

public boolean checkFile() throws IOException {
    if (!file.exists()) {
        Files.createFile(Paths.get(path));
        return true;
    }
    return false;
}


    public void writeJson(Task task) throws IOException {
       if (checkFile()) {
          tasks =  mapper.readValue(file, List.class);
          tasks.add(task);
          mapper.writeValue(file, task);
        } else {
            checkFile();
            mapper.writeValue(file, task);
        }


    }

    public String getInfo(Path path) throws IOException {//getALl
        return mapper.readValue(file, String.class);
    }
}
// Надо не сразу в json а в лист и потом уже в json