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
        JsonCreate jsonCreate = new JsonCreate();
        Scanner scanner = new Scanner(System.in);

        while (!scanner.nextLine().equals("exit")){
            if(flagTrue(scanner)) break;
            System.out.println("Summary of the task: ");
            String title = scanner.nextLine();
            if(flagTrue(scanner)) break;
            System.out.println("Description of the task: ");
            String description = scanner.nextLine();
            if(flagTrue(scanner)) break;
            System.out.println("Date of the task: ");
            String date = scanner.nextLine();
            if(flagTrue(scanner)) break;
            System.out.println("Id of the task: ");
            int id = scanner.nextInt();
            if(flagTrue(scanner)) break;
            System.out.println("If you want to exit, type exit");
            jsonCreate.writeJson(new Task(title, description, false, date, id));
        }
    }
    public boolean flagTrue(Scanner scanner) {
        if (scanner.nextLine().equals("exit")){
            return true;
        }
        return false;
    }

}

// Создать SoftUi , надо проверять надо смотреть , уйти от консоли, сделать арихитектуру TODO
