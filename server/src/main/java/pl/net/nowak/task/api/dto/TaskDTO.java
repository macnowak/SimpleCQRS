package pl.net.nowak.task.api.dto;

import lombok.Getter;
import lombok.Setter;
import org.joda.time.DateTime;

/**
 * Author: Maciek
 */
@Getter
@Setter
public class TaskDTO {

    private String id;
    private String name;
    private String status;
    private DateTime creationDate;
    private DateTime takeDate;
    private String href;

}
