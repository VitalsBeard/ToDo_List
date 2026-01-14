package ru.borodulin.todolist.Service;

import java.time.LocalDateTime;

public class Task {

    private static String title;
    private static String description;
    private static boolean completed;
    private static LocalDateTime date ;
    private static int id = 0 ;

    public Task (String title, String description, boolean completed, LocalDateTime date, int id) {
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
