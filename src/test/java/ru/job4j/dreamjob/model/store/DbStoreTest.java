package ru.job4j.dreamjob.model.store;

import org.junit.Test;
import ru.job4j.dreamjob.model.Post;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class DbStoreTest {
    /**
    @Test
    public void whenCreatePost() {
        Store store = DbStore.instOf();
        Post post = new Post(0, "Java Job");
        store.save(post);
        Post postInDb = store.findById(post.getId());
        assertThat(postInDb.getName(), is(post.getName()));
    }

    @Test
    public void whenUpdatePost() {
        Store store = DbStore.instOf();
        Post post = new Post(1, "Java Job");
        Post post1 = new Post(1, "Java Middle");
        store.save(post);
        store.save(post1);
        Post postInDb = store.findById(1);
        assertThat(postInDb.getName(), is(post1.getName()));
    }

    @Test
    public void whenFindAllPost() {
        Store store = DbStore.instOf();
        Post post = new Post(1, "Java Job");
        List<Post> posts =  new ArrayList<>(store.findAllPosts());
        store.save(post);
        assertThat(posts.get(posts.size() - 1).getName(), is(post.getName()));
    }
    **/
}