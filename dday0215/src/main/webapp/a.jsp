<%--
  Created by IntelliJ IDEA.
  User: CM
  Date: 2022/2/15
  Time: 22:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>aaa</title>
</head>
<body>
<c:if test="${1==1}">
     <h1 style="color:yellowgreen;">我是标题</h1>
</c:if>
<c:forEach begin="0" end="5" step="1" var="i">
    ${i}
</c:forEach>

<c:forEach begin="0" end="10" step="1" var="i">

    ${i}

</c:forEach>

</body>
</html>
