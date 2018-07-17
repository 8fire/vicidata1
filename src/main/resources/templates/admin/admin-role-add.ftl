<!--_meta.ftl 作为公共模版分离出去-->
<!DOCTYPE HTML>
<html>
<head>
<#include "../commons/_jscommon.ftl">

<title></title>
<meta name="keywords" content="">
<meta name="description" content="">
</head>
<body>
<article class="page-container">
	<form action="" method="post" class="form form-horizontal" id="form-admin-role-add">
        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>用户名称：</label>
            <div class="formControls col-xs-8 col-sm-9">
					  <#if mvMap.list?exists>
					      <#list mvMap.list as p>
                              <input type="text" class="input-text" value="${p.login_phone}" name="login_phone" readonly="readonly">
                              <input type="hidden" class="input-text" value="${p.id}"  name="uid">
                              <input type="hidden" class="input-text" value="${mvMap.id}"  name="id">
					      </#list>
					  </#if>
            </div>
        </div>
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>角色类型：</label>
			<div class="formControls col-xs-8 col-sm-9">
                <span class="select-box">
                  <select class="select" size="1" name="rid">
				  <#if mvMap.roleList?exists>
					  <#list mvMap.roleList as m>
                          <option value="${m.id}">${m.roleName}</option>
					  </#list>
				  </#if>
				  </select>
               </span>
			</div>
		</div>
		<div class="row cl">
			<div class="col-xs-8 col-sm-9 col-xs-offset-4 col-sm-offset-3">
				<button type="submit" class="btn btn-success radius" id="admin-role-save" name="admin-role-save"><i class="icon-ok"></i>确定</button>
                <button onClick="layer_close();" class="btn btn-default radius" type="button">&nbsp;&nbsp;取消&nbsp;&nbsp;</button>
			</div>
		</div>
	</form>
</article>

<!--_footer 作为公共模版分离出去-->
<#include "../commons/_footer.ftl">

<!--请在下方写此页面业务相关的脚本-->
<script type="text/javascript" src="../../static/lib/jquery.validation/1.14.0/jquery.validate.js"></script>
<script type="text/javascript" src="../../static/lib/jquery.validation/1.14.0/validate-methods.js"></script>
<script type="text/javascript" src="../../static/lib/jquery.validation/1.14.0/messages_zh.js"></script>
<script type="text/javascript">
$(function(){
	$(".permission-list dt input:checkbox").click(function(){
		$(this).closest("dl").find("dd input:checkbox").prop("checked",$(this).prop("checked"));
	});
	$(".permission-list2 dd input:checkbox").click(function(){
		var l =$(this).parent().parent().find("input:checked").length;
		var l2=$(this).parents(".permission-list").find(".permission-list2 dd").find("input:checked").length;
		if($(this).prop("checked")){
			$(this).closest("dl").find("dt input:checkbox").prop("checked",true);
			$(this).parents(".permission-list").find("dt").first().find("input:checkbox").prop("checked",true);
		}
		else{
			if(l==0){
				$(this).closest("dl").find("dt input:checkbox").prop("checked",false);
			}
			if(l2==0){
				$(this).parents(".permission-list").find("dt").first().find("input:checkbox").prop("checked",false);
			}
		}
	});
	
	$("#form-admin-role-add").validate({
		rules:{
			roleName:{
				required:true,
			},
		},
		onkeyup:false,
		focusCleanup:true,
		success:"valid",
		submitHandler:function(form){
			$(form).ajaxSubmit({
                type: 'post',
                url: "../user/saveAdminRole.html",
                success: function(data){
                /*    var stringify = JSON.stringify(data);
                    alert(stringify);*/
                    if(data.code=='200'){
                        layer.msg('修改成功!',{icon:1,time:1000});
                        window.parent.location.reload();
                    }else {
                        layer.msg('修改失败!',{icon:0,time:1000});
                    }

                },
                error: function(){
                    layer.msg('error!',{icon:1,time:1000});
                }
            });
	/*		var index = parent.layer.getFrameIndex(window.name);
			parent.layer.close(index);*/
		}
	});
});
</script>
<!--/请在上方写此页面业务相关的脚本-->
</body>
</html>