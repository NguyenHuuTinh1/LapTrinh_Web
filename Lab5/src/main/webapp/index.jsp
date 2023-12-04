<%@ page import="vn.edu.hcmuaf.model.User" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<html>
<body>

<%
    User user = (User) session.getAttribute("auth"); %>
<% if (user == null) { %>
<h1>Chào mừng bạn đến với trang web</h1>
<a href="views/task3/login.jsp">Đăng nhập</a>
<% } else { %>
<h1>Chào mừng <%= user.getUsername() %> đến với trang web</h1>
<a href="LogoutController">Đăng xuất</a>
<% } %>
</body>
</html>
