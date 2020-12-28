package com.hcl.simplilearn.servlet;

import java.io.IOException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "Register",
        description = "Servlet for handling backend registration of user",
        urlPatterns = {"/register"})
public class Register extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws IOException {
        response.getWriter().println("I work!!");
        String s = request.getParameter("username");
        response.getWriter().println(s);
        s = request.getParameter("password");
        response.getWriter().println(s);
        s = request.getParameter("email");
        response.getWriter().println(s);
    }
}
