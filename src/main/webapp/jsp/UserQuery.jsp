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
	String jspath = request.getContextPath()+"/js/";
	String cssPath = request.getContextPath()+"/css/";
%>
<html>
<head>
	<title>用户查询</title>
	<link rel="stylesheet" href=<%=Path+"css/layui.css"%>>
	<script type="text/javascript" src=<%=Path+"layui.js"%>></script>
	<script type="text/javascript" src=<%=jspath+"actionAjax.js"%>></script>
</head>
<body>
<div class="demoTable" style="text-align: center">
	<div class="layui-inline">
		注册时间：
		<div class="layui-input-inline">
			<input type="date" class="layui-input" id="startDate" name="startDate" placeholder="yyyy-MM-dd" >
		</div>
		至
		<div class="layui-input-inline">
			<input type="date" class="layui-input" id="endDate" name="endDate" placeholder="yyyy-MM-dd" >
		</div>
		用户名：
		<div class="layui-input-inline">
			<input type="text" class="layui-input" id="userName" name="userName" placeholder="请输入用户名" >
		</div>

		<button class="layui-btn" data-type="reload" id="search" >搜索</button>
		<button class="layui-btn" data-type="add" id="newAdd">新增</button>
	</div>
</div>


<table class="layui-hide" id="demo" lay-filter="user"></table>

<script type="text/html" id="barDemo">
	<a class="layui-btn layui-btn-xs" id="update-user-status" lay-event="edit">修改</a>
	<a class="layui-btn layui-btn-danger layui-btn-xs" lay-event="del">删除</a>
</script>


<table class="layui-table" lay-data="{url:'tableQuery.action', page:true, id:'idTest'}" lay-filter="demo">
	<thead>
	<tr>
		<th lay-data="{field:'usid', sort: true, fixed: true}">用户id</th>
		<th lay-data="{field:'rn'}">序号</th>
		<th lay-data="{field:'uname'}">用户名</th>
		<th lay-data="{field:'uregdate'}">注册时间</th>
		<th lay-data="{field:'uintegral'}">积分</th>
		<th lay-data="{field:'uuploadnum'}">上传文档数</th>
		<th lay-data="{field:'udownloadnum'}">下载文档数</th>
		<th lay-data="{field:'utype'}">用户状态</th>
		<th lay-data="{fixed: 'right',width:200,align:'center', toolbar: '#barDemo'}"></th>
	</tr>
	</thead>
</table>

<script>
	layui.use('table', function () {
		var table = layui.table;
		//监听工具条
		table.on('tool(demo)', function (obj) {
			var data = obj.data;
			if (obj.event === 'del') {
				layer.confirm('删除确认', function (index) {
					var delid = data.usid;
					var ob = {

						USID:delid,

					};
					delAjax(ob);
					obj.del();
					layer.close(index);
				});
			} else if (obj.event === 'edit') {
				layer.open({
					type: 1,
					btn: ['修改', '取消'],
					btn1: function (index, layero) {
						var upname = $('#update-name').val();
						// var upint = $('#update-integral').val();
						// var uptype = $('#update-type').val();
						var upid = data.usid;
						var uob = {
							USID: upid,
							UNAME: upname
							// UINTEGRAL: upint,
							// UTYPE: uptype

						};
						updateAjax(uob);
						setTimeout(function () {
							table.reload('idTest');
						},1000);
						layer.close(index);
					},
					content: '<div style="padding: 50px; line-height: 22px; background-color: #393D49; color: #fff; font-weight: 300;">' +
						'<div class="layui-inline">' +
						'用户名：<div>' +
						'<input type="text" id="update-name" autocomplete="off" class="layui-input">' +
						'</div><br>' +
						'积分：<div>' +
						'<input type="text" id="update-integral" autocomplete="off" class="layui-input">' +
						'</div><br>' +
						'状态：<div>' +
						'<input type="text" id="update-type" autocomplete="off" class="layui-input">' +
						'</div><br>' +
						'</div>' +
						'</div>'
				});
			}
		});

		var $ = layui.$, active = {};

		$('#form-search').on('click', function () {
			var send_title = $("#cocutitle").val();
			var send_type = $("#docutype").val();
			var send_status = $("#docustauts").val();
			table.reload('idTest', {
				method: 'post'
				, where: {
					'send_title': send_title,
					'send_type': send_type,
					'send_status': send_status
				}
				, page: {
					curr: 1
				}
			});
		});

		$('#upload-file').on('click', function () {
			layer.open({
				type: 2 //此处以iframe举例
				,title:'文件上传'
				,content:'fileupload.jsp'
				,area:['300px','300px']
				,offset:'auto'
				,btn: ['关闭']
				,btn1:function () {
					layer.closeAll();
				}
				,shade:0.5
				,id:'upload-file-window'
				,anim:1
				,resize:false
				,move:false
				,success:function () {

				}
			});
		});
		$(function () {
			var myUserId = $(window.parent.document).find("#eternal-user-id").val();
			var myUserName = $(window.parent.document).find("#eternal-user-name").val();
			$("#now-user-id").val(myUserId);
			$("#now-user-name").val(myUserName);
			console.log(myUserId+"//"+myUserName);
		});
	});
</script>


</body>
</html>
