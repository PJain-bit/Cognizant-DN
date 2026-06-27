package com.library;

import com.library.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LibraryManagementApplication {
    public static void main(String[] args) {
        // 1. Load the XML configuration file to initialize the Spring IoC Container
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // 2. Retrieve the configured BookService bean from the container
        BookService bookService = context.getBean("bookService", BookService.class);

        // 3. Call the method to verify Dependency Injection works seamlessly
        bookService.runService();
    }
}
