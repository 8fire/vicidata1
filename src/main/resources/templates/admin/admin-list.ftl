<!DOCTYPE HTML>
<html>
<head>
<#include "../commons/_jscommon.ftl">
<![endif]-->
<title>管理员列表</title>
</head>
<body>
<nav class="breadcrumb"><i class="Hui-iconfont">&#xe67f;</i> 首页 <span class="c-gray en">&gt;</span> 权限管理 <span class="c-gray en">&gt;</span> 用户列表 <a class="btn btn-success radius r" style="line-height:1.6em;margin-top:3px" href="javascript:location.replace(location.href);" title="刷新" ><i class="Hui-iconfont">&#xe68f;</i></a></nav>
<div class="page-container">
	<table class="table table-border table-bordered table-bg ">
		<thead>
			<tr>
				<th scope="col" colspan="9">用户列表</th>
			</tr>
			<tr class="text-c">
				<th width="25"><input type="checkbox" name="" value=""></th>
				<th width="40">ID</th>
				<th width="150">登录手机号</th>
                <th width="150">角色</th>
				<th width="150">登录邮箱号</th>
				<th width="150">上次登录时间</th>
				<th width="130">创建时间</th>
				<th width="100">是否已启用</th>
				<th width="100">操作</th>
			</tr>
		</thead>
		<tbody>

        <#if list?exists>
            <#list list as p>
            <tr class="text-c">
                <td><input name="" type="checkbox" value="1"></td>
                <td>${p.id}</td>
                <td>${p.login_phone}</td>
				<td><#if p.roleName??>${p.roleName}</#if></td>
                <td>${p.login_email}</td>
                <td><#if p.last_login_time??>${p.last_login_time?string('yyyy-MM-dd hh:mm:ss')}</#if></td>
                <td><#if p.gmt_create??>${p.gmt_create?string('yyyy-MM-dd hh:mm:ss')}</#if></td>
                <td class="td-status"><#if p.status==0>
				<span class="label label-success radius">
					已启用
				</span>
				<#else>
				<span class="label label-danger radius">
					已禁用
				</span>
				</#if></td>
                <td class="td-manage">
					<a style="text-decoration:none" onClick="admin_stop(this,'${p.id}')" href="javascript:;" title="停用"><i class="Hui-iconfont">&#xe631;</i></a>
                    <a style="text-decoration:none" onClick="admin_start(this,'${p.id}')" href="javascript:;" title="启用"><i class="Hui-iconfont">&#xe615;</i></a>
					<a title="编辑" href="javascript:;" onclick="admin_edit('用户编辑','../user/toadmin-edit.html?id=${p.id}','800px','500px')" class="ml-5" style="text-decoration:none"><i class="Hui-iconfont">&#xe6df;</i></a>
				</td>
            </tr>
            </#list>
        </#if>
		</tbody>
	</table>
</div>
<#include "../commons/_footer.ftl">

<!--请在下方写此页面业务相关的脚本-->
<script type="text/javascript" src="../../static/lib/My97DatePicker/4.8/WdatePicker.js"></script>
<script type="text/javascript" src="../../static/lib/datatables/1.10.0/jquery.dataTables.min.js"></script>
<script type="text/javascript" src="../../static/lib/laypage/1.2/laypage.js"></script>
<script type="text/javascript">
    $('.table').dataTable({

    });
/*
	参数解释：
	title	标题
	url		请求的url
	id		需要操作的数据id
	w		弹出层宽度（缺省调默认值）
	h		弹出层高度（缺省调默认值）
*/
/*管理员-增加*/
function admin_add(title,url,w,h){
	layer_show(title,url,w,h);
}
/*管理员-删除*/
function admin_del(obj,id){
	layer.confirm('确认要删除吗？',function(index){
		$.ajax({
			type: 'POST',
			url: '',
			dataType: 'json',
			success: function(data){
				$(obj).parents("tr").remove();
				layer.msg('已删除!',{icon:1,time:1000});
			},
			error:function(data) {
				console.log(data.msg);
			},
		});		
	});
}

/!*管理员-编辑*!/
function admin_edit(title,url,w,h){
    layer.open({
        type: 2,
        title: title,
        maxmin: true,
        skin: 'layui-layer-lan',
        shadeClose: true, //点击遮罩关闭层
        area : [w , h],//宽高
        content:[url,'no']
    });
//	layer_show(title,url,id,w,h);
}



/*管理员-停用*/
function admin_stop(obj,id){
    layer.prompt({title: '停用意见'}, function(value, index){
        $.post("../user/updateUserStatus", {id:id, flag:1,checkAdvice:value}, function(data){
            if(data.code=='200'){
                $(obj).parents("tr").find(".td-status").html('<span class="label label-danger radius">已禁用</span>');
                layer.msg('已停用!', {icon: 6, time: 1000});
            }else if(data.code=='403'){
                layer.msg(data.msg, {icon: 5, time: 1000});
            } else {
                layer.msg('更新状态失败!',{icon: 5,time:1000});
            }
        }), function(){
            layer.close(index);
        };
    });
}

/*管理员-启用*/
function admin_start(obj,id){
        layer.prompt({title: '启用意见'}, function(value, index){
            $.post("../user/updateUserStatus", {id:id, flag:0,checkAdvice:value}, function(data){
                var stringify = JSON.stringify(data);
                alert(stringify)
                if(data.code=='200'){
                    $(obj).parents("tr").find(".td-status").html('<span class="label label-success radius">已启用</span>');
                    layer.msg('已启用!', {icon: 6,time:1000});
                }else if(data.code=='403'){
                    layer.msg(data.msg, {icon: 5, time: 1000});
                } else {
                    layer.msg('更新状态失败!',{icon: 5,time:1000});
                }
            }), function(){
                layer.close(index);
            };
    });
}
</script>
</body>
</html>