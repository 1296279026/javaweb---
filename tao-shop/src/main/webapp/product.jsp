<%--
  Created by IntelliJ IDEA.
  User: CM
  Date: 2022/2/17
  Time: 18:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>商品</title>
</head>
<body>
<%--<form method="get" action="${pageContext.request.contextPath}/product">

    <button type="submit" >点击</button>

</form>--%>
<%--border="1px" align="center" width="80%" cellspacing="0"--%>


<div style="width: 100%;height:100px; text-align: center">

    <h1 style="text-align: center;color: yellowgreen; line-height: 100px">商 品 列 表</h1>

</div>

<table border="1px" align="center"  cellspacing="0" style="text-align: center">
    <tr>
        <td>编号</td>
        <td>商品名称</td>
        <td>价格</td>
        <td>图片</td>
        <td>详情</td>
    </tr>

    <c:forEach items="${productList}" var="item">
        <tr>
            <td>${item.id}</td>
            <td>${item.name}</td>
            <td>${item.price}</td>
            <td><img src="${item.img}" width="80px"></td>
            <td>${item.detail}</td>
        </tr>
    </c:forEach>

</table>

</body>
</html>
