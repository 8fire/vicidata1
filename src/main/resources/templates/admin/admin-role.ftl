<!DOCTYPE HTML>
<html>
<head>
<#include "../commons/_jscommon.ftl">
<title>角色管理</title>
</head>
<body>
<nav class="breadcrumb"><i class="Hui-iconfont">&#xe67f;</i> 首页 <span class="c-gray en">&gt;</span> 管理员管理 <span class="c-gray en">&gt;</span> 角色管理 <a class="btn btn-success radius r" style="line-height:1.6em;margin-top:3px" href="javascript:location.replace(location.href);" title="刷新" ><i class="Hui-iconfont">&#xe68f;</i></a></nav>
<div class="page-container">
	<div class="cl pd-5 bg-1 bk-gray">
		<span class="l">
			<a class="btn btn-primary radius" href="javascript:;" onclick="admin_role_add('添加角色','to-role-add.ftl','500px','400px')"><i class="Hui-iconfont">&#xe600;</i> 添加角色</a> </span>
		<span class="r">共有数据：<strong>54</strong> 条</span> </div>
	<table class="table table-border table-bordered table-hover table-bg">
		<thead>
			<tr>
				<th scope="col" colspan="8">角色管理</th>
			</tr>
			<tr class="text-c">
				<th width="40">ID</th>
				<th width="200">角色名</th>
				<th width="300">描述</th>
				<th width="300">创建人</th>
                <th width="300">创建时间</th>
                <th width="300">修改时间</th>
                <th width="300">是否启用</th>
				<th width="70">操作</th>
			</tr>
		</thead>
		<tbody>
				<#if list ?exists>
					<#list list as p >
                    <tr class="text-c">
                        <td>${p.id}</td>
                        <td><#if p.roleName??>${p.roleName}</#if></td>
                        <td><#if p.description??><a href="#">${p.description}</#if></a></td>
						<td><#if p.creater??>${p.creater}</#if></td>
                        <td><#if p.gmtCreate??>${p.gmtCreate?string('yyyy-MM-dd hh:mm:ss')}</#if></td>
                        <td><#if p.gmtModified??>${p.gmtModified?string('yyyy-MM-dd hh:mm:ss')}</#if></td>
                        <td class="td-status"><span class="label label-success radius"><#if p.status==0>已启用<#else>已禁用</#if></span></td>
                        <td class="f-14">
							<a title="编辑" href="javascript:;" onclick="admin_role_edit('角色编辑','role-edit.html?id=${p.id}','500px','500px')" style="text-decoration:none">
							<i class="Hui-iconfont">&#xe6df;</i></a>
                            <a title="分配权限" href="javascript:;" onclick="pression_role_edit('分配权限','to-add-role-permission.html?id=${p.id}','900px','900px')" style="text-decoration:none">
								<i class="Hui-iconfont">&#xe6df;</i></a>
						</td>
                    </tr>
				     </#list>
				</#if>
		</tbody>
	</table>
</div>
<#include "../commons/_footer.ftl">
<!--请在下方写此页面业务相关的脚本-->
<script type="text/javascript" src="../../static/lib/datatables/1.10.0/jquery.dataTables.min.js"></script>
<script type="text/javascript">
    $('.table').dataTable({});
/*管理员-角色-添加*/
function admin_role_add(title,url,w,h){
    layer.open({
        type: 2,
        title: title,
        maxmin: false,
        skin: 'layui-layer-lan',
        shadeClose: true, //点击遮罩关闭层
        area : [w , h],//宽高
        content:[url,'no']
    });
	//layer_show(title,url,w,h);
}
function pression_role_edit(title,url,w,h) {
    var index=layer.open({
        type: 2,
        title: title,
        maxmin: false,
        skin: 'layui-layer-lan',
        shadeClose: true, //点击遮罩关闭层
        area : [w , h],//宽高
        content:[url,'no']
    });
    layer.full(index);
}
/*管理员-角色-编辑*/
function admin_role_edit(title,url,w,h){
    layer.open({
        type: 2,
        title: title,
        maxmin: true,
        skin: 'layui-layer-lan',
        shadeClose: true, //点击遮罩关闭层
        area : [w , h],//宽高
        content:[url,'yes']
    });

	//layer_show(title,url,w,h);
}
/*管理员-角色-删除*/
function admin_role_del(obj,id){
	layer.confirm('角色删除须谨慎，确认要删除吗？',function(index){
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
</script>
</body>
</html>