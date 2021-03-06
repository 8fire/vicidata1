<div class="header">
    <div class="header-wrap">
        <h1 class="logo pull-left">
            <a href="/blog/index.ftl">
                <img src="/static/res/static/images/logo.png" alt="" class="logo-img">
                <img src="/static/res/static/images/logo-text.png" alt="" class="logo-text">
            </a>
        </h1>
        <form class="layui-form blog-seach pull-left" action="">
            <div class="layui-form-item blog-sewrap">
                <div class="layui-input-block blog-sebox">
                    <i class="layui-icon layui-icon-search"></i>
                    <input type="text" name="title" lay-verify="title" autocomplete="off"  class="layui-input">
                </div>
            </div>
        </form>
        <div class="blog-nav pull-right">
            <ul class="layui-nav pull-left">
                <li class="layui-nav-item layui-this"><a href="/blog/index.ftl">首页</a></li>
                <li class="layui-nav-item"><a href="/blog/message.ftl">留言</a></li>
                <li class="layui-nav-item"><a href="/blog/about.ftl">关于</a></li>
            </ul>
            <!--用户信息-->
            <a href="#" class="personal pull-left">
                <i class="layui-icon layui-icon-username">
                <#if Session.username?exists>
                    ${Session.username}
                </#if>
                </i>
            </a>
        </div>
        <div class="mobile-nav pull-right" id="mobile-nav">
            <a href="javascript:;">
                <i class="layui-icon layui-icon-more"></i>
            </a>
        </div>
    </div>
    <ul class="pop-nav" id="pop-nav">
        <li><a href="/blog/index.ftl">首页</a></li>
        <li><a href="/blog/message.ftl">留言</a></li>
        <li><a href="/blog/about.ftl">关于</a></li>
    </ul>
</div>