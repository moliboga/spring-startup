package com.example.logic;

import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component
public class EventListenerComponent {
    private static final Logger LOG
            = Logger.getLogger(EventListenerComponent.class.getName());

    public static int counter;

    @EventListener
    public void onApplicationEvent(ContextRefreshedEvent event) {
        LOG.info("Increment counter");
        counter++;
    }
}
