<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>医疗数据校验结果</title>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <meta http-equiv="X-UA-Compatible" content="ie=edge" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/fontawesome.min.css" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap.min.css" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/templatemo-style.css">
</head>

<script>
    function massage(sqlText){

        alert(sqlText);
        console.log(sqlText);
    }
</script>

<body>
<header class="tm-footer row tm-mt-small">

</header>
    <table class="table table-hover tm-table-small tm-product-table" align="center">
        <tr>
            <thead>
<%--            <td>记录编号</td>--%>
            <td>查错SQL</td>
            <td>源表名</td>
            <td>错误类型</td>
            <td>上传时间</td>
            <td>校验时间</td>
            <td>人员编号</td>
            <td>事件编号</td>
            <td>操作</td>
            </thead>
        </tr>
        <tbody>
        <%--    <c:if test="${!resultPage==null}">--%>
        <c:forEach var="u" items="${resultPage.lists}"
                   begin="${(resultPage.currPage-1)*resultPage.pageSize}" end="${resultPage.currPage*resultPage.pageSize}">
            <tr>
<%--                <td>${u.id}</td>--%>
                <td>${u.sqlText}</td>
                <td>${u.tableName}</td>
                <c:if test="${u.resultType==1}">
                    <td>无对应记录</td>
                </c:if>
                <c:if test="${u.resultType==2}">
                    <td>无记录且源person_id为空</td>
                </c:if>
                <td><fmt:formatDate value="${u.uploadDate}" pattern="yyyy年MM月dd日" /></td>
                <td><fmt:formatDate value="${u.checkDate}" pattern="yyyy年MM月dd日" /></td>
                <td>${u.personId}</td>
                <td>${u.ehrId}</td>
                <script>
                    let sqlText=${u.sqlText};
                </script>
                <td>
                    <button id="alterSQLMassage" onclick="massage(sqlText)">查错SQL</button>
<%--                    <a href="#">尝试修复</a>--%>
                </td>
            </tr>
        </c:forEach>
        <%--    </c:if>--%>
        </tbody>
        <tr align="right">
            <td colspan="9"><a href="${pageContext.request.contextPath}/main/pagination?currentPage=1">首页,</a>
                当前页&nbsp;${resultPage.currPage}
                /&nbsp;${resultPage.totalPage}&nbsp;总页数,
                <c:if test="${resultPage.currPage==1}" var="flag">
                上一页&nbsp;
                </c:if>
                <c:if test="${!flag}">
                <a href="${pageContext.request.contextPath}/main/pagination?currentPage=${resultPage.currPage-1}">&nbsp;上一页</a>
                </c:if>
                <c:if test="${resultPage.currPage==resultPage.totalPage}" var="flag">
                下一页&nbsp;
                </c:if>
                <c:if test="${!flag}">
                <a href="${pageContext.request.contextPath}/main/pagination?currentPage=${resultPage.currPage+1}">&nbsp;下一页</a>
                </c:if>
                <a href="${pageContext.request.contextPath}/main/pagination?currentPage=${resultPage.totalPage}">&nbsp;尾页</a>
        </tr>
    </table>
<%--<a href="${pageContext.request.contextPath}/main/operation" target="_blank">qwe</a>--%>

<footer class="tm-footer row tm-mt-small">
</footer>
<script src="${pageContext.request.contextPath}/js/jquery-3.3.1.min.js"></script>
<script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
</body>
</html>
