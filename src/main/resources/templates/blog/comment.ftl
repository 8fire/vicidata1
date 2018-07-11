<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>评论-闲言轻博客</title>
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet" href="/static/res/layui/css/layui.css">
	<link rel="stylesheet" href="/static/res/static/css/mian.css">
</head>
<body class="lay-blog">
	    <#include "../commons/blog/_header.ftl">
		<div class="container-wrap">
			<div class="container container-message container-details container-comment">
					<div class="contar-wrap">
						<div class="item">
							<div class="item-box  layer-photos-demo1 layer-photos-demo">
								<h3>拥有诗意的心态,才能拥有诗意的生活</h3>
								<h5>发布于：<span>刚刚</span></h5>
								<p>父爱如山，不善表达。回想十多年前，总记得父亲有个宽厚的肩膀，小小的自己跨坐在上面，越过人山人海去看更广阔的天空，那个时候期望自己有一双翅膀，能够像鸟儿一样飞得高，看得远。虽然父亲有时会和自己开玩笑，但在做错事的时候会受到严厉的训斥。父亲有双粗糙的大手掌，手把手教我走路、骑车，却会在该放手的时刻果断地放开让自己去大胆尝试，那个时候期望快快长大，能够做自己想做的事，不用受父亲的“控制”。父亲是智慧树，他无所不知、无所不晓，虽然你有十万个为什么，但是也难不倒他。</p>
								<img src="/static/res/static/images/item.png" 
								 alt="帅哥">
								<div class="count layui-clear">
									<span class="pull-left">阅读 <em>100000+</em></span>
									<span class="pull-right like"><i class="layui-icon layui-icon-praise"></i><em>999</em></span>
								</div>
							</div>
						</div>

						<form class="layui-form" action="">
							<div class="layui-form-item layui-form-text">
								<textarea  class="layui-textarea"  style="resize:none" placeholder="写点什么啊"></textarea>
							</div>
							<div class="btnbox">
									<a href="details.ftl" id="sure">
							  		确定
							  	</a>
							</div>
						</form>
					</div>
			</div>
		</div>
		<#include "../commons/blog/_footer.ftl">
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
</html>