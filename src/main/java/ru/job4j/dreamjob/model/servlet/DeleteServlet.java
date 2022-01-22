package ru.job4j.dreamjob.model.servlet;

import ru.job4j.dreamjob.model.store.DbStore;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class DeleteServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("id");
        int id = Integer.parseInt(name);
        DbStore.instOf().deleteCandidate(id);
        req.setAttribute("candidates", DbStore.instOf().findAllCandidates());
        req.getRequestDispatcher("candidates.jsp").forward(req, resp);
    }
}