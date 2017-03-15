package server;

import model.Calculator;
import model.Tabul;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalTime;

/**
 * Created by eugen on 15.03.2017.
 */
@WebServlet(name = "MainServlet", urlPatterns = {"*.html"})
public class MainServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    }

    private void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if (request.getServletPath().endsWith("/hello.html")) {
            String username = request.getParameter("username");
            request.setAttribute("user", username);
            LocalTime time = LocalTime.now();
            request.setAttribute("time", time);
            request.getRequestDispatcher("/WEB-INF/hello.jsp").forward(request, response);
        } else if (request.getServletPath().endsWith("/calc.html")) {
            int a = Integer.parseInt(request.getParameter("a"));
            int b = Integer.parseInt(request.getParameter("b"));
            Calculator calculator = new Calculator(a, b);
            request.setAttribute("calc", calculator);
            request.getRequestDispatcher("/WEB-INF/calc.jsp").forward(request, response);
        } else if (request.getServletPath().endsWith("/tabul.html")) {
            double start = Double.parseDouble(request.getParameter("start"));
            double finish = Double.parseDouble(request.getParameter("finish"));
            double step = Double.parseDouble(request.getParameter("step"));
            Tabul tabul = new Tabul(start, finish, step);
            request.setAttribute("tabul", tabul);
            request.getRequestDispatcher("/WEB-INF/tabul.jsp").forward(request, response);
        } else {

        }
    }
}
