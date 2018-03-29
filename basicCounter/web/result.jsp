<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="com.example.test.*" %>
<html>
    <body>
        <h1 align="center">Jsp basic count</h1>
        <p>
        <%
        out.print(Counter.getCount());
        %>
        </p>
    </body>
</html>
