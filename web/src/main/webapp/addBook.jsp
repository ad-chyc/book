<%--
  Created by IntelliJ IDEA.
  User: adchyc
  Date: 20.07.2019
  Time: 12:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<body>
<form action="AddBookServlet" method="post">
    <div class="form-row">
        <div class="form-group col-md-6">
            <label for="title">Title</label>
            <input type="text" name="title" class="form-control" id="title" placeholder="title">
        </div>
    </div>
    <div class="form-row">
        <div class="form-group col-md-6">
            <label for="isbn">ISBN</label>
            <input type="text" name="isbn" class="form-control" id="isbn" placeholder="isbn">
        </div>
    </div>
    <div class="form-row">
        <div class="form-group col-md-6">
            <label for="firstName">firstName</label>
            <input type="text" name="firstName" class="form-control" id="firstName" placeholder="firstName">
        </div>
        <div class="form-group col-md-6">
            <label for="lastName">lastName</label>
            <input type="text" name="lastName" class="form-control" id="lastName" placeholder="lastName">
        </div>
    </div>
    <div class="form-row">
        <div class="form-group col-md-6">
            <label for="category">Category</label>
            <input type="text" name="category" class="form-control" id="category" placeholder="category">
        </div>
    </div>
    <div class="form-row">
        <div class="form-group col-md-6">
            <label for="release">Data wydania</label>
            <input type="date" name="release" class="form-control" id="release" placeholder="Data wydania">
        </div>
    </div>
    <div class="form-row">
        <div class="form-group col-md-6">
            <label for="summary">Summary</label>
            <input type="text" name="summary" class="form-control" id="summary" placeholder="Summary">
        </div>
    </div>
    <div class="form-row">
        <div class="form-group col-md-6">
            <label for="pages">Pages</label>
            <input type="number" name="pages" class="form-control" id="pages" placeholder="Pages">
        </div>
    </div>
    <button type="submit" class="btn btn-primary">Add Book</button>
</form>
</body>
</html>
