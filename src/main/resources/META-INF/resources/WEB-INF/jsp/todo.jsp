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
    <h1>Add Todos Details</h1>
    <form method="post">
        Description: <input type="text" name="description"/>
        <input type="submit" class="btn btn-success"/>
    </form>
</div>
<!-- bootstrap 링크 -->
<script src="/webjars/bootstrap/5.3.3/dist/js/bootstrap.bundle.js"></script>
<!-- jQuery 링크 -->
<script src="/webjars/jquery/4.0.0-beta.2/dist/jquery.min.js"></script>
</body>
</html>
