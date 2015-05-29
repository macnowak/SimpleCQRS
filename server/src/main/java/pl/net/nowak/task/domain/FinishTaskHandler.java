package pl.net.nowak.task.domain;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import pl.net.nowak.core.Command;
import pl.net.nowak.core.CommandHandler;

/**
 * Created by mno on 2015-05-29.
 */
@Component
@Slf4j
public class FinishTaskHandler implements CommandHandler {

    @Override
    public void handle(Command command) {
        log.info(this.getClass().getCanonicalName());
    }
}
