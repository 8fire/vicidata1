<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>评论-闲言轻博客</title>
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet" href="/static/res/layui/css/layui.css">
	<link rel="stylesheet" href="/static/res/static/css/mian.css">
    <link rel="stylesheet" type="text/css" href="/static/h-ui/css/H-ui.min.css" />
    <link rel="stylesheet" type="text/css" href="/static/h-ui.admin/css/H-ui.admin.css" />
    <link rel="stylesheet" type="text/css" href="/static/lib/Hui-iconfont/1.0.8/iconfont.css" />
    <link rel="stylesheet" type="text/css" href="/static/h-ui.admin/skin/default/skin.css" id="skin" />
    <link rel="stylesheet" type="text/css" href="/static/h-ui.admin/css/style.css" />
    <script type="text/javascript" src="/static/lib/jquery/1.9.1/jquery.min.js"></script>
</head>
<body class="lay-blog">
 <#include "../commons/blog/_header.ftl">
		<div class="container-wrap">
			<div class="container container-message container-details">
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

						<a name="comment"> </a>
						<div class="comt layui-clear">
							<#--<a href="javascript:;" class="pull-left">评论</a>-->
							<a href="javascript:void(0);" id="comment" class="pull-right">写评论</a>
						</div>
							</#if>
						<div id="LAY-msg-box">
							<#if comments?exists>
								<#list comments as p>
								<ul class="commentList">
                                    <li class="item cl"> <a href="#">
										<i class="avatar size-L radius"><img alt="" src="/static/h-ui/images/ucnter/avatar-default.jpg"></i></a>
                                        <div class="comment-main">
                                            <header class="comment-header">
                                                <div class="comment-meta">
                                                    <i class="layui-icon" style="font-size: 10px; color: red;">&#xe66f;</i>
													<a class="comment-author" href="#"><#if p.createuser??>${p.createuser}</#if></a> 评论于
                                                    <time title="2014年8月31日 下午3:20" datetime="2014-08-31T03:54:20">
														<#if p.createtime??>${p.createtime?string('yyyy-MM-dd hh:mm:ss')}</#if>
													</time>
                                                    <span style="float: right" class="info-img like"><i class="layui-icon layui-icon-praise"></i>5.8万</span>
                                                </div>
                                            </header>
                                            <div class="comment-body">
                                                <p><a href="#"></a> ${p.comment}</p>
                                            </div>
                                        </div>
                                    </li>
                                </ul>
									</#list>
								</#if>

						</div>
					</div>
			</div>
		</div>
	<script src="/static/res/layui/layui.js"></script>
	<script type="text/javascript">
		var username="";
		<#if Session.username?exists>
				username=${Session.username}
		</#if>
				$(function(){
                    $("#comment").click(function () {
                        if(username==null||username==undefined||username==""){
                            //询问框
                            var index=layer.confirm('您还没有登录呢？暂时不能评论，请先登录！', {
                                btn: ['去登陆','残忍拒绝'] //按钮
                            }, function(){
                                //关闭上层窗口
                                layer.close(index);
                                layer.open({
                                    type: 2,
                                    title: '用户登录',
                                    maxmin: false,
                                    skin: 'layui-layer-lan',
                                    shadeClose: true, //点击遮罩关闭层
                                    area : ['600px' , '400px'],//宽高
                                    content:['/blog/toProsceniumLogin.ftl','no']
                                });

                            });
                        }else {
                            window.location.href='/blog/comment.ftl?id=${article.id}';
                        }
                    });
                });
		layui.config({
		  base: '/static/res/static/js/' 
		}).use('blog');

	</script>
</body>
</html>