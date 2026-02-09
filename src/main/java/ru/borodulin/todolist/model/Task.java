package ru.borodulin.todolist.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDateTime;

public class Task {

    private String title;
    private String description;
    private boolean completed;

    private LocalDateTime date;
    private int id;

    public Task() {
    }

    public Task(String title, String description, boolean completed, LocalDateTime date, int id) {
        this.title = title;
        this.description = description;
        this.completed = completed;
        this.date = LocalDateTime.now();
        this.id = id;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Task{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", completed=" + completed +
                ", date=" + date +
                ", id=" + id +
                '}';
    }
}
