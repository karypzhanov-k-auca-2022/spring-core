package kair.example;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class TaskConfiguration {

    @Bean("main-task")
    public Task task(TaskManager taskManager) {
        return new Task(taskManager);
    }

    @Bean
    public TaskManager taskManager(
//                @Qualifier("main-task") Task task
            Task task
    ) {

        return new TaskManager(task);
    }
}
