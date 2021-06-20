<%-- 
    Document   : login
    Created on : Jun 20, 2021, 2:43:40 PM
    Author     : 850354
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
    </head>
    <body>
        <h1>Login</h1>
        <form>
            <label> Username: </label>
            <input type="text" name="username" value="${username}">
            <br>
            
            <label> Password: </label>
            <input type="text" name="password" value="${password}">
            <input type="submit" value="Log in">
            
        </form>
            
            <p>${Error}</p>
    </body>
</html>
