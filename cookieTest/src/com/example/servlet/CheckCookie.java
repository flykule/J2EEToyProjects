package com.example.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;
import java.io.*;
import com.example.model.*;

public class CookieTest extends HttpServlet {
    public void doGet(HttpServletRequest request,
                      HttpServletResponse response)
    throws IOException, ServletException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        Cookie[] cookies = request.getCookies();
        if (cookies != null) {
            for (int i = 0; i < cookies.length; ++) {
                Cookie cookie = new Cookie("username", name);
                if (cookie.getName().equals("username")) {
                    String username = cookie.getValue();
                    out.println("Hello" + username);
                    break;
                }
            }
        }
    }
}
