package ru.borodulin.todolist.Business;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import ru.borodulin.todolist.Data.JsonCreate;
import ru.borodulin.todolist.Service.Task;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Scanner;

@Component
public class CreateTask  implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите название задачи: ");
        String title = scanner.nextLine();
        System.out.println("Введите описание задачи: ");
        String description = scanner.nextLine();
        System.out.println("Введите дату задачи: ");
        String date = scanner.nextLine();
        System.out.println("Введите id задачи: ");
        int id = scanner.nextInt();
        JsonCreate jsonCreate = new JsonCreate();
        jsonCreate.writeJson(new Task(title, description, false, date, id));
    }

}
