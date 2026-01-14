package ru.borodulin.todolist;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ru.borodulin.todolist.Data.JsonCreate;
import ru.borodulin.todolist.Service.Task;

@SpringBootApplication
public class TodoListApplication {

	public static void main(String[] args) {
		SpringApplication.run(TodoListApplication.class, args);

		Task task = new Task("title", "description", false);
		JsonCreate jsonCreate = new JsonCreate();
		try {
			jsonCreate.writeJson(task);
		}
	}

}
