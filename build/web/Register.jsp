<%-- 
    Document   : Home
    Created on : Dec 20, 2019, 12:16:43 AM
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
        <div class="cover">
            <jsp:include page="Head.jsp"></jsp:include>
            </div>
            <div class="login">
                <div class="login-wrap">

                <c:if test="${not empty sessionScope.existed}">
                    <h2 style="color: red"> ${sessionScope.existed} </h2>
                </c:if>    
                <h2>Register</h2>

                <div class="form">
                    <form action="RegisterControl" method="post">
                        <input class="form-control" type="text" placeholder="Username" name="user" required/>
                        <input class="form-control" type="password" placeholder="Password" name="pass" required/>
                        <input class="form-control" type="text" placeholder="What's your name" name="name" required/>
                        <input class="form-control" type="text" placeholder="Email" name="email" required/>
                        <input class="form-control" type="date" placeholder="Date of birth" name="dob" required/>
                        <br>

                        <button class="form-control btn btn-primary" type="submit"> Register </button>
                    </form>
                    <!--                    <a href="#"> <p> Don't have an account? Register </p></a>-->
                </div>
            </div>
        </div>

        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
    </body>
</html>
