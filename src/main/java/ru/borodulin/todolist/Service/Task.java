package ru.borodulin.todolist.Service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import java.time.LocalDateTime;
import java.util.Date;

@Service
public record Task() {
    private static String title;
    private static String description;
    private static boolean completed;
    private static LocalDateTime date ;
    private static int id = 0 ;

    public void Task (String title, String description, boolean completed) {
       this.title = title;
        this.description = description;
        this.completed = completed;
        this.date = LocalDateTime.now();
        this.id = id++;
    }

    public static String getTitle() {
        return title;
    }

    public static void setTitle(String title) {
        Task.title = title;
    }

    public static String getDescription() {
        return description;
    }

    public static void setDescription(String description) {
        Task.description = description;
    }

    public static boolean isCompleted() {
        return completed;
    }

    public static void setCompleted(boolean completed) {
        Task.completed = completed;
    }

    public static LocalDateTime getDate() {
        return date;
    }

    public static void setDate(LocalDateTime date) {
        Task.date = date;
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Task.id = id;
    }
}
