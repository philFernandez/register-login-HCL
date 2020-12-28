package com.hcl.simplilearn.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.hcl.simplilearn.dao.IUserDao;
import com.hcl.simplilearn.dao.UserDaoImpl;
import com.hcl.simplilearn.model.User;

@WebServlet(name = "Register",
        description = "Servlet for handling backend registration of user",
        urlPatterns = {"/register"})
public class Register extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private IUserDao dataAccessLayer;

    @Override
    public void init() throws ServletException {
        dataAccessLayer = new UserDaoImpl();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) {
        try {
            registerNewUser(request, response);

        } catch (IOException e) {
            System.out.println("There was an IO error");
            e.printStackTrace();
        }
    }

    private void registerNewUser(HttpServletRequest request,
            HttpServletResponse response) throws IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String email = request.getParameter("email");
        User user = new User(username, password, email);
        if (dataAccessLayer.register(user)) {
            response.getWriter().println("Good!!");
        } else {
            response.getWriter().println("Bad!!");
        }
    }
}
