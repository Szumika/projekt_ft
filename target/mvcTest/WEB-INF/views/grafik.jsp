<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" isELIgnored="false"%><html>
<c:url value="/resources/js/timer.js" var="timer"/>
<c:url value="/resources/jpg/tlo1.jpg" var="index1"/>
<c:url value="/resources/jpg/nagroda1.jpeg" var="nagroda1"/>
<c:url value="/resources/jpg/nagroda2.jpeg" var="nagroda2"/>


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
    <title>Grafik</title>
</head>
<body>

<h2>Grafik pracowników Fitmy D-Trans</h2>
<p>Wpisując date pamiętaj o formacie  rrrr-mm-dd</p>
<form:form method="post" modelAttribute="grafik">
    <div>
        <form:label path="dataRozpoczecia">data rozpoczecia:</form:label>
        <form:input path="dataRozpoczecia" items="dataRozpoczecia"/>
    </div>
    <div>
        <form:label path="dataZakonczenia">data zakonczenia:</form:label>
        <form:input path="dataZakonczenia" items="dataZakonczenia"/>
    </div>
    <div>
        <form:label path="harmonogram">Jaka zmiana(rano/popołudniu):</form:label>
        <form:input path="harmonogram" items="harmonogram"/>
    </div>
    <input type="submit">
</form:form>

</body>
</html>
