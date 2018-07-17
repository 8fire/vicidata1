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

<#if list?exists>
	<#list list as p>
	<form class="form form-horizontal" id="form-job-edit" name="form-job-edit">
     <input type="hidden" value="${p.id}" name="id">
	<div class="row cl">
		<label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>任务名称：</label>
		<div class="formControls col-xs-8 col-sm-9">
			<input type="text" class="input-text" value="${p.jobName}" placeholder="任务名称" id="jobname" name="jobname">
		</div>
	</div>
		<div class="row cl">
            <label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>任务处理类：</label>
            <div class="formControls col-xs-8 col-sm-9">
                <input type="text" class="input-text" value="${p.quartzClass}" placeholder="例如：com.csjscm.mysqldata.quartzjob.TestJob" id="jobClassName" name="jobClassName">
            </div>
        </div>
	<div class="row cl">
		<label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>任务分组：</label>
		<div class="formControls col-xs-8 col-sm-9">
			<input type="text" class="input-text"  value="${p.jobGroup}" placeholder="任务分组" id="jobGroupName" name="jobGroupName">
		</div>
	</div>
	<div class="row cl">
		<label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>任务表达式：</label>
		<div class="formControls col-xs-8 col-sm-9">
			<input type="text" class="input-text" value="${p.cronExpression}" placeholder="任务表达式" id="cronExpression" name="cronExpression">
		</div>
	</div>
        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>任务描述：</label>
            <div class="formControls col-xs-8 col-sm-9">
                <input type="text" class="input-text" value="${p.description}" placeholder="任务描述" id="description" name="description">
            </div>
        </div>
	<div class="row cl">
		<div class="col-xs-8 col-sm-9 col-xs-offset-4 col-sm-offset-3">
			<input class="btn btn-primary radius" type="submit" value="&nbsp;&nbsp;提交&nbsp;&nbsp;">
            <button onClick="layer_close();" class="btn btn-default radius" type="button">&nbsp;&nbsp;取消&nbsp;&nbsp;</button>
		</div>
	</div>
	</form>
	</#list>
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
            jobname:{
                required:true,
                minlength:4,
                maxlength:50
	         },
            jobClassName:{
				required:true,
				minlength:4,
				maxlength:50
			},
            jobGroupName:{
				required:true,
                number:true
			},
            cronExpression:{
				required:true,
			}
		},
		onkeyup:false,
		focusCleanup:true,
		success:"valid",
		submitHandler:function(form){
			$(form).ajaxSubmit({
				type: 'post',
				url: "../job/reschedulejob.html",
				success: function(data){
                    layer.load();
                    if(data.code=='200'){
                        setTimeout(function(){
                            layer.closeAll('loading');
                            window.parent.location.reload();
                            layer.msg('添加成功!',{icon:1,time:1000});
                            layer_close();
                        }, 2000);
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