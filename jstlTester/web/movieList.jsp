<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<html>
    <body>
        <h1 align="center">Movie List</h1>
        <p>
        <table>
            <c:forEach items="${arrayList}" var="movies">
                <c:forEach items="${movies}" var="movie">
                    <tr>
                        <td>${movie}</td>
                    </tr>
                </c:forEach>
            </c:forEach>
        </table>
        </p>
    </body>
</html>
