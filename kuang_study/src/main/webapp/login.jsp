<%--
  Created by IntelliJ IDEA.
  User: CM
  Date: 2022/2/19
  Time: 9:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/login" method="post">

    用户名: <input type="text" name="username"><br>
    密码: <input type="password" name="password"><br>
    爱好: <input type="checkbox" name="hob" value="唱歌">唱歌
         <input type="checkbox" name="hob" value="跳舞">跳舞
         <input type="checkbox" name="hob" value="打篮球">打篮球


    <input type="submit" value="登录">


</form>

</body>
</html>
