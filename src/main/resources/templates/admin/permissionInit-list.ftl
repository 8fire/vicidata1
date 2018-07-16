<!DOCTYPE HTML>
<html>
<head>
<#include "../commons/_jscommon.ftl">
<![endif]-->
<title>初始化权限列表</title>
</head>
<body>
<nav class="breadcrumb"><i class="Hui-iconfont">&#xe67f;</i> 首页 <span class="c-gray en">&gt;</span> 管理员管理 <span class="c-gray en">&gt;</span> 管理员列表 <a class="btn btn-success radius r" style="line-height:1.6em;margin-top:3px" href="javascript:location.replace(location.href);" title="刷新" ><i class="Hui-iconfont">&#xe68f;</i></a></nav>
<div class="page-container">
    <div class="cl pd-5 bg-1 bk-gray mt-20">
        <span class="l">
            <a href="javascript:;" onclick="admin_add('添加新权限','../user/permissionInit-add.html','800px','500px')" class="btn btn-primary radius">
                <i class="Hui-iconfont">&#xe600;</i> 添加新权限</a>
        </span>
    </div>

	<table class="table table-border table-bordered table-bg table-hover table-sort">
		<thead>
			<tr>
				<th scope="col" colspan="9">用户列表</th>
			</tr>
			<tr class="text-c">
				<th width="25"><input type="checkbox" name="" value=""></th>
				<th width="40">初始权限名称</th>
				<th width="150">类型</th>
				<th width="150">路径</th>
				<th width="130">创建时间</th>
                <th width="150">修改时间</th>
				<th width="100">操作</th>
			</tr>
		</thead>
		<tbody>

        <#if list?exists>
            <#list list as p>
            <tr class="text-c">
                <td><input name="" type="checkbox" value="1"></td>
                <td>${p.permissionInit}</td>
                <td>${p.permissionType}</td>
                <td>${p.url}</td>
                <td><#if p.gmtCreate??>${p.gmtCreate?string('yyyy-MM-dd hh:mm:ss')}</#if></td>
                <td><#if p.gmtModify??>${p.gmtModify?string('yyyy-MM-dd hh:mm:ss')}</#if></td>
                <td class="td-manage">
					<a title="编辑" href="javascript:;" onclick="admin_edit('用户编辑','../user/toadmin-edit.html?id=${p.id}','800px','500px')" class="ml-5" style="text-decoration:none"><i class="Hui-iconfont">&#xe6df;</i></a>
					<a title="删除" href="javascript:;" onclick="admin_del(this,'1')" class="ml-5" style="text-decoration:none"><i class="Hui-iconfont">&#xe6e2;</i></a>
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
    $('.table-sort').dataTable({

    });
/*管理员-增加*/
function admin_add(title,url,w,h){
    layer.open({
        type: 2,
        title:title,
        maxmin: true,
        skin: 'layui-layer-lan',
        shadeClose: true, //点击遮罩关闭层
        area : [w , h],//宽高
        content:[url,'no']
    });
}
/*管理员-删除*/
function admin_del(obj,id){
	layer.confirm('确认要删除吗？',function(index){
		$.ajax({
			type: 'POST',
			url: '',
			dataType: 'json',
			success: function(data){
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
        title:title,
        maxmin: true,
        skin: 'layui-layer-lan',
        shadeClose: true, //点击遮罩关闭层
        area : [w , h],//宽高
        content:[url,'no']
    });
}

</script>
</body>
</html>