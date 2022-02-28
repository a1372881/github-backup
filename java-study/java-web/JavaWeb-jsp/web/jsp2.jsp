
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page errorPage="error/500.jsp" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<%=request.getParameter("name")%>
<%=request.getParameter("age")%>

<h1>hello</h1>
</body>
</html>
