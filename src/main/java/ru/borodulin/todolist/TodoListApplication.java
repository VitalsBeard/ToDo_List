package ru.borodulin.todolist;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodoListApplication {

	public static void main(String[] args) {
	SpringApplication.run(TodoListApplication.class, args);


	}
}


//TODO подумать насчет как передавать в json корреткно и как выводить просто по факту надо всего 2 задачи , внести и прочитать


/*
 $task = @{
>>     title = "тестовый запрос"
>>     description = "тесты"
>>     completed = $false
>>     id = 1
>>     date = (Get-Date -Format "yyyy-MM-ddTHH:mm:ss")

 */