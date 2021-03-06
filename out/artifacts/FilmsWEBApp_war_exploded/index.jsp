<%--
  Created by IntelliJ IDEA.
  User: drzymek
  Date: 26/06/18
  Time: 14:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Title</title>
      <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
      <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
      <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
      <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
  </head>
  <body>

  <c:set value="added" var="messageAdded"/>
  <c:set value="error" var="messageError"/>
  <c:if test="${requestScope.message!=null}">
      <c:if test="${message==messageError}">
      <div class="alert alert-success alert-dismissible fade in">
          <a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
          <strong>Success!</strong> You added a FILM!
      </div>
    </c:if>
  <c:if test="${message== messageError}">
    <div class="alert alert-danger">
      <a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
      <strong>Error!</strong>Something went wrong!
    </div>
  </c:if>
  </c:if>

  <div align="CENTER">
  <h1>Select what you'd like to do</h1><br>
  </div>
  <div align="CENTER">
  <form action="search.jsp" method="get">
      <input type="submit" value="Search films"
             name="Submit" id="frm1_submit" />
  </form>
  <form  action="addFilm.jsp" method="get">
      <input type="submit" value="Add new film"
             name="Submit" id="frm2_submit" />
  </form>
      </div>
  </body>
</html>
