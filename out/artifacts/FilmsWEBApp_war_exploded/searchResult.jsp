<%@ page import="model.Film" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: drzymek
  Date: 26/06/18
  Time: 18:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Search Result</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css"
          integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB" crossorigin="anonymous">
</head>
<body>
<div id="div1">
    <table class="table">
        <thead class="thead-dark">
        <tr>
            <th scope="col">#</th>
            <th scope="col">Title</th>
            <th scope="col">Year</th>
            <th scope="col">Director</th>
        </tr>
        </thead>
        <tbody>
        <%
            int i = 1;
            ArrayList<Film> films = (ArrayList) request.getAttribute("filmsList");
            for (Film film : films) {
        %>
        <tr>
            <th scope="row"><%=i%>
            </th>
            <td><%=film.getName()%>
            </td>
            <td><%=film.getYear()%>
            </td>
            <td><%=film.getDirector()%>
            </td>
        </tr>
        <%
                i++;
            }%>
        </tbody>
    </table>
</div>
</body>
</html>
