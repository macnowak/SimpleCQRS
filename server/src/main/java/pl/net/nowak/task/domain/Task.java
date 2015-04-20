package pl.net.nowak.task.domain;

import lombok.Getter;
import org.joda.time.DateTime;

/**
 * Author: Maciek
 */
@Getter
public class Task {

    public enum Status {
        NEW,
        IN_PROGRES,
        FINISHED
    }


    private String id;
    private String name;
    private Status status;
    private DateTime creationDate;
    private DateTime takeDate;

    Task() {
    }

    public Task(String name) {
        this.name = name;
        this.status = Status.NEW;
        this.creationDate = DateTime.now();
    }

    public void updateTaskName(final String name) {
        this.name = name;
    }

    public void take() {
        this.status = Status.IN_PROGRES;
        this.takeDate =DateTime.now();
    }

    public void finish() {
        if(this.status == Status.IN_PROGRES) {
            this.status = Status.FINISHED;
        }else {
            throw new IllegalStateException("Can not finish task in state : " + this.status.name());
        }
    }
}
