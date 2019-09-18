<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>分页展示</title>
</head>
<body>
<table id="fenye" border="">
    <tr>
        <thead>
        <td align="center">id</td>
        <td align="center">person_id</td>
        <td align="center">ehr_id</td>
        <td align="center">gather_date</td>
        <td align="center">operate</td>
        </thead>
    </tr>
    <tbody>
<%--    <c:if test="${!resultPage==null}">--%>
        <c:forEach var="u" items="${resultPage.lists}"
                   begin="${(resultPage.currPage-1)*resultPage.pageSize}" end="${resultPage.currPage*resultPage.pageSize}">
        <tr>
            <td>${u.id}</td>
            <td>${u.personId}</td>
            <td>${u.ehrId}</td>
            <td>${u.gatherDate}</td>
            <td>
                <a href="#">尝试修复</a>
            </td>
        </tr>
        </c:forEach>
<%--    </c:if>--%>
    </tbody>
        <tr align="right">
            <td colspan="5"><a href="/main/fenye?currentPage=1">首页,</a>
                当前页&nbsp;${resultPage.currPage}&nbsp;
                /${resultPage.totalPage}&nbsp;总页数,
                <c:if test="${resultPage.currPage==1}" var="flag">
                    上一页&nbsp;
                </c:if>
                <c:if test="${!flag}">
                    <a href="/main/fenye?currentPage=${resultPage.currPage-1}">&nbsp;上一页</a>
                </c:if>
                <c:if test="${resultPage.currPage==resultPage.totalPage}" var="flag">
                    下一页&nbsp;
                </c:if>
                <c:if test="${!flag}">
                    <a href="/main/fenye?currentPage=${resultPage.currPage+1}">&nbsp;下一页</a>
                </c:if>
                <a href="/main/fenye?currentPage=${resultPage.totalPage}">&nbsp;尾页</a>
        </tr>

</table>

</body>
</html>
