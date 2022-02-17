<%--
  Created by IntelliJ IDEA.
  User: CM
  Date: 2022/2/16
  Time: 15:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册</title>
</head>
<body>

<form action="${pageContext.request.contextPath}/zhuce" method="post">

用户名: <input type="text" name="username"><br>
密码: <input type="password" name="password"><br>
年龄: <input type="text" name="age"><br>
地址: <input type="text" name="address"><br>
    <input type="submit"  value="注册">

</form>
</body>
</html>
