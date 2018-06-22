<!DOCTYPE HTML>
<html>
<head>
<#include "../commons/_jscommon.ftl">
<title>管理员列表</title>
</head>
<body>
<nav class="breadcrumb"><i class="Hui-iconfont">&#xe67f;</i> 首页 <span class="c-gray en">&gt;</span> 权限列表管理 <span class="c-gray en">&gt;</span> 权限列表 <a class="btn btn-success radius r" style="line-height:1.6em;margin-top:3px" href="javascript:location.replace(location.href);" title="刷新" ><i class="Hui-iconfont">&#xe68f;</i></a></nav>
<div class="page-container">
	<div class="cl pd-5 bg-1 bk-gray mt-20">
        <span class="l">
            <a href="javascript:;" onclick="admin_add('添加新权限','authorization-add.html','800','500')" class="btn btn-primary radius">
                <i class="Hui-iconfont">&#xe600;</i> 添加新权限</a>
        </span>
        <span class="r">
			<#if list ?exists>
				共有数据：<strong>${list.total} </strong> 条</span>
			<#else >
                共有数据：<strong>0 </strong> 条</span>
			</#if>

    </div>
	<table class="table table-border table-bordered table-bg">
		<thead>
			<tr>
				<th scope="col" colspan="9">用户列表</th>
			</tr>
			<tr class="text-c">
				<th width="40">ID</th>
				<th width="150">权限名称</th>
				<th width="150">权限描述</th>
				<th width="130">创建时间</th>
                <th width="150">修改时间</th>
				<th width="100">是否作废</th>
                <th width="100">创建人</th>
				<th width="100">操作</th>
			</tr>
		</thead>
		<tbody>

        <#if list?exists>
            <#list list.authorizations as p>
            <tr class="text-c">
                <td>${p.id}</td>
                <td>${p.authorizationName}</td>
                <td><#if p.description??>${p.description}</#if></td>
                <td><#if p.gmtCreate??>${p.gmtCreate?string('yyyy-MM-dd hh:mm:ss')}</#if></td>
                <td><#if p.gmtModified??>${p.gmtModified?string('yyyy-MM-dd hh:mm:ss')}</#if></td>
                <td class="td-status"><span class="label label-success radius"><#if p.status==0>已启用<#else>已禁用</#if></span></td>
                <td><#if p.creater??>${p.creater}</#if></td>
                <td class="td-manage">
					<a title="编辑" href="javascript:;" onclick="admin_edit('权限编辑','../user/to-authorization-edit.html?id=${p.id}','800','800')" class="ml-5" style="text-decoration:none"><i class="Hui-iconfont">&#xe6df;</i></a>
				</td>
            </tr>
            </#list>
		<#else>
        <tr class="text-c">
            <td colspan="8"><span style="font-size: larger; color: #0a6999">对不起！我什么也没有查询到！<i class="Hui-iconfont">&#xe688;</i></span></td>
        </tr>
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
        // "aaSorting": [[ 1, "desc" ]],//默认第几个排序
        "bStateSave": true,//状态保存
        "aoColumnDefs": [
            //{"bVisible": false, "aTargets": [ 3 ]}, //控制列的隐藏显示
            {"orderable":false,"aTargets":[0,8]}// 制定列不参与排序
        ]
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

/!*管理员-编辑*!/
function admin_edit(title,url,w,h){
	layer_show(title,url,w,h);
}
</script>
</body>
</html>