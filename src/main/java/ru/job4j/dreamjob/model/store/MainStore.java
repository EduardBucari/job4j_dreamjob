package ru.job4j.dreamjob.model.store;

import ru.job4j.dreamjob.model.Candidate;
import ru.job4j.dreamjob.model.Post;

public class MainStore {
    public static void main(String[] args) {
        Store store = DbStore.instOf();
        for (Candidate candidate : store.findAllCandidates()) {
            System.out.println(candidate.getId() + " " + candidate.getName());
        }
        for (Post post : store.findAllPosts()) {
            System.out.println(post.getId() + " " + post.getName());
        }

        System.out.println(store.findByIdCandidate(1));
        System.out.println(store.findById(1));
    }
}
