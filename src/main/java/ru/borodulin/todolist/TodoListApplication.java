package ru.borodulin.todolist;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ru.borodulin.todolist.Data.JsonCreate;
import ru.borodulin.todolist.Service.Task;
import tools.jackson.databind.ext.javatime.ser.LocalDateTimeSerializer;

import java.io.IOException;
import java.time.LocalDateTime;

@SpringBootApplication
public class TodoListApplication {

	public static void main(String[] args) {
		SpringApplication.run(TodoListApplication.class, args);

			Task task = new Task("title", "description", false, null, 1);
			JsonCreate jsonCreate = new JsonCreate();
			try {
				jsonCreate.writeJson(task);
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}
	}

	//curl -H "Content-Type: application/json" -d '{ "title":"foo", "body":"bar", "id": 1 }'
//https://localhost:8080/createTask
//postman


//Цель отработать 2 адреса
// 1/ createTask
// 2/ getAllTask