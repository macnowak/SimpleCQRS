package pl.net.nowak.task.api.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.net.nowak.core.CommandBus;
import pl.net.nowak.task.api.FinishTaskCommand;
import pl.net.nowak.task.api.TaskAPI;
import pl.net.nowak.task.api.dto.TaskDTO;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: Maciek
 */
@RestController
@RequestMapping("/tasks")
public class TaskRestApi {

    @Autowired
    TaskAPI taskAPI;

    @Autowired
    CommandBus bus;

    @RequestMapping(method = RequestMethod.GET)
    public @ResponseBody List<TaskDTO> getTasks() {
        return new ArrayList<TaskDTO>();
    }

    @RequestMapping(method = RequestMethod.POST)
    public void addTask(@RequestBody TaskDTO dto) {
        taskAPI.addNew(dto);
    }

    //TODO verb in url !!!
    @RequestMapping(value = "/{id}/finish" , method = RequestMethod.PUT)
    public void finishTask(@PathVariable String id) {
        bus.handle(new FinishTaskCommand(id));
    }

}
