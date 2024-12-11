package org.landlord.demo02;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @description:
 * @author: landlord
 * @date: 2024/12/10 16:44
 */
public class EventManager {
    public enum EventType {
        MQ, MESSAGE
    }

    Map<Enum<EventType>, List<EventListener>> events = new HashMap<>();

    public EventManager(Enum<EventType>... eventTypes) {
        for (Enum<EventType> eventType : eventTypes) {
            events.put(eventType, new ArrayList<>());
        }
    }

    public void subsctibe(Enum<EventType> eventType, EventListener eventListener) {
        events.get(eventType).add(eventListener);
    }

    public void unsubscribe(Enum<EventType> eventType, EventListener eventListener) {
        events.get(eventType).remove(eventListener);
    }

    public void notify(Enum<EventType> eventType, EventResult result) {
        for (EventListener eventListener : events.get(eventType)) {
            eventListener.doEvent(result);
        }
    }
}
