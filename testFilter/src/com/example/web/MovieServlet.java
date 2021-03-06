package com.example.web;

import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;
import java.io.*;

public class MovieServlet extends HttpServlet {
    public void doPost(HttpServletRequest request,
                       HttpServletResponse response)
    throws IOException, ServletException {
        String[] list = {"Amelie","Return of the King","Mean Girls"};
        String[] list2 = {"Matrix Revolutions","Kill Bill","Boondock Skins"};
        
        List<String[]> arrayList = new ArrayList<>();
        arrayList.add(list);
        arrayList.add(list2);
        request.setAttribute("arrayList", arrayList);
        RequestDispatcher view = request.getRequestDispatcher("movieList.jsp");
        view.forward(request, response);
    }

    public void doGet(HttpServletRequest request,
                       HttpServletResponse response)
    throws IOException, ServletException {
        doPost(request,response);
    }
}
