<%-- 
    Document   : login
    Created on : Sep 7, 2020, 3:20:21 PM
    Author     : admin
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    </head>
    <body>
        <h1>Moi ban dang nhap ${model.id}</h1>
        <form action="" method="get">
            <input type="text" name="usename" value="">
            <input type="text" name="password" value="">
            <button type="submit"> Login</button>
                
        </form>
  
    </body>
</html>
