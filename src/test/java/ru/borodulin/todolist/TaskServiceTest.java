package ru.borodulin.todolist;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import ru.borodulin.todolist.model.Task;
import ru.borodulin.todolist.repository.TaskJsonRepository;
import ru.borodulin.todolist.service.TaskService;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

public class TaskServiceTest {
    // Т.к. мы тестируем сервис, нам нужен какой-нибудь фейковый репозиторий, чтобы он возвращал то, что нам надо
    @Mock
    TaskJsonRepository repository;

    @Test
    void createTask() {
        TaskService taskService = new TaskService(repository);
        Task task = new Task();
        task.setTitle("test");
        task.setId(1);
        taskService.createTask(task);
        assertNotNull(repository);
        // Репозиторий сейчас не возвращает никакого ответа, т.е. мы не знаем сохранил он что-то или нет.
        // Обычно возвращяют либо true/false, либо сам объект, который сохранили с подставленным id. Сейчас этот тест не проверяет ничего(
        // when(repository.writeJson(task)).thenReturn(task);
    }

    @Test
    void getAll() {
        TaskService taskService = new TaskService(repository);

        // Когда приходит запрос в репозиторий, он должен вернуть два элемента
        when(repository.allTasks()).thenReturn(List.of(new Task(), new Task()));
        List<Task> tasks = taskService.getAll();

        // Проверяем, что список не пустой
        assertNotNull(tasks);

        // Проверяем, что в списке 2 элемента
        assertEquals(2, tasks.size());
    }
}
