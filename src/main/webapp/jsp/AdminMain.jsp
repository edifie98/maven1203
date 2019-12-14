<!DOCTYPE html>
<%@page contentType="text/html; charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>一卡通系统后台管理</title>
    <%
        String cssPath=request.getContextPath()+"/css/";
        String jsPath=request.getContextPath()+"/js/";

        String Path = request.getContextPath()+"/layui/";

    %>
    <link rel="stylesheet" href=<%=cssPath+"WorkerMainCss.css"%>>
    <script type="text/javascript" src=<%=jsPath+"util.js"%> ></script>
	<script type="text/javascript" src=<%=jsPath+"mainUrlChange.js"%>></script>
    <link rel="stylesheet" href=<%=Path+"css/layui.css"%>>
    <script type="text/javascript" src=<%=Path+"layui.js"%>></script>


</head>
<body>

<div id="head">
    <div id="page-title"> <h1>文档管理系统</h1></div>
    <div id="user-name-label">

        <c:choose>
        <c:when test="${requestScope.user != null}">
            <span>欢迎你</span>
            <span>/</span>
            <span><a href="">注销</a></span>
        </c:when>

    </c:choose>


    </div>
</div>
<div id="accordion" class="panel-group">
	<div class="panel panel-default">
    <c:if test="${requestScope.menu != null}">
        <c:forEach items="${requestScope.menu}" begin="0" step="1" var="X">
        <div class="panel-heading">
            <div class="panel-heading">
                <h4 class="panel-title">

                    <a data-toggle="collapse" data-parent="#accordion"
                       href="#collapse${X.key}">
                            ${X.key}
                    </a>

                </h4>
            </div>
        </div>
            <div id="collapse${X.key}" class="panel-collapse collapse in">
                <div class="panel-body">
                    <ul>
                        <c:forEach items="${X.value}" begin="0" step="1" var="Y">
                            <li><a name="${Y.CHILDNAME}" title="${Y.MENU_URL}"  href="javascript:void(0)">${Y.CHILDNAME}</a></li>
                        </c:forEach>
                    </ul>
                </div>
            </div>
            </c:forEach>
    </c:if>


	</div>
</div>



<div id="section">

    <iframe src="" frameborder="0"  name="page-view" id="myiframe">

    </iframe>
</div>
<!--<div id="foot"></div>-->
</body>
</html>