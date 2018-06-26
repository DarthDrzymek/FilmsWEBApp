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
  </head>
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
