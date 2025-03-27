package kair.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        // Scanning Beans from package kair.example
        // Create the application context
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("kair.example");
        var properties = context.getBean(ConfigurationProperties.class);
        properties.toString();

        System.out.println("-------------------------------------------------");
    }
}