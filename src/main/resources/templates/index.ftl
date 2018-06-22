<!DOCTYPE HTML>
<html>
<head>
<#include "commons/_jscommon.ftl">
    <title>后台系统</title>
    <meta name="keywords" content="">
    <meta name="description" content="">
</head>
<body>
<#include "commons/_header.ftl">
<#include "commons/_menu.ftl">
<section class="Hui-article-box">
    <div id="Hui-tabNav" class="Hui-tabNav hidden-xs">
        <div class="Hui-tabNav-wp">
            <ul id="min_title_list" class="acrossTab cl">
                <li class="active">
                    <span title="我的桌面" data-href="user/welcome.html">我的桌面</span>
                    <em></em></li>
            </ul>
        </div>
        <div class="Hui-tabNav-more btn-group"><a id="js-tabNav-prev" class="btn radius btn-default size-S" href="javascript:;"><i class="Hui-iconfont">&#xe6d4;</i></a><a id="js-tabNav-next" class="btn radius btn-default size-S" href="javascript:;"><i class="Hui-iconfont">&#xe6d7;</i></a></div>
    </div>
    <div id="iframe_box" class="Hui-article">
        <div class="show_iframe">
            <div style="display:none" class="loading"></div>
            <iframe scrolling="yes" id="iframe" frameborder="0" href="../user/welcome.html"></iframe>
        </div>
    </div>
</section>

<div class="contextMenu" id="Huiadminmenu">
    <ul>
        <li id="closethis">关闭当前 </li>
        <li id="closeall">关闭全部 </li>
    </ul>
</div>






<#include "commons/_footer.ftl">

<!--请在下方写此页面业务相关的脚本-->
<script type="text/javascript" src="../static/lib/jquery.contextmenu/jquery.contextmenu.r2.js"></script>
<script type="text/javascript">

   $(function(){
        window.onload=function () {
            window.frames[0].window.location.href = "../user/welcome.html";
        };

       $("body").Huitab({
           tabBar:".navbar-wrapper .navbar-levelone",
           tabCon:".Hui-aside .menu_dropdown",
           className:"current",
           index:0,
       });
    });
    /*个人信息*/
    function myselfinfo(currentuser){
        var parse = JSON.stringify(currentuser);
        alert(userObj)
        layer.open({
            type: 1,
            area: ['300px','200px'],
            fix: false, //不固定
            maxmin: true,
            shade:0.4,
            title: '查看信息',
            content: '<div>currentuser.login_phone</div>'
        });
    }

    /*资讯-添加*/
    function article_add(title,url){
        var index = layer.open({
            type: 2,
            title: title,
            content: url
        });
        layer.full(index);
    }
    /*图片-添加*/
    function picture_add(title,url){
        var index = layer.open({
            type: 2,
            title: title,
            content: url
        });
        layer.full(index);
    }
    /*产品-添加*/
    function product_add(title,url){
        var index = layer.open({
            type: 2,
            title: title,
            content: url
        });
        layer.full(index);
    }
    /*用户-添加*/
    function member_add(title,url,w,h){
        layer_show(title,url,w,h);
    }


</script>

</body>
</html>