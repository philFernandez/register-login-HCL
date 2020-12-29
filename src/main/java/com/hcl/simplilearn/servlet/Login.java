package com.hcl.simplilearn.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.hcl.simplilearn.dao.IUserDao;
import com.hcl.simplilearn.dao.UserDaoImpl;
import com.hcl.simplilearn.model.User;

@WebServlet(
    name="Login",
    description = "Servlet for handling login on backend",
    urlPatterns = {"/login"}
)
public class Login extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private IUserDao dataAccessLayer;

    @Override
    public void init() throws ServletException {
        dataAccessLayer = new UserDaoImpl();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
          String username = request.getParameter("username");
          String password = request.getParameter("password");
          User user = dataAccessLayer.login(username, password);
          if(user != null) {
              HttpSession session = request.getSession(true);
              session.setAttribute("user", user);
              response.sendRedirect("dashboard.jsp");
          } else {
              response.sendRedirect("loginError.jsp");
          }
    }
}
