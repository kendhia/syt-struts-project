<%-- 
    Document   : database
    Created on : 25.May.2019, 16:12:32
    Author     : Xcom
--%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
</head>
<body>
    <h1>Hello World!</h1>
    <s:iterator value="liste">
        <p><s:property /></p>
    </s:iterator>
        
        <a href="<s:url action='index'/>">HOME</a>
</body>
</html>
