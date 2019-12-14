<%--
  Created by IntelliJ IDEA.
  User: 93419
  Date: 2019/11/17
  Time: 9:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%

	String Path = request.getContextPath()+"/layui/";
%>
<html>
<head>
	<title>登录界面</title>
	<link type="text/css" rel="stylesheet" href=<%=Path+"css/layui.css"%>>

	<script type="text/javascript" src=<%=Path+"layui.js"%>></script>
</head>
<body>
<div class="layui-main login">
	<form class="layui-form" method="post" action="LoginServlet">
		<c:choose>
			<c:when test="${requestScope.user != null}">
				<span>欢迎你：${requestScope.user.UNAME}</span>
				<span>当前积分：${requestScope.user.UINTEGRAL}</span>
				<span><a href="#">个人信息</a></span>
				<span><a href="#">我要上传</a></span>
				<span><a href="#">我要下载</a></span>
			</c:when>

		</c:choose>

		<div class="layui-form-item">
			<div class="layui-input-inline">
				<input type="text" name="uid" required  lay-verify="required" placeholder="请输入搜索内容" autocomplete="off" class="layui-input">
				<input type="button" class="layui-upload-button" value="搜索文档">
			</div>
		</div>


	</form>
</div>
</body>
</html>
