<!DOCTYPE HTML>
<html>
<head>
<#include "../commons/_jscommon.ftl">
<title>修改权限</title>
<meta name="keywords" content="">
<meta name="description" content="">
</head>
<body>
<article class="page-container">

<#if authorizations?exists>
	<form class="form form-horizontal" id="form-job-edit" name="form-job-edit">
     <input type="hidden" value="${authorizations.id}" name="id">
	<div class="row cl">
		<label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>权限名称：</label>
		<div class="formControls col-xs-8 col-sm-9">
			<input type="text" class="input-text" value="<#if authorizations.authorizationName??>${authorizations.authorizationName}</#if>" placeholder="" id="authorizationName" name="authorizationName">
		</div>
	</div>
		<div class="row cl">
            <label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>权限描述：</label>
            <div class="formControls col-xs-8 col-sm-9">
                <input type="text" class="input-text" value="<#if authorizations.description??>${authorizations.description}</#if>" placeholder="" id="description" name="description">
            </div>
        </div>
	<div class="row cl">
		<label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>是否禁用：</label>

        <div class="switch formControls col-xs-3 col-sm-3" data-on-label="是" data-off-label="否">
            <input  name="status" type="checkbox" checked />
        </div>
	</div>
	<div class="row cl">
		<div class="col-xs-8 col-sm-9 col-xs-offset-4 col-sm-offset-3">
			<input class="btn btn-primary radius" type="submit" value="&nbsp;&nbsp;提交&nbsp;&nbsp;">
		</div>
	</div>
	</form>

</#if>
</article>

<#include "../commons/_footer.ftl">

<!--请在下方写此页面业务相关的脚本-->
<script type="text/javascript" src="../../static/lib/jquery.validation/1.14.0/jquery.validate.js"></script>
<script type="text/javascript" src="../../static/lib/jquery.validation/1.14.0/validate-methods.js"></script>
<script type="text/javascript" src="../../static/lib/jquery.validation/1.14.0/messages_zh.js"></script>
<script type="text/javascript">
$(function(){
	$('.skin-minimal input').iCheck({
		checkboxClass: 'icheckbox-blue',
		radioClass: 'iradio-blue',
		increaseArea: '20%'
	});
	
	$("#form-job-edit").validate({
		rules:{
            authorizationName:{
                required:true,
                minlength:4,
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
				url: "../user/authorizationEdit.html",
				success: function(data){
				    alert(data);
				    if(data.code==200){
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

		}
	});
});
</script> 
<!--/请在上方写此页面业务相关的脚本-->
</body>
</html>