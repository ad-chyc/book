<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@page language="java" contentType="text/html; charset=UTF-8" %>
<html>
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<html>
<head>
    <title>Show</title>
</head>
<body>
<form action="EditBookServlet" method="post">
    <div class="form-row">
        <div class="form-group col-md-6">
            <label for="title">Title</label>
            <input type="text" name="title" class="form-control" value="${requestScope.book.title}" id="title" placeholder="title">
        </div>
    </div>
    <div class="form-row">
        <div class="form-group col-md-6">
            <label for="isbn">ISBN</label>
            <input type="text" name="isbn" class="form-control" value="${requestScope.book.isbn}" id="isbn" placeholder="isbn">
        </div>
    </div>
    <div class="form-row">
        <div class="form-group col-md-6">
            <label for="firstName">firstName</label>
            <input type="text" name="firstName" class="form-control" id="firstName" value="${requestScope.book.author.firstName}" placeholder="firstName">
        </div>
        <div class="form-group col-md-6">
            <label for="lastName">lastName</label>
            <input type="text" name="lastName" class="form-control" id="lastName" value="${requestScope.book.author.lastName}" placeholder="lastName">
        </div>
    </div>
    <div class="form-row">
        <div class="form-group col-md-6">
            <label for="category">Category</label>
            <input type="text" name="category" class="form-control" id="category" value="${requestScope.book.category}" placeholder="category">
        </div>
    </div>
    <div class="form-row">
        <div class="form-group col-md-6">
            <label for="release">Data wydania</label>
            <input type="date" name="release" class="form-control" id="release" value="${requestScope.book.releaseDate}" placeholder="Data wydania">
        </div>
    </div>
    <div class="form-row">
        <div class="form-group col-md-6">
            <label for="pages">Pages</label>
            <input type="number" name="pages" class="form-control" id="pages" value="${requestScope.book.pages}" placeholder="Pages">
        </div>
    </div>
    <input type="hidden" name="bookId" value="${requestScope.book.id}">
    <button type="submit" class="btn btn-primary">Edit Book</button>
</form>
</body>
</html>
