package ru.job4j.dreamjob.model.servlet;

import ru.job4j.dreamjob.model.Post;
import ru.job4j.dreamjob.model.store.DbStore;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 * class PostServlet
 */
public class PostServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("posts", new ArrayList<>(DbStore.instOf().findAllPosts()));
        req.setAttribute("user", req.getSession().getAttribute("user"));
        req.getRequestDispatcher("posts.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        DbStore.instOf().savePost(
                new Post(
                        Integer.valueOf(req.getParameter("id")),
                        req.getParameter("vacancy"),
                        LocalDateTime.now()
                )
        );
        resp.sendRedirect(req.getContextPath() + "/posts.do");
    }
}