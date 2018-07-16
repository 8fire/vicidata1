<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>评论-闲言轻博客</title>
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet" href="/static/res/layui/css/layui.css">
	<link rel="stylesheet" href="/static/res/static/css/mian.css">
    <script type="text/javascript" src="/static/lib/jquery/1.9.1/jquery.min.js"></script>
</head>
<body class="lay-blog">
	    <#include "../commons/blog/_header.ftl">
		<div class="container-wrap">
			<div class="container container-message container-details container-comment">
				<#if article?exists>

					<div class="contar-wrap">
						<div class="item">

							<div class="item-box  layer-photos-demo1 layer-photos-demo">
								<h3>${article.title}</h3>
								<h5>发布于：<span><#if article.gmtCreate??>${article.gmtCreate?string('yyyy-MM-dd hh:mm:ss')}</#if></span></h5>
								<p>${article.context}</p>
								<div class="count layui-clear">
									<span class="pull-left">阅读 <em>100000+</em></span>
									<span class="pull-right like"><i class="layui-icon layui-icon-praise"></i><em>999</em></span>
								</div>
							</div>

						</div>
						<form class="layui-form" action="">
							<div class="layui-form-item layui-form-text">
								<textarea  class="layui-textarea" id="content" aria-required="true" name="content" style="resize:none" placeholder="说点什么...最少输入10个字符,最多50个字符"></textarea>
							</div>
							<div class="btnbox">
									<#--<a href="/blog/details.ftl?id=${article.id}" id="sure">
							  		确定
							  	</a>-->
                                <a href="javascript:void(0);" id="subOk" class="pull-right">确定</a>
							</div>
						</form>
					</div>
				</#if>
			</div>
		</div>
		<#include "../commons/blog/_footer.ftl">
	<script src="/static/res/layui/layui.js">
		<#include "../commons/_footer.ftl">
	</script>
	<script>
        var articleid='${article.id}';
        $(function(){
            $("#content").Huitextarealength({
                minlength:10,
                maxlength:50,
                exceed:false
            });
            $("#subOk").click(function () {
                var contents=$("#content").val();
                if(contents==null||contents==undefined||contents==""){
                    layer.msg('您还没有填写评论内容呢!',{icon:6,time:1000});
				}else {
                    $.ajax({
                        type: "POST",
                        url: "/blog/addComment.html",
                        data: {"content":contents,"articleid":articleid},
                        dataType: "json",
                        success: function(data){
                            layer.load();
                            if(data.code=="200"){
								setTimeout(function(){
                                    layer.closeAll('loading');
                                    layer.msg('评论成功!',{icon:1,time:1000});
                                    location.href='/blog/details.ftl?id=${article.id}';
                                }, 2000);
                            }else {
                                layer.msg('对不起服务器异常!',{icon:0,time:1000});
							}
                        },
                        error:function (XMLHttpRequest, textStatus, errorThrown) {
                            layer.msg("对不起服务器异常了！")
                        }
                    });
				}
            });
        });
		layui.config({
		  base: '/static/res/static/js/' 
		}).use('blog');
	</script>
	<script id="LAY-msg-tpl" type="text/html">
		<div class="info-box">
			<div class="info-item">
				<img class="info-img" src="{{ d.avatar }}" alt="">
			  <div class="info-text">
					<p class="title">
					  <span class="name">{{ d.username }}</span>
					  <span class="info-img">
					  	<i class="layui-icon layui-icon-praise"></i>
					  	{{ d.praise }}
					 	</span>
					</p>
					<p class="info-intr">
						{{ d.content }}
					</p>
			  </div>
			</div>
		</div>
	</script>
</body>
</html>