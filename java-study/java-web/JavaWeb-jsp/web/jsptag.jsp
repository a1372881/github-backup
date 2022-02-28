<%--
  Created by IntelliJ IDEA.
  User: lxl
  Date: 2021/8/4
  Time: 9:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>


<%--jsp:include --%>
<jsp:forward page="jsp2.jsp">
    <jsp:param name="name" value="dida"/>
    <jsp:param name="age" value="44"/>
</jsp:forward>

</body>
</html>
