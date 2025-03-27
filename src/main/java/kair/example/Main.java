package kair.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        // Scanning Beans from package kair.example
        // Create the application context
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("kair.example");
        Task task1 = context.getBean(Task.class);
        Task task2 = context.getBean(Task.class);

        var properties = context.getBean(TaskProperties.class);
        System.out.println(properties);


        System.out.println("-------------------------------------------------");
    }
}