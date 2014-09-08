<%@ attribute name="title" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <meta name="description" content="">
  <meta name="author" content="">
  <title>${title}</title>
  <link rel="stylesheet" text="text/css" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css">

  <c:choose>
    <c:when test="${param.isRegistrationPage=='1'}">
      <link rel="stylesheet" text="text/css" href="${contextpath}/css/registration.css">
    </c:when>
    <c:otherwise>
      <link rel="stylesheet" text="text/css" href="${contextpath}/css/main.css">
    </c:otherwise>
  </c:choose>

  <script language="javascript" type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
  <script language="javascript" type="text/javascript" src="https://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
</head>