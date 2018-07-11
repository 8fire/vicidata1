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
	<div class="row cl">
		<label class="form-label col-xs-4 col-sm-2"><span class="c-red">*</span>文章标题：</label>
		<div class="formControls col-xs-8 col-sm-8">
			<input type="text" class="input-text"  placeholder="文章标题" id="title" name="title">
		</div>
	</div>
	<div class="row cl">
		<label class="form-label col-xs-4 col-sm-2"><span class="c-red">*</span>文章类型：</label>

        <div class="formControls col-xs-8 col-sm-3">
                <span class="select-box">
                  <select class="select" size="1" name="articleType">
				  <#if list?exists>
					  <#list list as m>
                          <option value="${m.id}">${m.typename}</option>
                      </#list>
                  </#if>
                  </select>
               </span>
        </div>

	</div>
		<div class="row cl">
            <label class="form-label col-xs-4 col-sm-2"><span class="c-red">*</span>关键词语：</label>
            <div class="formControls col-xs-8 col-sm-3">
                <input type="text" class="input-text"  placeholder="关键词语" id="description" name="description">
            </div>
        </div>
        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-2"><span class="c-red">*</span>文章来源：</label>
            <div class="formControls col-xs-8 col-sm-3">
                <input type="text" class="input-text"  placeholder="文章来源" id="articleSource" name="articleSource">
            </div>
        </div>
	<div class="row cl">
		<label class="form-label col-xs-4 col-sm-2"><span class="c-red">*</span>是否置顶：</label>
		<div class="formControls col-xs-8 col-sm-4 skin-minimal">
			<div class="radio-box">
				<input name="isTop" type="radio" id="sex-1" >
				<label for="sex-1">是</label>
			</div>
			<div class="radio-box">
				<input type="radio" id="sex-2" name="isTop" checked>
				<label for="sex-2">否</label>
			</div>
		</div>
	</div>
	<div class="row cl">
		<label class="form-label col-xs-4 col-sm-2">文章内容：</label>
		<div class="formControls col-xs-8 col-sm-10">
            <textarea class="layui-textarea" name="context" id="context" style="display: none">
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



<#--
<div class="site-demo-button" style="margin-top: 20px;">
    <button class="layui-btn site-demo-layedit" data-type="content">获取编辑器内容</button>
    <button class="layui-btn site-demo-layedit" data-type="text">获取编辑器纯文本内容</button>
</div>
-->


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
        var index = layedit.build('context');
        var content = layedit.getContent(index);
        $("#form-article-add").validate({
            rules:{
                title:{
                    required:true,
                    minlength:1,
                    maxlength:50
                },
                articleType:{
                    required:true,
                },
                description:{
                  required:true,
                    minlength:1,
                    maxlength:50
		        },
               articleSource:{
                required:true,
                   minlength:1,
                   maxlength:50
                },
                context:{
                    required:true,
                },
            },
            onkeyup:false,
            focusCleanup:true,
            success:"valid",
            submitHandler:function(form){
                $(form).ajaxSubmit({
                    type: 'post',
                    url: "../backblog/addArticle" ,
                    success: function(data){
                        if(data.code=='200'){
                            window.parent.location.reload();
                            layer.msg('添加成功!',{icon:1,time:1000});
                            var index = parent.layer.getFrameIndex(window.name);
                            parent.layer.close(index);
						}else {
                            layer.msg('发布文章失败，请重新发布!',{icon:0,time:1000});
						}

                    },
                    error: function(XmlHttpRequest, textStatus, errorThrown){
                        layer.msg('error!',{icon:1,time:1000});
                    }
                });

            }
        });
      /*  //编辑器外部操作
        var active = {
            content: function(){
                alert(layedit.getContent(index)); //获取编辑器内容
            }
            ,text: function(){
                alert(layedit.getText(index)); //获取编辑器纯文本内容
            }

        };

        $('.site-demo-layedit').on('click', function(){
            var type = $(this).data('type');
            active[type] ? active[type].call(this) : '';
        });*/
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