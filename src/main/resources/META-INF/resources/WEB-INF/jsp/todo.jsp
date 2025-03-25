<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>List Todos Page</title>
    <!-- bootstrap 링크 -->
    <link rel="stylesheet" href="/webjars/bootstrap/5.3.3/dist/css/bootstrap.min.css"/>
</head>
<body>
<div class="container">
    <h1>Add Todos Details</h1>
    <form:form method="post" modelAttribute="todo">
        Description: <form:input type="text" path="description" required="required"/>
        <form:errors path="description" cssClass="text-warning"/>
        <form:input type="hidden" path="id"/>
        <form:input type="hidden" path="done"/>
        <input type="submit" class="btn btn-success"/>
    </form:form>
</div>
<!-- bootstrap 링크 -->
<script src="/webjars/bootstrap/5.3.3/dist/js/bootstrap.bundle.js"></script>
<!-- jQuery 링크 -->
<script src="/webjars/jquery/4.0.0-beta.2/dist/jquery.min.js"></script>
</body>
</html>
