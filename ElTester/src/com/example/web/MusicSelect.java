package com.example.web;

import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;
import java.io.*;

public class MusicSelect extends HttpServlet {
    public void doGet(HttpServletRequest request,
                       HttpServletResponse response)
    throws IOException, ServletException {
        String[] favouriteMusic = {"Zero 7","Tahiti 80","BT","Frou Frout"};

        request.setAttribute("musicList", favouriteMusic);
        RequestDispatcher view = request.getRequestDispatcher("result.jsp");
        view.forward(request, response);
    }
}
