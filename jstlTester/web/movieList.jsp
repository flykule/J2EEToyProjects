<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<html>
    <body>
        <h1 align="center">Movie List</h1>
        <p>
        <table>
            <% String[] items = (String[])request.getAttribute("movieList");
            String val=null;
            for(int i = 0;i<items.length;++i){
            var = items[i];
            %>
            <tr><td><%= var%></td></tr>
            <% } %>
        </table>
        </p>
    </body>
</html>
