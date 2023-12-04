<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.2/css/all.min.css">
    <link rel="stylesheet" href="<c:url value="/views/task3/login.css"/>">
</head>
<body>
<div class="container">
    <div class="main">
        <form class="login" method="post" action="${pageContext.request.contextPath}/login">

            <div class="title">
                <span>Sign In</span>
            </div>
            <% if (request.getAttribute("error") != null) { %>
            <div style="color: red">
                <p>Invalid username and password.</p>
            </div>
            <% } %>
            <input type="text" name="username" class="username" placeholder="username or email">
            <input type="password" name="password" class="password" placeholder="password">
            <div class="submit">
                <button class="btn-submit">Sign In</button>
            </div>

            <div class="login-other">
                <span>Or login with</span>
                <div class="icon">
                    <div class="icon-fb col">
                        <a href="#">
                            <img src="<c:url value="/views/task3/img/facebook.png"/>" alt="">
                        </a>
                    </div>
                    <div class="icon-google col">
                        <a href="#">
                            <img src="<c:url value="/views/task3/img/google-icon.png"/>" alt="">
                        </a>
                    </div>
                </div>

            </div>
            <div class="sign-up">
                <span>Sign Up</span>
            </div>
        </form>
    </div>
</div>

</body>
</html>