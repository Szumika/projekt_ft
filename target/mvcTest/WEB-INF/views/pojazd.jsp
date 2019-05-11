<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

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
</head>
<body onload="odliczanie();">
<div id='watch'>12:00:00</div>
<%@ include file="security/jspf/main_menu.jspf"%>
<c:url value="/resources/css/style.css" var="style"/>
<link href="${style}" rel="stylesheet"/>
    <title>Pojazdy</title>

<body>
<div>
<ul>
    <c:forEach var="poj" items="${pojazd}">

        <li> marka:${poj.marka} model: ${poj.model} wolne miejsca :  ${poj.iloscMiejsc}</li>

    </c:forEach>
</ul>



<h3>Jazdaaa</h3>
</div>
</body>
</html>
