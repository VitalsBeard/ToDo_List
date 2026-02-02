package ru.borodulin.todolist.repository;

import com.fasterxml.jackson.core.type.TypeReference;
import org.springframework.stereotype.Repository;
import ru.borodulin.todolist.model.Task;
import tools.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;


@Repository
@SuppressWarnings("unchecked")
public class TaskJsonRepository {
    ObjectMapper mapper = new ObjectMapper();
    String path = "src/main/resources/tasks.json";
    File file = new File(path);
    List<Task> taskArrayList = new ArrayList<>();

    public void checkFile() throws IOException {
        if (!file.exists()) {
            Files.createFile(Paths.get(path));
        }
    }


    public void writeJson(Task task) {
        try {
            checkFile();

           taskArrayList = mapper.readValue(file, taskArrayList.getClass());//TODO инициализая нет , чек
            taskArrayList.add(task);
            mapper.writeValue(file, taskArrayList);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public List <Task> allTasks ()  {
        taskArrayList = mapper.readValue(file, taskArrayList.getClass());
        return taskArrayList;
    }


}


// Надо не сразу в json а в лист и потом уже в json