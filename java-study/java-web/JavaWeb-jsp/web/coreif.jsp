<%--
  Created by IntelliJ IDEA.
  User: lxl
  Date: 2021/8/4
  Time: 9:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>


<h4>if测试</h4>

<hr>
<form action="coreif.jsp" method="get">

<%--
EL表达式获取表单中的数据
${param.参数行}
--%>
    <input type="text" name="username" value="${param.username}">
    <input type="submit" value="登录">
</form>
<%--判断提交的数据--%>
<c:if test="${param.username == 'admin'}" var="isadmin">
    <c:out value="hello welcome"/>
</c:if>

<c:out value="${isadmin}"/>


</body>
</html>
