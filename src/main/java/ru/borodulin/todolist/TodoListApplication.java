package ru.borodulin.todolist;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodoListApplication {

	public static void main(String[] args) {
	SpringApplication.run(TodoListApplication.class, args);

	}
}

	//curl -H "Content-Type: application/json" -d '{ "title":"foo", "body":"bar", "id": 1 }'
//https://localhost:8080/createTask
//postman и подумать насчет list
//TODO подумать насчет как передавать в json корреткно и как выводить просто по факту надо всего 2 задачи , внести и прочитать


