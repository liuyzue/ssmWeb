<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>分页展示</title>
</head>
<body>
<table id="fenye">
    <tr>
        <thead>
        <td>person_id</td>
        <td>ehr_id</td>
        </thead>
    </tr>
    <tbody>
<%--    <c:if test="${!resultPage==null}">--%>
        <c:forEach var="u" items="${resultPage.lists}"
                   begin="${(resultPage.currPage-1)*resultPage.pageSize}" end="${resultPage.currPage*resultPage.pageSize}">
        <tr>
            <td>${u.personId}</td>
            <td>${u.ehrId}</td>
        </tr>
        </c:forEach>
<%--    </c:if>--%>
    </tbody>
        <tr>
            <td><a href="/main/fenye?currentPage=1">首页</a> </td>
            <td><a href="/main/fenye?currentPage=${resultPage.currPage+1}">下一页</a></td>
        </tr>

</table>

</body>
</html>
