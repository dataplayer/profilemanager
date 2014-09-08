<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>List of Users</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css">
    <style>
        body {
            min-height: 2000px;
            padding-top: 70px;
        }
    </style>
</head>
<body>

<%@ include file="/WEB-INF/jsp/navbar.jsp" %>

    <div class="page-header">
        <h1>List of Users</h1>
    </div>
    <div class="col-sm-4">
        <ul class="list-group">
            <c:forEach var="user" items="${users}">
                <li class="list-group-item">${user.username}</li>
            </c:forEach>
         </ul>
    </div><!-- /.col-sm-4 -->

<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
</body>
</html>