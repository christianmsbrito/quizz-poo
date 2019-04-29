<%-- 
    Document   : quizz
    Created on : 28/04/2019, 20:05:11
    Author     : Christian
--%>

<%@page import="classes.User"%>
<%@page import="classes.Database"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <% String name = (String) session.getAttribute("name"); 
           User user = Database.getUserByName("teste");
           String id = user.getSessionId();
        %>
        <h1>${id}Hello World!</h1>
    </body>
</html>
