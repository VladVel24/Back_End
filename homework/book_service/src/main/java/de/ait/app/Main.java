package de.ait.app;

import de.ait.app.controller.BookController;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("de.ait.app");
        BookController controller = context.getBean(BookController.class);

        System.out.println(controller.getAllBooks());

        System.out.println(controller.getBookById(2L));


    }
}