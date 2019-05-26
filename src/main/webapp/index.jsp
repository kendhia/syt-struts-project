<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Basic Struts 2 Application - Welcome</title>
    </head>
    <body>
        <h1>Welcome To Struts 2!</h1>

        <s:url action="registerInput" var="registerInputLink" />

        <p><a href="${registerInputLink}">Please register</a> for our prize drawing.</p>
        <p><a href="<s:url action='database' />">View</a> registrars.</p>

        <h3>Türkçe sayfası</h3>
        <s:url action="registerInput" var="registerInputLinkTR">
            <s:param name="request_locale">tr</s:param>
        </s:url>
        <p>Kazanmak için, <a href="${registerInputLinkTR}">lütfen kayıt olun</a> </p>
    </body>
</html>