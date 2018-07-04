<!DOCTYPE HTML>
<html>
<head>
<#include "../commons/_jscommon.ftl">
<title>管理员列表</title>
</head>
<body>
<nav class="breadcrumb"><i class="Hui-iconfont">&#xe67f;</i> 首页 <span class="c-gray en">&gt;</span> 系统管理 <span class="c-gray en">&gt;</span> 定时任务列表 <a class="btn btn-success radius r" style="line-height:1.6em;margin-top:3px" href="javascript:location.replace(location.href);" title="刷新" ><i class="Hui-iconfont">&#xe68f;</i></a></nav>
<div class="page-container">
	<form action="../job/queryByWhereJob.html" method="post">
	<div class="text-c"> 创建时间：
		<input type="text" onfocus="WdatePicker({ maxDate:'#F{$dp.$D(\'datemax\')||\'%y-%M-%d\'}' })" id="datemin" name="datemin" class="input-text Wdate" style="width:120px;">
		-
		<input type="text" onfocus="WdatePicker({ minDate:'#F{$dp.$D(\'datemin\')}',maxDate:'%y-%M-%d' })" id="datemax" name="datemax" class="input-text Wdate" style="width:120px;">

		<button type="submit" class="btn btn-success" id="" name=""><i class="Hui-iconfont">&#xe665;</i>查询</button>
	</div>
    </form>
	<div class="cl pd-5 bg-1 bk-gray mt-20">
        <span class="l">
            <a href="javascript:;" onclick="job_add('添加定时任务','../job/toAddJob.html')" class="btn btn-primary radius">
                <i class="Hui-iconfont">&#xe600;</i> 添加定时任务</a>
        </span>
    </div>
	<table class="table table-border table-bordered table-bg table-sort">
		<thead>
			<tr>
				<th scope="col" colspan="9">定时任务列表</th>
			</tr>
			<tr class="text-c">
				<th width="150">任务名称</th>
				<th width="150">任务所在组</th>
				<th width="150">任务类名</th>
                <th width="150">表达式</th>
                <th width="150">任务描述</th>
				<th width="150">任务状态</th>
				<th width="130">创建时间</th>
				<th width="100">操作</th>
			</tr>
		</thead>
		<tbody>

		<#if list?exists>
            <#list list as p>
            <tr class="text-c">
                <td>${p.jobName}</td>
                <td><#if p.jobGroup??>${p.jobGroup}</#if></td>
                <td><#if p.quartzClass??>${p.quartzClass}</#if></td>
                <td><#if p.cronExpression??>${p.cronExpression}</#if></td>
                <td><#if p.description??>${p.description}</#if></td>
                <td class="td-status"><span class="label label-success radius"><#if p.jobStatus==1>启用 <#else>暂停</#if></span></td>
                <td><#if p.gmt_create??>${p.gmt_create?string('yyyy-MM-dd hh:mm:ss')}</#if></td>
                <td class="td-manage">
					<a style="text-decoration:none" onClick="jop_stop(this,'${p.id}','${p.quartzClass}',${p.jobGroup})" href="javascript:;" title="暂停"><i class="Hui-iconfont">&#xe6e5;</i></a>
                    <a style="text-decoration:none" onClick="job_start(this,'${p.id}','${p.quartzClass}',${p.jobGroup})" href="javascript:;" title="启用"><i class="Hui-iconfont">&#xe615;</i></a>
					<a title="编辑" href="javascript:;" onclick="job_edit('任务编辑','../job/tojob-edit.html?id=${p.id}','600','800')" class="ml-5" style="text-decoration:none"><i class="Hui-iconfont">&#xe6df;</i></a>
					<a title="删除" href="javascript:;" onclick="job_del(this,'${p.id}','${p.quartzClass}',${p.jobGroup})" class="ml-5" style="text-decoration:none"><i class="Hui-iconfont">&#xe6e2;</i></a>
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
function job_add(title,url,w,h){
	layer_show(title,url,w,h);
}
/*管理员-删除*/
function job_del(obj,id,name,group){
	layer.confirm('确认要删除吗？',function(index){
		$.ajax({
			type: 'POST',
			url: '../job/deletejob',
			dataType: 'json',
			data:{
			    id:id,
                jobClassName:name,
                jobGroupName:group
			},
			success: function(data){

			    if(data=="0"){
                    $(obj).parents("tr").remove();
                    layer.msg('已删除!',{icon:1,time:1000});
				}else {
                    layer.msg('删除失败!',{icon:1,time:1000});
				}

			},
			error:function(data) {
				console.log(data.msg);
			},
		});		
	});
}

/!*管理员-编辑*!/
function job_edit(title,url,w,h){
	layer_show(title,url,w,h);
}



/*管理员-停用*/
function jop_stop(obj,id,name,group){
	layer.confirm('确认要暂停吗？',function(index){
		//此处请求后台程序，下方是成功后的前台处理……
        $.post("../job/pauseJob",
                {
                    id:id,
                    jobClassName:name,
                    jobGroupName:group
                },
                function(data){
					var stringify = JSON.stringify(data);
					//alert(stringify)
					if(data=='0'){
                        $(obj).parents("tr").find(".td-status").html('<span class="label label-default radius">已暂停</span>');
                        $(obj).remove();
                        layer.msg('已暂停!',{icon: 5,time:1000});
                      //  location.reload();
					}else {
                        layer.msg('更新状态失败!',{icon: 5,time:1000});
					}
                });

	});
}

/*管理员-启用*/
function job_start(obj,id,name,group){
	layer.confirm('确认要恢复吗？',function(index){
		//此处请求后台程序，下方是成功后的前台处理……
        $.post("../job/resumeJob",
                {
                    id:id,
                    jobClassName:name,
                    jobGroupName:group
                },
                function(data){
                    var stringify = JSON.stringify(data);
                 //   alert(stringify)
                    if(data=='0'){
                        $(obj).parents("tr").find(".td-status").html('<span class="label label-default radius">已启用</span>');
						$(obj).remove();
                        layer.msg('已启用!',{icon: 5,time:1000});
					//	location.reload();
                    }else {
                        layer.msg('更新状态失败!',{icon: 5,time:1000});
                    }
                });

	});
}
</script>
</body>
</html>