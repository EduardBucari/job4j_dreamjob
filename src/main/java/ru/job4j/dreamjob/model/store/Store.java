package ru.job4j.dreamjob.model.store;

import ru.job4j.dreamjob.model.Candidate;
import ru.job4j.dreamjob.model.City;
import ru.job4j.dreamjob.model.Post;
import ru.job4j.dreamjob.model.User;

import java.util.Collection;

public interface Store {

    Collection<Post> findAllPosts();

    Collection<Candidate> findAllCandidates();

    Collection<City> findAllCity();

    void savePost(Post post);

    void saveCandidate(Candidate candidate);

    void deletePost(int id);

    void deleteCandidate(int id);

    Post findByIdPost(int id);

    Candidate findByCandidate(int id);

    Post findByNamePost(String name);

    Candidate findByNameCandidate(String name);

    User findByEmail(String email);

    Collection<User> findAllUsers();
    City findByIdCity(int id);

    void saveUser(User user);

    void deleteUser(int id);
}
