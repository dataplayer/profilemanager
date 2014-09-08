<!DOCTYPE html>
<%@ taglib prefix="tags" tagdir="/WEB-INF/tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html lang="en">
  <tags:head title="Profile Manager | User List"/>

  <body>
    <tags:navbar/>

<body>

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

</body>
</html>