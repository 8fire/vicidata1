<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>闲言轻博客</title>
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet" href="/static/res/layui/css/layui.css">
	<link rel="stylesheet" href="/static/res/static/css/mian.css">
    <script type="text/javascript" src="/static/lib/jquery/1.9.1/jquery.min.js"></script>
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
						<#if list.list?exists>

                         <input type="hidden" name="total" value="${list.total}" id="total">
                         <input type="hidden"  value="${list.pageNum}" id="num">
                            <#list list.list as p>
						<div class="item">
                            <div class="item-box  layer-photos-demo1 layer-photos-demo">
                                <h3><a href="/blog/details.ftl">${p.title}</a></h3>
                                <h5>发布于：<span><#if p.gmtCreate??>${p.gmtCreate?string('yyyy-MM-dd hh:mm:ss')}</#if></span></h5>
                                 ${p.context}
                            </div>
                            <div class="comment count">
                                <a href="/blog/details.ftl?id=${p.id}">评论</a>
                                <a href="javascript:;" class="like">点赞</a>
                            </div>
                        </div>
							</#list>
						</#if>
					</div>

					<div class="item-btn">
                        <#--<button class="layui-btn layui-btn-normal">上一页</button>
						<button class="layui-btn layui-btn-normal">下一页</button>-->
                        <div id="pageDiv"></div>
					</div>

			</div>
		</div>
	<#include "../commons/blog/_footer.ftl">
	<script src="/static/res/layui/layui.js"></script>
	<script>
		layui.config({
		  base: '/static/res/static/js/' 
		}).use('blog');
		var totalNum= document.getElementById('total').value;
        var currpage=document.getElementById("num").value;

      layui.use(['laypage', 'layer'], function(){
            //每页显示多少条
            var pageSize=2;
            var laypage = layui.laypage
                    ,layer = layui.layer;
            laypage.render({
                 elem: 'pageDiv',
                 count: totalNum,
                 limit:pageSize,
				 theme:'#FFC0CB',
                 layout: ['prev', 'next'],
                        curr:currpage, //当前页
                jump: function(e, first){ //触发分页后的回调
                    if(!first){ //一定要加此判断，否则初始时会无限刷新
                        location.href = '?pageIndex='+e.curr+'&pageSize='+pageSize;
                    }
                }
            });

        });

	</script>
</body>
</html>