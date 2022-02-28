<%--
  Created by IntelliJ IDEA.
  User: lxl
  Date: 2021/8/4
  Time: 16:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<%

%>

<jsp:useBean id="peple" class="com.dida.pojo.People" scope="page"/>

<jsp:setProperty name="peple" property="address" value="sz"/>
<jsp:setProperty name="peple" property="id" value="1"/>
<jsp:setProperty name="peple" property="age" value="3"/>
<jsp:setProperty name="peple" property="name" value="dida"/>

姓名:<jsp:getProperty name="peple" property="name"/>
id:<jsp:getProperty name="peple" property="id"/>
年龄:<jsp:getProperty name="peple" property="age"/>
地址:<jsp:getProperty name="peple" property="address"/>
</body>
</html>
