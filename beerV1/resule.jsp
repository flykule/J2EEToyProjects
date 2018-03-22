<%@ page import="java.util.*"i %>
<html>
    <body>
        <h1 align="center">Beer Recommendation</h1>
        <p>
        <%
        List<String> styles = (List)request.getAttribute("styles");
        Iterator it = styles.iterator();
        while(it.hasNext()){
        out.print("<br>try: "+it.next());
        }
        %>
        </p>
    </body>
</html>
