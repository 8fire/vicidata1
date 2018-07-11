<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>留言-闲言轻博客</title>
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet" href="/static/res/layui/css/layui.css">
	<link rel="stylesheet" href="/static/res/static/css/mian.css">
</head>
<body class="lay-blog">
		    <#include "../commons/blog/_header.ftl">
		<div class="container-wrap">
			<div class="container container-message">
				<div class="contar-wrap" id="contar-wrap">
					<form class="layui-form" action="">
						<div class="layui-form-item layui-form-text">
							  <textarea  class="layui-textarea" id="LAY-msg-content" style="resize:none"></textarea>
						</div>
					</form>
					<div class="item-btn">
						<button class="layui-btn layui-btn-normal" id="item-btn">提交</button>
					</div>
					
					<div id="LAY-msg-box">
						<div class="info-box">
							<div class="info-item">
								<img class="info-img" src="/static/res/static/images/info-img.png" alt="">
								<div class="info-text">
									<p class="title count">
										<span class="name">一片空白</span>
										<span class="info-img like"><i class="layui-icon layui-icon-praise"></i>5.8万</span>
									</p>
									<p class="info-intr">父爱如山，不善表达。回想十多年前，总记得父亲有个宽厚的肩膀，小小的自己跨坐在上面，越过人山人海去看更广阔的天空，那个时候期望自己有一双翅膀，能够像鸟儿一样飞得高，看得远。虽然父亲有时会和自己开玩笑，但在做错事的时候会受到严厉的训斥。父亲有双粗糙的大手掌。</p>
								</div>
							</div>
						</div>
					</div>

					<div id="test1" class="paging"></div>
				</div>
			</div>
		</div>
		<#include "../commons/blog/_footer.ftl">
	</div>
	<script src="/static/res/layui/layui.js">

	</script>
	<script>		
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
