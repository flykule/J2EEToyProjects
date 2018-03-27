package com.example.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import com.example.entity.*;

public class ListenerTester extends HttpServlet {
    public void doPost(HttpServletRequest request,
                       HttpServletResponse response)
    throws IOException, ServletException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("test context attributes set by listener<br>");
        out.println("<br>");

        Dog dog = (Dog)getServletContext().getAttribute("dog");

        out.println("Dog's breed is: "+dog.getBreed());
    }
}
