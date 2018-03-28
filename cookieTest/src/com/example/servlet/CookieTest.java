package com.example.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;
import java.io.*;
import com.example.model.*;

public class CookieTest extends HttpServlet {
    public void doPost(HttpServletRequest request,
                       HttpServletResponse response)
    throws IOException, ServletException {
        response.setContentType("text/html");
        String name = request.getParameter("username");
        Cookie cookie = new Cookie("username",name);
        cookie.setMaxAge(30*60);
        response.addCookie(cookie);

        RequestDispatcher view = request.getRequestDispatcher("result.jsp");
        view.forward(request, response);
    }
}
