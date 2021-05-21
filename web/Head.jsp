<%-- 
    Document   : Home
    Created on : Dec 02, 2019, 12:16:43 AM
    Author     : gionh
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <link href="css/style.css" rel="stylesheet" type="text/css"/>
        <link href="css/login.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <div class="menu">
            <nav class="navbar navbar-expand-sm bg-dark navbar-dark">
                <!-- Brand/logo -->
                <a class="navbar-brand" href="#">
                    <img src="picture/logo1_1.jpg" alt="logo" style=" width:80px;height:80px">
                </a>

                <!-- Links -->
                <ul class="navbar-nav">
                    <li class="nav-item" style="font-size: 20px; color: white">
                        <a class="nav-link" href="Home.jsp">Home Page</a>
                    </li>
                    <li class="nav-item" style="font-size: 20px; color: white">
                        <a class="nav-link" href="ShopControl">Shop</a>
                    </li>
                    <!--  -->
                    <c:if test="${empty user}">
                        <li class="nav-item" style="font-size: 20px; color: white">
                            <a class="nav-link" href="Login.jsp">Log In</a>
                        </li>
                    </c:if>
                    <!-- Authorization -->
                    <c:if test="${not empty user}">
                        <li class="nav-item" tabindex="-1" style="font-size: 20px; color: white">
                            <a class="nav-link" href="CartControl">Cart</a>
                        </li>
                        <li class="nav-item" style="font-size: 20px; color: white">
                            <a class="nav-link" href="LogOutControl">Log Out</a>
                        </li>
                    </c:if>

                </ul>
            </nav>
        </div>

        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
    </body>
</html>
