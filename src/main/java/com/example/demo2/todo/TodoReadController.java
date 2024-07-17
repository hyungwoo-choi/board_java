package com.example.demo2.todo;

import com.example.demo2.todo.Service.TodoService;
import com.example.demo2.todo.dto.TodoDTO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "todoReadController", urlPatterns = "/todo/read")
public class TodoReadController extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        System.out.println("TodoReadController... doGet...");

        Long tno = Long.parseLong(req.getParameter("tno"));

        TodoDTO dto = TodoService.INSTANCE.GET(tno);

        req.setAttribute("dto", dto);

        req.getRequestDispatcher("/WEB-INF/todo/read.jsp").forward(req, resp);
    }
}
