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
    <%@ include file="../security/jspf/head_config.jspf"%>

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

<title>Admin</title>

<body>
<%@ include file="../security/jspf/admin_menu.jspf"%>
<c:url value="/resources/css/style.css" var="style"/>
<link href="${style}" rel="stylesheet"/>
<p> Admin moze wszystko trzeba bedzie zrobic formularze do edycji usuwania dodoawania :) </p>
</body>
</html>