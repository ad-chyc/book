<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@page language="java" contentType="text/html; charset=UTF-8" %>
<html>
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<body>
<h2>Lista Książek</h2>
    <form action="BookServlet" method="post" >
        <table class="table table-striped">
            <thead>
            <tr>
                <th scope="col">#</th>
                <th scope="col">Title</th>
                <th scope="col">ISBN</th>
                <th scope="col">Author</th>
                <th scope="col">Type</th>
                <th scope="col">Release</th>
                <th scope="col">Pages</th>
                <th scope="col">Borrower</th>
                <th scope="col"></th>
            </tr>
            </thead>
            <tbody>
            <c:forEach var="book" items="${requestScope.books}" varStatus="loop">
                <tr>
                    <th>${loop.index + 1}</th>
                    <th>${book.title}</th>
                    <th>${book.getIsbn()}</th>
                    <th>${book.author.authorName()}</th>
                    <th>${book.category}</th>
                    <th>${book.releaseDate}</th>
                    <th>${book.pages}</th>
                    <th>-</th>
                    <th><input class="form-check-input" type="radio" name="bookId" value="${book.id}" checked></th>
                </tr>
            </c:forEach>
            </tbody>
        </table>
        <input type="submit" class="btn btn-outline-success" name="action" value="ADD">
        <input type="submit" class="btn btn-outline-warning" name="action" value="EDIT">
        <input type="submit" class="btn btn-outline-primary" name="action" value="SHOW">
        <input type="submit" class="btn btn-outline-danger" name="action" value="DELETE">
    </form>
</body>
</html>
