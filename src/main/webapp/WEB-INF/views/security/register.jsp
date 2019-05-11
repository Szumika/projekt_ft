<?xml version="1.0" encoding="UTF-8" ?>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <%@ include file="jspf/head_config.jspf"%>
    <c:url value="/resources/jpg/tlo.jpg" var="index1"/>
    <style>
        body {

            background-image: url(${index1});
            background-size: 100%;
        }
    </style>
</head>
<body>
<%@ include file="jspf/header.jspf"%>
<%@ include file="jspf/main_menu.jspf"%>
<c:url value="/resources/css/style.css" var="style"/>
<link href="${style}" rel="stylesheet"/>
<p class='error'>${msg}</p>
<form:form modelAttribute="user" method="post" enctype="utf8">
    <div>
        <form:label path="username">username</form:label>
        <form:input path="username" />
    </div>
    <div>
        <form:label path="email">email</form:label>
        <form:input type="email" path="email" />
    </div>
    <div>
        <form:label path="password">password</form:label>
        <form:password path="password" />
    </div>
    <div>
        <form:label path="matchingPassword">matchingPassword</form:label>
        <form:password path="matchingPassword" />
    </div>
    <input type="hidden" name="${_csrf.parameterName}"
           value="${_csrf.token}" />
    <div>
        <form:errors path="*" />
    </div>
    <button type="submit">Register</button>
</form:form>
<%@ include file="jspf/footer.jspf"%>
</body>
</html>