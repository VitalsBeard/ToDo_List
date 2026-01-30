package ru.borodulin.todolist.Data;

import org.springframework.stereotype.Repository;
import ru.borodulin.todolist.Service.Task;
import tools.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;


@Repository
@SuppressWarnings("unchecked")
public class JsonCreate {
ObjectMapper mapper = new ObjectMapper();
String path = "src/main/resources/tasks.json";
File file = new File(path);
List<Task> taskArrayList = new ArrayList<>();
    public boolean checkFile() throws IOException {
        if (!file.exists()) {
            Files.createFile(Paths.get(path));
            return true;
        }else {
            return true;
        }
    }


    public void writeJson(List<Task> tasks) throws IOException {
       if (checkFile()) {
           taskArrayList =  mapper.readValue(file, List.class);
           taskArrayList.addAll(tasks);
           String result = String.join("\n",taskArrayList.toString());
           mapper.writeValue(file, result);
        }


    }

}
// Надо не сразу в json а в лист и потом уже в json