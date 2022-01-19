package ru.job4j.dreamjob.model.servlet;

import ru.job4j.dreamjob.model.User;
import ru.job4j.dreamjob.model.store.DbStore;
import ru.job4j.dreamjob.model.store.Store;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class AuthServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        User admin = DbStore.instOf().findByEmailUser(req.getParameter("email"));
        if (admin != null && admin.getPassword().equals(req.getParameter("password"))) {
            HttpSession sc = req.getSession();
            sc.setAttribute("user", admin);
            resp.sendRedirect(req.getContextPath() + "/posts.do");
        } else {
            req.setAttribute("error", "Не верный email или пароль");
            req.getRequestDispatcher("login.jsp").forward(req, resp);
        }
    }
}
