package ru.job4j.dreamjob.model.store;

import ru.job4j.dreamjob.model.Candidate;
import ru.job4j.dreamjob.model.Post;

import java.util.Collection;

public interface Store {
    Collection<Post> findAllPosts();

    Collection<Candidate> findAllCandidates();

    void save(Post post);
    void save(Candidate post);

    Post findById(int id);
    Candidate findByIdCandidate(int id);
}
