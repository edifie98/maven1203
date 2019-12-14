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
	<title>用户查询</title>
	<link rel="stylesheet" href=<%=Path+"css/layui.css"%>>
	<script type="text/javascript" src=<%=Path+"layui.js"%>></script>
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
		<div class="layui-upload">
			<button type="button" class="layui-btn layui-btn-normal" id="test8">选择文件</button>
			<button type="button" class="layui-btn layui-btn-normal" id="test9">开始上传</button>
		</div>
	</div>
</div>


<table class="layui-hide" id="demo" lay-filter="user"></table>

<script type="text/html" id="barDemo">
	<a class="layui-btn layui-btn-primary layui-btn-xs" lay-event="detail">查看</a>
	<a class="layui-btn layui-btn-xs" lay-event="edit">编辑</a>
	<button class="layui-btn layui-btn-danger layui-btn-xs" lay-event="del" id="del">删除</button>
</script>



<script>
	layui.use('upload', function(){
		var $ = layui.jquery,
			upload = layui.upload;

		upload.render({
			elem: '#test8'
			,url: 'upload.action'
			,auto: false
			,accept: 'file' //普通文件
			,bindAction: '#test9'
			,done: function(json){
				//如果上传失败
				if(json.code === 0){
					return layer.msg('上传失败');
				}
				//上传成功
				if(json.code > 0) {
					return layer.msg('上传成功');
				}
			}
		});
	});



	layui.use('table', function(){
		var table = layui.table;

		//第一个实例
		table.render({
			elem: '#demo'
			,height: 312
			// ,method:'post'
			,url: 'tableQuery.action' //数据接口
			,page: true //开启分页
			,id:'mytable'
			,limit:5
			,cols: [[ //表头

		{field: 'usid', title: '用户id', sort: true, fixed: 'left', hide: 'true', align: 'center'}
		, {field: 'rn', title: '序号', align: 'center'}
		, {field: 'uname', title: '用户名', align: 'center'}
		, {field: 'uregdate', title: '注册时间', sort: true, align: 'center'}
		, {field: 'uintegral', title: '积分', sort: true, align: 'center'}
		, {field: 'uuploadnum', title: '上传文档数', align: 'center'}
		, {field: 'udownloadnum', title: '下载文档数', align: 'center'}
		, {field: 'utype', title: '用户状态', align: 'center'}
		, {field: 'right', title: '操作' , toolbar:'#barDemo'}
			]]
		});



		layui.$, active = {
		reload: function () {
			var startDate = $("#startDate").val();
			var endDate = $("#endDate").val();
			var userName = $("#userName").val();

			table.reload('mytable', {
				page: {
					curr: 1 //重新从第 1 页开始
				}
				, where: {

						 startDate: startDate,
						 endDate: endDate,
						 userName: userName

				}
			}, 'data');
		}
	};



	var $ = layui.$;
	$("#search").on('click', function () {
		var type = $(this).data('type');
		active[type] ? active[type].call(this) : '';
	});

	$('#del').on('click', function(){
			var delbtn = $(this).data('delbtn');
			active[delbtn] ? active[delbtn].call(this) : '';
		alert("abc")
	});


	$('#newAdd').on('click', function(){
			var othis = $(this), method = othis.data('method');
			active[method] ? active[method].call(this, othis) : '';

			layer.open({
				type: 1,
				offset: 'auto',
				moveType: 1 ,//拖拽模式，0或者1
				content: '<div style="padding: 50px; line-height: 22px; background-color: #393D49; color: #fff; font-weight: 300;">' +
					'<div class="layui-inline">' +
					'用户名：<div>' +
					'<input type="text" id="new-uName" autocomplete="off" class="layui-input">' +
					'</div><br>' +
					'密码：<div>' +
					'<input type="password" id="new-uPass" autocomplete="off" class="layui-input">' +
					'</div><br>' +
					'性别：<div class="layui-input-inline">' +
					'<input id="man" type="radio" checked="checked" name="sex" />男' +
					'<input id="woman" type="radio"  name="sex"/>女' +
					'</div><br>' +
					'教育水平：<div>' +
					'<select id="new-uEdu">' +
					'<option value="">高中</option>' +
					'<option value="">专科</option>' +
					'<option value="">本科</option>' +
					'<option value="">研究生</option>' +
					'<option value="">硕士</option>' +
					'<option value="">博士</option>' +
					'</select>' +
					'</div><br>' +
					'职业：<div>' +
					'<input type="text" id="new-uState" autocomplete="off" class="layui-input">' +
					'</div><br>' +
					'手机号码：<div>' +
					'<input type="text" id="#new-uTel" autocomplete="off" class="layui-input">' +
					'</div><br>' +
					'email：<div>' +
					'<input type="email" id="new-uMail" autocomplete="off" class="layui-input">' +
					'</div>' +
					'</div>' +
					'</div>',
				skin: 'layui-layer-rim', //加上边框
				area: ['350px', '450px'] ,//宽高
				anim: 5,
				btn: ['新增', '取消'], //可以无限个按钮
				btn1:function () {
					var username = $('#new-uName').val();
					var password = $('#new-uPass').val();
					var usersex = $("input[name='sex']:checked").val();
					var education = $('#new-uEdu').val();
					var state = $('#new-uState').val();
					var phone = $('#new-uTel').val();
					var email = $('#new-uMail').val();
					if (username.length>0){
						if (password.length>0){
							// if(state.length>0){
								// if (phone.length===11){
					// 				if (email.length>0){
										var ob = {

											UNAME:username,
											UPASS:password,
											USEX:usersex,
											UEDU:education
											// ustate:state,
											// utel:phone,
											// umail:email
										};

										$.ajax({
											type: 'post',
											url: 'addQuery.action',
											data: ob,
											dataType: 'json',
											async: true,
											success : function(msg) {
												if (msg.eq("succ")){
													layer.msg("添加成功");
												} else {
													layer.msg("添加失败");
												}
												layer.close();

											},
											error : function() {
												alert('失败 ');
											}

										});

							// 		} else {
							// 			layer.msg("请填写电子邮箱");
							// 		}
							// 	} else {
							// 		layer.msg("请填写正确的手机号码");
							// 	}
							// }else {
							// 	layer.msg("请填写职业");
							// }
						} else {
							layer.msg("请填写密码");
						}
					} else {
						layer.msg("请填写用户名");
					}
				}
			});


		});


	});



</script>



</body>
</html>
