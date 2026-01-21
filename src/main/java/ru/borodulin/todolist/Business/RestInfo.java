package ru.borodulin.todolist.Business;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.borodulin.todolist.Data.JsonCreate;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

@RestController
public class RestInfo {
    @GetMapping("/info")
    public String getInfo() throws IOException {
        JsonCreate jsonCreate = new JsonCreate();
        Path path = Paths.get("main\\resources\\tasks.json");
        return jsonCreate.getInfo(path);
    }
}
