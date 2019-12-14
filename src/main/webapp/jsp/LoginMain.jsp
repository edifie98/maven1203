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
	<link rel="stylesheet" href=<%=Path+"css/layui.css"%>>
	<script type="text/javascript" src=<%=Path+"layui.js"%>></script>
</head>
<body>
<div class="layui-main login">
	<h1 align="center">后台登录</h1>
	<form class="layui-form" method="post" action="login.action">
		<div class="layui-form-item">
			<label class="layui-form-label">账   号</label>
			<div class="layui-input-inline">
				<input type="text" name="uid" required  lay-verify="required" placeholder="请输入标题" autocomplete="off" class="layui-input">
			</div>
		</div>
		<div class="layui-form-item">
			<label class="layui-form-label">密   码</label>
			<div class="layui-input-inline">
				<input type="password" name="uPass" required lay-verify="required" placeholder="请输入密码" autocomplete="off" class="layui-input">
			</div>



		</div>
		<div class="layui-input-block">
			<button class="layui-btn" lay-submit lay-filter="formDemo" type="submit">登录</button>
			<button type="reset" class="layui-btn layui-btn-primary">重置</button>
		</div>
	</form>
</div>
</body>
</html>
