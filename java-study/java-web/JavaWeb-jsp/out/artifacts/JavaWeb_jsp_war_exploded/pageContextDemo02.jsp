
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    //通过pageContext,使用寻找的方式
    String name0 = (String) pageContext.findAttribute("name0");
    String name1 = (String) pageContext.findAttribute("name1");
    String name2 = (String) pageContext.findAttribute("name2");
    String name3 = (String) pageContext.findAttribute("name3");
%>
<%--使用EL表达式输出--%>

<h1>取出的值为</h1>
<h3>${name0}</h3>
<h3>${name1}</h3>
<h3>${name2}</h3>
<h3>${name3}</h3>

</body>
</html>
