package com.example.web;

import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;
import java.io.*;

public class TipSelect extends HttpServlet {
    public void doPost(HttpServletRequest request,
                       HttpServletResponse response)
    throws IOException, ServletException {
        String c = "<b></b> tags make things bold!";

        request.setAttribute("currentTip", c);
        RequestDispatcher view = request.getRequestDispatcher("result.jsp");
        view.forward(request, response);
    }

    public void doGet(HttpServletRequest request,
                       HttpServletResponse response)
    throws IOException, ServletException {
        doPost(request,response);
    }
}
