package ru.job4j.dreamjob.model.store;

import ru.job4j.dreamjob.model.Post;

import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Store {

    private static final Store INST = new Store();

    private final Map<Integer, Post> posts = new ConcurrentHashMap<>();

    private Store() {
        posts.put(1, new Post(1, "Junior Java Job", "Junior", new Date(2021, Calendar.DECEMBER, 15)));
        posts.put(2, new Post(2, "Middle Java Job", "Middle", new Date(2021, Calendar.OCTOBER, 26)));
        posts.put(3, new Post(3, "Senior Java Job", "Senior", new Date(2021, Calendar.MAY, 30)));
    }

    public static Store instOf() {
        return INST;
    }

    public Collection<Post> findAll() {
        return posts.values();
    }
}
