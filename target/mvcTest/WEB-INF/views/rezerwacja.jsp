<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" isELIgnored="false"%><html>
<c:url value="/resources/js/timer.js" var="timer"/>
<c:url value="/resources/jpg/tlo1.jpg" var="index1"/>

<html>
<head>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>    <script  src="${timer}"></script>
    <%@ include file="security/jspf/head_config.jspf"%>

    <c:url value="/resources/js/timer.js" var="timer"/>

    <style>
        body {

            background-image: url(${index1});
            background-size: 100%;
        }
    </style>
    <head>
        <title>Title</title>
    </head>
<body onload="odliczanie();">
<div id='watch'>12:00:00</div>
<%@ include file="security/jspf/main_menu.jspf"%>
<c:url value="/resources/css/style.css" var="style"/>
<link href="${style}" rel="stylesheet"/>
<title>Rezerwacja</title>

<body>

<form:form method="post" modelAttribute="rezerwacja">
    <div>
        <form:label path="date">data:</form:label>
        <form:select path="date.id" items="${data}"
                     itemLabel="data" itemValue="id"/>
    </div>
    <div>
        <form:label path="przystanekStart">data:</form:label>
        <form:select path="przystanekStart.id" items="${przystanek}"
                     itemLabel="nazwaPrzystanku" itemValue="id"/>
    </div>
    <input type="submit">
</form:form>

</body>
</html>
