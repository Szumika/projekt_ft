<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: dominik
  Date: 12.08.18
  Time: 12:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html; charset=UTF-8" language="java" isELIgnored="false" %>

<html>
<head>
    <title>Aktualnosci</title>
    <c:url value="/resources/jpg/tlo.jpg" var="index1"/>
    <style>
        body {

            background-image: url(${index1});
            background-size: 100%;
        }
    </style>
</head>
<body>
<%@ include file="../security/jspf/admin_menu.jspf"%>
<c:url value="/resources/css/style.css" var="style"/>
<link href="${style}" rel="stylesheet"/>

<h2>Dodaj</h2>
<div><a href="/add/przystanek">Dodaj przystanek</a> </div>
<h2>przystanek:</h2>
<c:forEach var="przy" items="${przystanek1}">
    <p>${przy.miejscowosc}-${przy.nazwaPrzystanku} Na trasie - ${przy.trasa} - <a href="/przystanek/edit/${przy.id}">edycja</a> -<a href="przystanekdel/${przy.id}">usun</a></p>
</c:forEach>
</body>
</html>