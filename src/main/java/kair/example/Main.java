package kair.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        // Scanning Beans from package kair.example
        // Create the application context
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("kair.example");
//        Task task1 = context.getBean(Task.class);
//        Task task2 = context.getBean(Task.class);
//
//        System.out.println(task1 == task2);
//
//        TaskManager taskManager2 = context.getBean(TaskManager.class);
//        taskManager2.printTask();

        TaskExecutor taskExecutor = context.getBean(TaskExecutor.class);
        taskExecutor.executeTask();


        System.out.println("-------------------------------------------------");
    }
}