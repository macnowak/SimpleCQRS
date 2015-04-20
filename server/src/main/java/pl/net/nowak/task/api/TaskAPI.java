package pl.net.nowak.task.api;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import pl.net.nowak.task.api.dto.TaskDTO;
import pl.net.nowak.task.domain.Task;
import pl.net.nowak.task.domain.TaskRepository;

/**
 * Author: Maciek
 */
@Controller
public class TaskAPI {

    @Autowired
    private TaskRepository repository;

    public void addNew(TaskDTO dto) {
        repository.save(new Task(dto.getName()));
    }
}
