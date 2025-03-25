package kair.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TaskExecutor {
    private final TaskManager taskManager;
    private final Task task;

    @Autowired
    public TaskExecutor(TaskManager taskManager, Task task) {
        this.taskManager = taskManager;
        this.task = task;
    }

    public void executeTask() {
        System.out.println("Current Task: " + taskManager.getTask().toString());
        System.out.println("Executing task: " + task.getName() + " for " + task.getDuration() + " seconds");
    }


}
