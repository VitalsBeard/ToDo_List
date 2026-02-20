package ru.borodulin.todolist;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import ru.borodulin.todolist.model.Task;

import java.time.LocalDateTime;

@SpringBootTest
class TodoListApplicationTests {

	@Test
	void contextLoads() {
		Task task = new Task();
		task.setId(1);
		task.setTitle("title");
		task.setDescription("description");
		task.setCompleted(false);
		task.setDate(LocalDateTime.now());

		assert task.getId() == 1;
		assert task.getTitle().equals("title");
		assert task.getDescription().equals("description");
		assert task.isCompleted() == false;
		assert task.getDate().equals(LocalDateTime.now());

	}

} //TODO unitTest проверить на дублирование чтобы был 1 запрос а не несколько одинаковых
