package com.example.web;

import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;
import java.io.*;
import com.example.model.*;

public class BeerSelect extends HttpServlet {
    public void doPost(HttpServletRequest request,
                       HttpServletResponse response)
    throws IOException, ServletException {
        String c = request.getParameter("color");
        BeerExpert be = new BeerExpert();
        List<String> result = be.getBrands(c);

        request.setAttribute("styles", result);
        RequestDispatcher view = request.getRequestDispatcher("result.jsp");
        view.forward(request, response);
    }
}
