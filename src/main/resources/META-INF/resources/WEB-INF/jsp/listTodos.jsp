<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>List Todos Page</title>
    <!-- bootstrap 링크 -->
    <link rel="stylesheet" href="/webjars/bootstrap/5.3.3/dist/css/bootstrap.min.css"/>
</head>
<body>
<div class="container">
    <h1>Your Todos</h1>
    <table class="table">
        <thead>
        <tr>
            <th>id</th>
            <th>Description</th>
            <th>Target Date</th>
            <th>Is Done?</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${todos}" var="todo">
            <tr>
                <td>${todo.id}</td>
                <td>${todo.description}</td>
                <td>${todo.targetDate}</td>
                <td>${todo.done}</td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
    <a href="add-todo" class="btn btn-success">Add Todo</a>
</div>
<!-- bootstrap 링크 -->
<script src="/webjars/bootstrap/5.3.3/dist/js/bootstrap.bundle.js"></script>
<!-- jQuery 링크 -->
<script src="/webjars/jquery/4.0.0-beta.2/dist/jquery.min.js"></script>
</body>
</html>
