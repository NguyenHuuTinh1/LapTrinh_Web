package vn.edu.hcmuaf;

import vn.edu.hcmuaf.Service.UserService;
import vn.edu.hcmuaf.model.User;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "LoginController", value = "/login")
public class LoginController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/views/task3/login.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        User user = UserService.getInstance().checkLogin(username, password);
        if (user == null) {
            request.setAttribute("error", "Username or password is incorrect");
            request.getRequestDispatcher("/views/task3/login.jsp").forward(request, response);
        } else {
            HttpSession session = request.getSession(true);
            session.setAttribute("auth", user);
            response.sendRedirect("/product");
        }
    }

}
