<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>闲言轻博客</title>
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet" href="/static/res/layui/css/layui.css">
	<link rel="stylesheet" href="/static/res/static/css/mian.css">
</head>
<body class="lay-blog">
 	<#include "../commons/blog/_header.ftl">
		<div class="container-wrap">
			<div class="container">
					<div class="contar-wrap">
						<!--公告-->
						<h4 class="item-title">
							<p><i class="layui-icon layui-icon-speaker"></i>公告：<span>欢迎来到我的轻博客</span></p>
						</h4>
						<#if map.articleList?exists>
							<#list map.articleList as p>
						<div class="item">
                            <div class="item-box  layer-photos-demo1 layer-photos-demo">
                                <h3><a href="/blog/details.ftl">${p.title}</a></h3>
                                <h5>发布于：<span><#if p.gmtCreate??>${p.gmtCreate?string('yyyy-MM-dd hh:mm:ss')}</#if></span></h5>
                                 ${p.context}

                            </div>
                            <div class="comment count">
                                <a href="/blog/details.ftl#comment">评论</a>
                                <a href="javascript:;" class="like">点赞</a>
                            </div>
                        </div>
							</#list>
						</#if>
					</div>

					<div class="item-btn">
						<button class="layui-btn layui-btn-normal">下一页</button>
					</div>
			</div>
		</div>
	<#include "../commons/blog/_footer.ftl">
	<script src="/static/res/layui/layui.js"></script>
	<script>
		layui.config({
		  base: '/static/res/static/js/' 
		}).use('blog');	
	</script>
</body>
</html>