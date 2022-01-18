package ru.job4j.dreamjob.model.store;

import ru.job4j.dreamjob.model.Candidate;
import ru.job4j.dreamjob.model.Post;
import ru.job4j.dreamjob.model.User;

import java.util.Collection;

public interface Store {

    Collection<Post> findAllPosts();

    Collection<Candidate> findAllCandidates();

    void save(Post post);

    void saveCnd(Candidate post);

    Post findById(int id);

    Candidate findByIdCnd(int id);

    Candidate deleteCnd(int id);

    void saveUser(User user);

    User findByEmailUser(String email);
}
