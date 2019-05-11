<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" isELIgnored="false"%><html>
<html>
<head>
    <title>Title</title>
</head>
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
