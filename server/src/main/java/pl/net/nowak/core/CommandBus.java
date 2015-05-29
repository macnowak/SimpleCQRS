package pl.net.nowak.core;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Collection;

/**
 * Created by mno on 2015-05-29.
 */
@Component
public class CommandBus {


    private Collection<CommandHandler> handlers;

    @Autowired
    public void setAvaliableHandlers(Collection<CommandHandler> handlers ) {
        this.handlers = handlers;
    }


    public void handle(Command command) {
        for (CommandHandler handler : handlers) {
            handler.handle(command);
        }

    }



}
