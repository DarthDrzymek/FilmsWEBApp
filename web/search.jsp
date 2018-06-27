<%--
  Created by IntelliJ IDEA.
  User: drzymek
  Date: 26/06/18
  Time: 15:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Search films</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<body>
<div align="CENTER">
<h1>Searching page</h1>
<form id="formSearch" method="post" action="SearchFilm" >
    <div class="form-row align-items-center">
        <div class="col-auto my-1">
                <input type="text" name="searchField">
            </div>
        <div class="col-auto my-1">
            <select  name="searchParam">
                <option value="Name">Title</option>
                <option value="Director">Director</option>
                <option value="Year">Year</option>
            </select>
        </div>
        <div class="col-auto my-1">
            <button type="submit" class="btn btn-primary">Submit</button>
        </div>
    </div>
</form>
</div>
</body>
</html>
