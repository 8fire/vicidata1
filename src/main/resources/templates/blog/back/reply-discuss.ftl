<!DOCTYPE HTML>
<html>
<head>
<#include "../../commons/_jscommon.ftl">
<title>添加管理员 - 管理员管理 </title>
<meta name="keywords" content="">
<meta name="description" content="">
</head>
<body>
<article class="page-container">


	<form class="form form-horizontal" id="form-article-add">
        <input type="hidden" value="${discuss.id}" name="discussId">
	<div class="row cl">
		<label class="form-label col-xs-4 col-sm-2">所属文章：</label>
		<div class="formControls col-xs-8 col-sm-8">
			<input type="text" class="input-text"   id="articleid" name="articleid" readonly="readonly" value="${discuss.articleid}">
		</div>
	</div>

		<div class="row cl">
            <label class="form-label col-xs-4 col-sm-2">留言人：</label>
            <div class="formControls col-xs-8 col-sm-3">
                <input type="text" class="input-text"   id="createuser" name="createuser" readonly=readonly  value="${discuss.createuser}">
            </div>
        </div>

        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-2">留言内容：</label>
            <div class="formControls col-xs-8 col-sm-10">
                <label >${discuss.comment}</label>
            </div>
        </div>

	<div class="row cl">
		<label class="form-label col-xs-4 col-sm-2">留言回复：</label>
		<div class="formControls col-xs-8 col-sm-10">
            <textarea class="layui-textarea" name="replyComment" id="replyComment" style="display: none">
            </textarea>
		</div>

	</div>
	<div class="row cl">
		<div class="col-xs-8 col-sm-9 col-xs-offset-4 col-sm-offset-3">
			<input class="btn btn-primary radius" type="submit" value="&nbsp;&nbsp;提交&nbsp;&nbsp;">
		</div>
	</div>
	</form>
</article>

<script type="text/javascript" src="/static/lib/layui/layui.js"></script>

<script>
    layui.use('layedit', function(){
        var layedit = layui.layedit
                ,$ = layui.jquery;
        layedit.set({
            uploadImage: {
                url: '../file/img/upload' //接口url
                ,type: 'POST' //默认post
            }
        });
        //构建一个默认的编辑器
        var index = layedit.build('replyComment');
        var content = layedit.getContent(index);
        $("#form-article-add").validate({
            rules:{
                replyComment:{
                    required:true,
                    minlength:1,
                    maxlength:500
                },
            },
            onkeyup:false,
            focusCleanup:true,
            success:"valid",
            submitHandler:function(form){
                $(form).ajaxSubmit({
                    type: 'post',
                    url: "../backblog/addReply" ,
                    success: function(data){
                        layer.load();
                        if(data.code=='200'){
                            setTimeout(function(){
                                layer.closeAll('loading');
                                window.parent.location.reload();
                                layer.msg('添加成功!',{icon:1,time:1000});
                                var index = parent.layer.getFrameIndex(window.name);
                                parent.layer.close(index);
                            }, 2000);
						}else {
                            layer.msg('回复失败，请重新回复!',{icon:0,time:1000});
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

<#include "../../commons/_footer.ftl">

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
});
</script> 
<!--/请在上方写此页面业务相关的脚本-->
</body>
</html>