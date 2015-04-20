package pl.net.nowak.task.api;

import lombok.Getter;
import pl.net.nowak.core.Command;

/**
 * Author: Maciek
 */
@Getter
public class FinishTaskCommand implements Command{
    private final String id;

    public FinishTaskCommand(String id) {
        this.id = id;
    }

}
