<%@ page import="model.Film" %><%--
  Created by IntelliJ IDEA.
  User: drzymek
  Date: 26/06/18
  Time: 19:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Details</title>
</head>
<body>
<%
    Film film =(Film) request.getAttribute("film");
%>
<div align="CENTER">
<h2><%=film.getName()%></h2>
<h4><%=film.getYear()%></h4>
<img src="<%=film.getImg()%>">
<p><%=film.getDescription()%></p>
</div>
</body>
</html>
