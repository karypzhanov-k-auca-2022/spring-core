package kair.example;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype")
public class TaskManager {
    private final Task task;

    @Autowired
    public TaskManager(Task task) {
        this.task = task;
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("TaskManager postConstruct");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("TaskManager preDestroy");
    }

    void printTask() {
        if (task == null) {
            System.out.println("Task is null");
        } else {
            System.out.println("Current Task: " + task.toString());
        }
    }

    public Task getTask() {
        return task;
    }
}
