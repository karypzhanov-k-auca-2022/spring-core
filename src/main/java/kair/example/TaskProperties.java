package kair.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public class TaskProperties {
    @Value("${task.name}")
    private String name;

    @Value("${task.duration}")
    private Long duration;

    @Value("#{'${list.values}'.split(',')}")
    private List<Integer> values;

    @Value("#{'${set.values}'.split(',')}")
    private List<String> setValues;

    @Value("#{'${map.values}'.split(',')}")
    private Map<String, Integer> mapValues;

    @Override
    public String toString() {
        return "TaskProperties{" +
                "name='" + name + '\'' +
                ", duration=" + duration +
                ", values=" + values +
                ", setValues=" + setValues +
                ", mapValues=" + mapValues +
                '}';
    }
}
