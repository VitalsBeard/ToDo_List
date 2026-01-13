package ru.borodulin.todolist.Business;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.borodulin.todolist.Data.JsonCreate;

import java.io.File;
import java.io.IOException;

@RestController
public class RestInfo {
    @GetMapping ("/info")

    public String getInfo() throws IOException {
        JsonCreate jsonCreate = new JsonCreate();
        return jsonCreate.getInfo();
    }
}
