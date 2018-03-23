package com.example;

import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;
import java.io.*;

public class TestInitParams extends HttpServlet {
    public void doGet(HttpServletRequest request,
                       HttpServletResponse response)
    throws IOException, ServletException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("test in parameters<br>");

        Enumeration e = getServletConfig().getInitParameterNames();
        while (e.hasMoreElements()) {
            out.println("<br>param name = "+e.nextElement()+"<br>");
        }
        out.println("main emial is "+getServletConfig().getInitParameter("mainEmail"));
        out.println("<br>");
        out.println("admin emial is "+getServletConfig().getInitParameter("adminEmail"));
    }
}
