<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<html>
    <body>
        <Strong>Member Comments</Strong>
        <br>
        <hr>${commentList}<hr>
        <c:if test="${userType eq 'member'}">
            <jsp:include page="inputComment.jsp">
        </c:if>
    </body>
</html>
