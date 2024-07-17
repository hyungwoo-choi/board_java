<%--
  Created by IntelliJ IDEA.
  User: tinbe
  Date: 2024-07-16
  Time: 오후 4:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>list</title>
    <h1>LIST</h1>
    <c:forEach var = "dto" items = "${lists}">
        <li>${dto}</li>
    </c:forEach>
</head>
<body>

</body>
</html>
