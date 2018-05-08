<!DOCTYPE HTML>
<html>
<head>
<#include "../commons/_jscommon.ftl">
<title>权限管理</title>
</head>
<body>
<nav class="breadcrumb"><i class="Hui-iconfont">&#xe67f;</i> 首页 <span class="c-gray en">&gt;</span> 管理员管理 <span class="c-gray en">&gt;</span> 权限管理 <a class="btn btn-success radius r" style="line-height:1.6em;margin-top:3px" href="javascript:location.replace(location.href);" title="刷新" ><i class="Hui-iconfont">&#xe68f;</i></a></nav>
<div class="page-container">
	<div class="text-c">
		<form class="Huiform" method="post" action="" target="_self">
			<input type="text" class="input-text" style="width:250px" placeholder="权限名称" id="" name="">
			<button type="submit" class="btn btn-success" id="" name=""><i class="Hui-iconfont">&#xe665;</i> 搜权限节点</button>
		</form>
	</div>
	<div class="cl pd-5 bg-1 bk-gray mt-20">
		<span class="l">
			<a href="javascript:;" onclick="datadel()" class="btn btn-danger radius">
			<i class="Hui-iconfont">&#xe6e2;</i> 批量删除</a>
			<a href="javascript:;" onclick="admin_permission_add('添加权限节点','admin-permission-add.html','','310')" class="btn btn-primary radius">
				<i class="Hui-iconfont">&#xe600;</i> 添加权限节点</a>
			<#--<a href="javascript:;" onclick="admin_permission_add('用户分配角色','toAdminRoleAdd.html','500','850')" class="btn btn-primary radius">
				<i class="Hui-iconfont">&#xe600;</i> 用户分配角色</a>-->

		</span>
		<span class="r">共有数据：<strong>54</strong> 条</span>
	</div>

	<table id="myTable" class="table table-border table-bordered table-bg">
		<thead>
			<tr>
				<th scope="col" colspan="7">权限节点</th>
			</tr>
			<tr class="text-c">
				<th width="25"><input type="checkbox" name="" value=""></th>
                <th width="40">ID</th>
                <th width="150">登录手机号</th>

				<th width="400">角色类型</th>
				<th width="100">操作</th>
			</tr>
		</thead>
		<tbody  >
		   <#if mvMap.list?exists>
		       <#list mvMap.list as p>
               <tr class="text-c">
                   <td><input type="checkbox" value="${p.id}" name="r"></td>
                   <td>${p.id}</td>
                   <td>${p.login_phone}</td>
				   <td>
					 <#--  <#if mvMap.roleList?exists>
                        <#list mvMap.roleList as m>

							  <input type="radio" value="${m.id}" name="roleName" id="${m.id}">
                               <label for="${m.id}" >${m.roleName}</label>
					   </#list>
                    </#if>-->
				   </td>
                   <td>
                       <a title="分配角色" href="javascript:;" onclick="admin_permission_add('用户分配角色','../user/toAdminRoleAdd.html?id='+${p.id},'','800','500')" class="ml-5" style="text-decoration:none"><i class="Hui-iconfont">&#xe6df;</i></a>
					   <a title="删除" href="javascript:;" onclick="getTableContent()" class="ml-5" style="text-decoration:none"><i class="Hui-iconfont">&#xe6e2;</i></a>
                       <a title="删除" href="javascript:;" id="edit" class="ml-5" style="text-decoration:none"><i class="Hui-iconfont">&#xe6e2;</i></a>
				   </td>
               </tr>
		       </#list>
		   </#if>

		</tbody>
	</table>
</div>
<!--_footer 作为公共模版分离出去-->
<#include "../commons/_footer.ftl">

<!--请在下方写此页面业务相关的脚本-->
<script type="text/javascript" src="../../static/lib/datatables/1.10.0/jquery.dataTables.min.js"></script>
<script type="text/javascript">
/*
	参数解释：
	title	标题
	url		请求的url
	id		需要操作的数据id
	w		弹出层宽度（缺省调默认值）
	h		弹出层高度（缺省调默认值）
*/
/*管理员-权限-添加*/
function admin_permission_add(title,url,id,w,h){
    layer_show(title,url,id,w,h);
}
    $("#myTable tbody").on('click','a#edit',function () {
		var alter1= $('#myTable').DataTable().row($(this).parents("tr")).data();
        var stringify2 = JSON.stringify(alter1);
        for(var i = 0; i < alter1.length; i++){
			console.log(alter1[2])
        }

    });
 /*   function getTableContent(){
        var table=$("#myTable").dataTable();
        var stringify2 = JSON.stringify(table);
       // alert(stringify2)
        var nTrs = table.fnGetNodes();//fnGetNodes获取表格所有行，nTrs[i]表示第i行tr对象
		var stringify = JSON.stringify(nTrs);
	//	alert(stringify)
        for(var i = 0; i < nTrs.length; i++){

            if($(nTrs[i]).hasClass('selected')){
            var fnGetData = table.fnGetData(nTrs[i]);
            alert(fnGetData[3])
                //console.log('[获取数据]' + );//fnGetData获取一行的数据
            }
        }
    }*/



/*管理员-权限-删除*/
function admin_permission_del(obj,id){


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
</script>
</body>
</html>