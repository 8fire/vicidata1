<!DOCTYPE HTML>
<html>
<head>
<#include "../commons/_jscommon.ftl">
<title>500页面</title>
</head>
<body>
<section class="container-fluid page-404 minWP text-c">
	<p class="error-title"><i class="Hui-iconfont va-m" style="font-size:80px">&#xe688;</i>
		<span class="va-m">500</span>
	</p>
	<p class="error-description">不好意思，服务器出错了</p>
<p class="error-info">具体错误为：

    <span class="ml-20">${exception}</span>

</p>
	<#--<p class="error-info">您可以：
		<a href="javascript:;" onclick="history.go(-1)" class="c-primary">&lt; 返回上一页</a>
		<span class="ml-20">|</span>
		<a href="/" class="c-primary ml-20">去首页 &gt;</a>
	</p>-->
</section>
</body>
</html>