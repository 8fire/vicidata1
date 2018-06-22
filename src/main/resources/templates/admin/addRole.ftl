<!DOCTYPE HTML>
<html>
<head>
<#include "../commons/_jscommon.ftl">
<title>添加定时任务</title>
<meta name="keywords" content="">
<meta name="description" content="">
</head>
<body>
<article class="page-container">
	<form class="form form-horizontal" id="form-admin-add">
	<div class="row cl">
		<label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>角色名称：</label>
		<div class="formControls col-xs-8 col-sm-9">
			<input type="text" class="input-text" value="" placeholder="角色名称" id="roleName" name="roleName">
		</div>
	</div>
		<div class="row cl">
            <label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>角色描述：</label>
            <div class="formControls col-xs-8 col-sm-9">
                <input type="text" class="input-text" value="" placeholder="角色描述" id="description" name="description">
            </div>
        </div>

	<div class="row cl">
		<div class="col-xs-8 col-sm-9 col-xs-offset-4 col-sm-offset-3">
			<input class="btn btn-primary radius" type="submit" value="&nbsp;&nbsp;提交&nbsp;&nbsp;">
		</div>
	</div>
	</form>
</article>

<#include "../commons/_footer.ftl">

<!--请在下方写此页面业务相关的脚本-->
<script type="text/javascript" src="../../static/lib/jquery.validation/1.14.0/jquery.validate.js"></script>
<script type="text/javascript" src="../../static/lib/jquery.validation/1.14.0/validate-methods.js"></script>
<script type="text/javascript" src="../../static/lib/jquery.validation/1.14.0/messages_zh.js"></script>
<script type="text/javascript">
$(function(){
	$("#form-admin-add").validate({
		rules:{
            roleName:{
                required:true,
                minlength:3,
                maxlength:50
	         },
            description:{
				required:true,
				minlength:4,
				maxlength:50
			}
		},
		onkeyup:false,
		focusCleanup:true,
		success:"valid",
		submitHandler:function(form){
			$(form).ajaxSubmit({
				type: 'post',
				url: "../user/addRole.html" ,
				success: function(data){
				    if(data.code=='200'){
                        layer.msg('添加成功!',{icon:1,time:1000});
                        var index = parent.layer.getFrameIndex(window.name);
                        parent.layer.close(index);
                        window.parent.location.reload();
					}else {
                        layer.msg('添加失败!',{icon:0,time:1000});
					}
				},
                error: function(XmlHttpRequest, textStatus, errorThrown){
					layer.msg('error!',{icon:1,time:1000});
				}
			});
		}
	});
});
</script> 
<!--/请在上方写此页面业务相关的脚本-->
</body>
</html>