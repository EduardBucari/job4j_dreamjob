package ru.job4j.dreamjob.model.servlet;

import ru.job4j.dreamjob.model.User;
import ru.job4j.dreamjob.model.store.DbStore;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class RegServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("req.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String email = req.getParameter("email");
        String password = req.getParameter("password");
        if (DbStore.instOf().findByEmailUser(email) == null) {
            HttpSession sc = req.getSession();
            User user = new User(name, email, password);
            DbStore.instOf().saveUser(user);
            sc.setAttribute("user", user);
            resp.sendRedirect(req.getContextPath() + "/posts.do");

        } else {
            req.setAttribute("error", "Пользователь с таким email уже существует. Попробуйде снова");
            req.getRequestDispatcher("reg.jsp").forward(req, resp);
        }
    }
}
