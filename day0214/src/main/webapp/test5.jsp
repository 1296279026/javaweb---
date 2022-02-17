<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.Map" %>
<%@ page import="java.util.HashMap" %><%--
  Created by IntelliJ IDEA.
  User: CM
  Date: 2022/2/14
  Time: 16:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    List<String> list = new ArrayList<String>();
    list.add("张三");
    list.add("李四");
    list.add("王五");
    request.setAttribute("list", list);
    
    Map<String, Object> map = new HashMap<String, Object>();
    map.put("name", "钟离");
    map.put("age", 18);
    request.setAttribute("map", map);

%>

${list}
<br>
${list[0]}
${list[1]}
${list[2]}
<br>
${map}
<br>
${map.name}
${map.age}


</body>
</html>
