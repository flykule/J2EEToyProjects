<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.*" %>
<html>
    <body>
        <h1 align="center">Beer Recommendation</h1>
        <p>
        <div class='tipBox'>
            <b>Tip of the day:</b>
            <br/>
            <br/>
            ${requestScope.currentTip}
        </div>
        </p>
    </body>
</html>
