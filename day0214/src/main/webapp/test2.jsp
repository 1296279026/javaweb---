<%--
  Created by IntelliJ IDEA.
  User: CM
  Date: 2022/2/14
  Time: 11:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    pageContext.setAttribute("name", "zs", pageContext.PAGE_SCOPE);
    pageContext.setAttribute("name", "ls", pageContext.REQUEST_SCOPE);
    pageContext.setAttribute("name", "ww", pageContext.SESSION_SCOPE);
    pageContext.setAttribute("name", "zl", pageContext.APPLICATION_SCOPE);
%>

<%=
pageContext.findAttribute("name")
%>
<%=
pageContext.getAttribute("name", pageContext.PAGE_SCOPE)
%>
<%=
pageContext.getAttribute("name", pageContext.REQUEST_SCOPE)
%>
<%=
pageContext.getAttribute("name", pageContext.SESSION_SCOPE)
%>
<%=
pageContext.getAttribute("name", pageContext.APPLICATION_SCOPE)
%>

</body>
</html>
