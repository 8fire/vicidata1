<!DOCTYPE HTML>
<html>
<head>
<#include "../../commons/_jscommon.ftl">
<![endif]-->
<title>管理员列表</title>
</head>
<body>
<nav class="breadcrumb"><i class="Hui-iconfont">&#xe67f;</i> 首页 <span class="c-gray en">&gt;</span> 权限管理 <span class="c-gray en">&gt;</span> 用户列表 <a class="btn btn-success radius r" style="line-height:1.6em;margin-top:3px" href="javascript:location.replace(location.href);" title="刷新" ><i class="Hui-iconfont">&#xe68f;</i></a></nav>
<div class="page-container">
    <div class="cl pd-5 bg-1 bk-gray mt-20">
        <span class="l">
            <a href="javascript:;" onclick="admin_add('添加文章','../backblog/toAddArticle.html','','')" class="btn btn-primary radius">
                <i class="Hui-iconfont">&#xe600;</i> 添加文章</a>
        </span>
   <#-- <span class="r">
			<#if list ?exists>
				共有数据：<strong>${list.total} </strong> 条</span>
			<#else >
                共有数据：<strong>0 </strong> 条</span>
			</#if>-->

    </div>
	<table class="table table-border table-bordered table-bg ">
		<thead>
			<tr>
				<th scope="col" colspan="9">文章列表</th>
			</tr>
			<tr class="text-c">
				<th width="25"><input type="checkbox" name="" value=""></th>
				<th width="150">标题</th>
				<th width="150">文章状态</th>
				<th width="150">文章类型</th>
				<th width="130">是否置顶</th>
                <th width="130">创建时间</th>
				<th width="100">操作</th>
			</tr>
		</thead>
		<tbody>

        <#if map.articleList?exists>
            <#list map.articleList as p>
            <tr class="text-c">
                <td><input name="" type="checkbox" value="1"></td>
                <td>${p.title}</td>
                <td>${p.status}</td>
				<td>${p.articleType}</td>
                <td>${p.isTop}</td>
                <td><#if p.gmtCreate??>${p.gmtCreate?string('yyyy-MM-dd hh:mm:ss')}</#if></td>
                <td class="td-manage">
					<a title="编辑" href="javascript:;" onclick="admin_edit('用户编辑','../user/toadmin-edit.html','${p.id}','800','500')" class="ml-5" style="text-decoration:none"><i class="Hui-iconfont">&#xe6df;</i></a>
				<#--	<a title="删除" href="javascript:;" onclick="admin_del(this,'1')" class="ml-5" style="text-decoration:none"><i class="Hui-iconfont">&#xe6e2;</i></a>-->
				</td>
            </tr>
            </#list>
        </#if>
		</tbody>
	</table>
</div>
<#include "../../commons/_footer.ftl">

<!--请在下方写此页面业务相关的脚本-->
<script type="text/javascript" src="../../static/lib/My97DatePicker/4.8/WdatePicker.js"></script>
<script type="text/javascript" src="../../static/lib/datatables/1.10.0/jquery.dataTables.min.js"></script>
<script type="text/javascript" src="../../static/lib/laypage/1.2/laypage.js"></script>
<script type="text/javascript">
    $('.table').dataTable({
    });

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
function admin_edit(title,url,id,w,h){
	layer_show(title,url,id,w,h);
}



/*管理员-停用*/
function admin_stop(obj,id){
	layer.confirm('确认要停用吗？',function(index){
		//此处请求后台程序，下方是成功后的前台处理……
        $.post("../user/updateUserStatus",
                {
                    id:id,
                    flag:1
                },
                function(data){
					var stringify = JSON.stringify(data);
					if(data.code=='200') {
                        $(obj).parents("tr").find(".td-status").html('<span class="label label-default radius">已禁用</span>');

                        // $(obj).remove();
                        layer.msg('已停用!', {icon: 5, time: 1000});
                        // location.reload();
                    }else if(data.code='403'){
                        layer.msg(data.msg, {icon: 5, time: 1000});
					} else {
                        layer.msg('更新状态失败!',{icon: 5,time:1000});
					}
                });

	});
}


</script>
</body>
</html>