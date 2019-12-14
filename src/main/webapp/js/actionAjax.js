function delAjax(obj)
{
	layui.$.ajax({
		type: "post",
		url: "delQuery.action",
		data: obj,
		dataType: "json",
		async: true,
		success: function (msg) {
			analysisTool(msg);
		},
		error: function () {
			console.log(obj);
			layer.msg("系统故障，请联系维护人员");
		}
	})
}

function updateAjax(obj)
{
	layui.$.ajax({
		type: "post",
		url: "updateQuery.action",
		data: obj,
		dataType: "json",
		async: true,
		success: function (msg) {
			analysisTool(msg);
		},
		error: function () {
			console.log(obj);
			layer.msg("系统故障，请联系维护人员");
		}
	})
}