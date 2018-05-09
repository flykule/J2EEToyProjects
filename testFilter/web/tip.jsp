<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<html>
    <body>
        <h1 align="center">Beer Recommendation</h1>
        <p>
        <div class='tipBox'>
            <b>Tip of the day:</b>
            <br/>
            <br/>
            <c:out value="${requestScope.currentTip}" default="test default" />
        </div>
        </p>
    </body>
</html>
