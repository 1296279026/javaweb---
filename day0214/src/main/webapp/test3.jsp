<%--
  Created by IntelliJ IDEA.
  User: CM
  Date: 2022/2/14
  Time: 15:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<%
    pageContext.setAttribute("name","zs");
    request.setAttribute("name", "ls");
    session.setAttribute("name", "ww");
    application.setAttribute("name", "zl");

%>



<h2 style="color:skyblue;">${pageScope.name}</h2>
<h2 style="color:skyblue;">${requestScope.name}</h2>
<h2 style="color:skyblue;">${sessionScope.name}</h2>
<h2 style="color:skyblue;">${applicationScope.name}</h2>




</body>
</html>
