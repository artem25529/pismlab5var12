package com.es.servlets;

import com.es.service.StringConverter;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/servlet")
public class MyServlet extends HttpServlet {
    @EJB
    private StringConverter converter;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String s = req.getParameter("string");
        req.setAttribute("res", converter.convert(s));

        req.getRequestDispatcher("/WEB-INF/pages/result.jsp").forward(req, resp);
    }
}
