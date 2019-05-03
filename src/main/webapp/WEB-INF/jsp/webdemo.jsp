<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table width="100%" border=1>
    <tr>
        <td>商品名称</td>
        <td>商品价格</td>
        <td>生产日期</td>
        <td>商品描述</td>
        <td>操作</td>
    </tr>
    <c:forEach items="${itemsList }" var="item">
        <tr>
            <td>${item.name }</td>
            <td>${item.price }</td>
            <td>${item.date}</td>
            <td>${item.detail }</td>

            <%--<td><a href="${pageContext.request.contextPath }/items/editItems.action?id=${item.id}">修改</a></td>--%>

        </tr>
    </c:forEach>

</table>
</body>
</html>
