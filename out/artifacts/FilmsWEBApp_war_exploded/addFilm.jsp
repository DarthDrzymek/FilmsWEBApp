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
    <title>Add new film</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<body>
<h2>Add new film </h2>
<form id="formAdd" method="post" action="AddFilm" >
    <div class="form-group" >
        <label  for="titleInput">Title</label>
        <input type="text" class="form-control" id="titleInput" name="title" placeholder="Enter title">
    </div>
    <div class="form-group" >
        <label for="yearInput">Year</label>
        <input type="text" class="form-control" id="yearInput" name="year" placeholder="Enter year">
    </div>
    <div class="form-group">
        <label for="directorInput">Director</label>
        <input type="text" class="form-control" id="directorInput" name="director" placeholder="Enter director">
    </div>
    <div class="form-group">
        <label for="descInput">Description</label>
        <input type="text" class="form-control" id="descInput" name="desc" placeholder="Enter Description">
    </div>
    <div class="form-group">
        <label for="imgInput">Image</label>
        <input type="text" class="form-control" id="imgInput"  name="img" placeholder="Enter image url">
    </div>
    <button type="submit" class="btn btn-primary">Submit</button>
</form>
</body>
</html>
