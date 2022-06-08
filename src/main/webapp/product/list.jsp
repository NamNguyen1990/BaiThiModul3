<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 6/8/2022
  Time: 9:41 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>Day la danh sach</h2>
<h5>Tìm theo tên</h5>
<form class="form-inline my-2 my-lg-0" action="/products">
    <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search" name="key">
    <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
</form>

<h5>Tìm theo khoảng giá</h5>
<form class="form-inline my-2 my-lg-0" action="/products">
    <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search" name="one">
    <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search" name="two">
    <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
</form>

<c:forEach items='${ds}' var="pro">
    <h2>${pro.id}, ${pro.name}, ${pro.price}, ${pro.quantity}</h2>
    <c:if test="${pro.price > 200}">
        - Khuyễn mãi 10%
    </c:if>
    <c:if test="${pro.price < 200}">
        - Khuyễn mãi 20%
    </c:if></h3>
</c:forEach>

</body>
</html>
