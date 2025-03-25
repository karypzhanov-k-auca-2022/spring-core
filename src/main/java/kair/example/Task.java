package kair.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.concurrent.ThreadLocalRandom;

@Component("main-task") // This will create a singleton instance of Task
@Scope("prototype")
public class Task {
    private final String name;
    private final Long duration;


    public Task() {
        this.name = "Task" + ThreadLocalRandom.current().nextInt();
        this.duration = 60L;
    }

//    @Autowired
//    public void setTaskManager(TaskManager taskManager) {
//        this.taskManager = taskManager;
//    }

    @Override
    public String toString() {
        return "Task {" +
                "name='" + name + '\'' +
                ", duration=" + duration +
                '}';
    }

    public String getName() {
        return name;
    }

    public Long getDuration() {
        return duration;
    }
}
