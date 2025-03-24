package kair.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TaskManager {
    private final Task task;

    @Autowired
    public TaskManager(Task task) {
        this.task = task;
    }

    void printTask() {
        if (task == null) {
            System.out.println("Task is null");
        } else {
            System.out.println("Current Task: " + task.toString());
        }
    }
}
