<%--
  Created by IntelliJ IDEA.
  User: CM
  Date: 2022/2/16
  Time: 10:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录</title>
</head>
<body>

<form action="${pageContext.request.contextPath}/Login" method="post">
    用户名: <input type="text" name="username"><br>
    密码: <input type="password" name="password"><br>
    验证码: <input type="text" name="val"> <img id="img1" style="width: 60px;height: 25px" src="${pageContext.request.contextPath}/checkCode" alt=""> <br>
    <span style="color: red;font-size: 14px">${error}</span><br>
    <input type="submit"  value="登录">
    <input type="submit"  value="取消">

</form>

</body>
<script>
    document.getElementById("img1").onclick=function (){

        this.src="${pageContext.request.contextPath}/checkCode?time"+new Date().getTime();
    }
</script>
</html>
