package ru.borodulin.todolist;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ru.borodulin.todolist.Data.JsonCreate;
import ru.borodulin.todolist.Service.Task;
import tools.jackson.databind.ext.javatime.ser.LocalDateTimeSerializer;

import java.io.IOException;
import java.net.http.HttpClient;
import java.time.LocalDateTime;

@SpringBootApplication
public class TodoListApplication {

	public static void main(String[] args) {
		SpringApplication.run(TodoListApplication.class, args);
		HttpClient client = HttpClient.newHttpClient();


	}
}

	//curl -H "Content-Type: application/json" -d '{ "title":"foo", "body":"bar", "id": 1 }'
//https://localhost:8080/createTask
//postman и подумать насчет list
//TODO подумать насчет как передавать в json корреткно и как выводить просто по факту надо всего 2 задачи , внести и прочитать


