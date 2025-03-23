package kair.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        // Scanning Beans from package kair.example
        // Create the application context
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("kair.example");
        Task task = context.getBean(Task.class);
        Task task2 = (Task) context.getBean("main-task");

        System.out.println(task);
        System.out.println(task2);

        if (task.equals(task2))
            System.out.println("same");

        TaskManager taskManager = context.getBean(TaskManager.class);
        taskManager.printTask();

        // Create without application context
        Task taskWithoutContext = new Task();
        System.out.println(taskWithoutContext);
        TaskManager taskManagerWithoutContext = new TaskManager(taskWithoutContext);
        taskManagerWithoutContext.printTask();

        System.out.println("-------------------------------------------------");

        // Scanning Beans from package TaskConfiguration
        // Create the application context2
        AnnotationConfigApplicationContext context2 = new AnnotationConfigApplicationContext(TaskConfiguration.class);
        Task task2FromConfig = context2.getBean(Task.class);
        Task task2FromConfig2 = (Task) context2.getBean("main-task");

        System.out.println(task2FromConfig);
        System.out.println(task2FromConfig2);

        if (task2FromConfig.equals(task2FromConfig2))
            System.out.println("same");

        TaskManager taskManager2 = context2.getBean(TaskManager.class);
        taskManager2.printTask();

    }
}