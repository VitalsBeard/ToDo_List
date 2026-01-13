package ru.borodulin.todolist.Service;

import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import java.time.LocalDateTime;
import java.util.Date;
@Component
@Validated
public record Task() {
    private static String title;
    private static String description;
    private static boolean completed;
    private static LocalDateTime date ;

}
