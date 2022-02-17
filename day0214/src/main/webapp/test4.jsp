<%@ page import="com.cm.ani.Cat" %><%--
  Created by IntelliJ IDEA.
  User: CM
  Date: 2022/2/14
  Time: 15:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    Cat c = new Cat();
    c.setAge(10);
    c.setColor("red");
    c.setName("小花");
    request.setAttribute("cat", c);
%>
<h2 style="color:skyblue;">

    ${requestScope.cat}
    <br>
    ${cat.name}
    <br>
    ${cat.age}
    <br>
    ${cat.color}

</h2>

</body>
</html>
