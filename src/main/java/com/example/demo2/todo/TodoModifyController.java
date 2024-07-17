package com.example.demo2.todo;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "todoModifyController", urlPatterns = "/todo/modify")
public class TodoModifyController extends HttpServlet {
//변경, 삭제
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("TodoModifyController ... doGet ...");
        RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/todo/modify.jsp");
        dispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("TodoModifyController ... doPost ...");
        resp.sendRedirect("/todo/list");
    }
}
