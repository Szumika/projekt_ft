<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>

<%--
  Created by IntelliJ IDEA.
  User: dominik
  Date: 21.08.18
  Time: 09:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html; charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Edit grp</title>
    <c:url value="/resources/jpg/tlo.jpg" var="index1"/>
    <style>
        body {

            background-image: url(${index1});
            background-size: 100%;
        }
    </style>
</head>
<body>
<%@ include file="../../security/jspf/admin_menu.jspf"%>
<c:url value="/resources/css/style.css" var="style"/>
<link href="${style}" rel="stylesheet"/>

<form:form method="post" modelAttribute="nagrody">
    <div>
        <form:label path="nazwa">nazwa:</form:label>
        <form:input path="nazwa" id="nazwa"/>
    </div>
    <div>
        <form:label path="iloscSztuk">Ilosc sztuk:</form:label>
        <form:input path="iloscSztuk" id="iloscSzTUK"/>
    </div>
    <div>
        <form:label path="iloscPkt">Punkty :</form:label>
        <form:input path="iloscPkt" id="iloscPkt"/>
    </div>
    <input type="submit">
</form:form>

</body>
</html>
