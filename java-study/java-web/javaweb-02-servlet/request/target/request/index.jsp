<%--
  Created by IntelliJ IDEA.
  User: lxl
  Date: 2021/7/27
  Time: 14:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录</title>
</head>
<body>
<h1>
    登录
</h1>
<div style="text-align: center">
    <%--以post方式提交表单--%>
    <form action="${pageContext.request.contextPath}/login" method="post">
        用户名: <input type="text" name="username"><br>
        密码: <input type="password" name="password"><br>
        爱好:
        <input type="checkbox" name="hobby" value="代码">代码
        <input type="checkbox" name="hobby" value="书">书
        <input type="checkbox" name="hobby" value="看妞">看妞
        <input type="submit">
    </form>

</div>
</body>
</html>
