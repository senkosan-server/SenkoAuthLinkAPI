package com.senkoauhlink.senkoAuthLinkAPI.api.event;

import java.util.Collection;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Consumer;

public final class EventManager {

    private final ConcurrentHashMap<Class<?>, ConcurrentHashMap<Consumer<?>, Boolean>> handlers = new ConcurrentHashMap<>();

    @SuppressWarnings("unchecked")
    public <T> void register(Class<T> eventClass, Consumer<T> handler) {
        handlers.computeIfAbsent(eventClass, k -> new ConcurrentHashMap<>())
                .put(handler, Boolean.TRUE);
    }

    @SuppressWarnings("unchecked")
    public <T> void unregister(Class<T> eventClass, Consumer<T> handler) {
        ConcurrentHashMap<Consumer<?>, Boolean> map = handlers.get(eventClass);
        if (map != null) {
            map.remove(handler);
        }
    }

    @SuppressWarnings("unchecked")
    public <T> void fire(T event) {
        ConcurrentHashMap<Consumer<?>, Boolean> map = handlers.get(event.getClass());
        if (map != null) {
            for (Consumer<?> handler : map.keySet()) {
                try {
                    ((Consumer<T>) handler).accept(event);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
