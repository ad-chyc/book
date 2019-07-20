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
    <form>
        <div>${requestScope.book.title}</div>
        <div>${requestScope.book.getIsbn()}</div>
        <div>${requestScope.book.author.authorName()}</div>
        <div>${requestScope.book.category}</div>
        <div>${requestScope.book.releaseDate}</div>
        <div>${requestScope.book.summary}</div>
        <div>${requestScope.book.pages}</div>
    </form>
</body>
</html>
