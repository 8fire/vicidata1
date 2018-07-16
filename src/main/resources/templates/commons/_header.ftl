<header class="navbar-wrapper">
    <div class="navbar navbar-fixed-top">
        <div class="container-fluid cl"> <a class="logo navbar-logo f-l mr-10 hidden-xs" href="/aboutHui.shtml">内部后台</a> <a class="logo navbar-logo-m f-l mr-10 visible-xs" href="/aboutHui.shtml"></a> <span class="logo navbar-slogan f-l mr-10 hidden-xs">v1.1</span> <a aria-hidden="false" class="nav-toggle Hui-iconfont visible-xs" href="javascript:;">&#xe667;</a>
            <nav class="nav navbar-nav">
            <ul class="cl">
                 <#--   <li class="dropDown dropDown_hover"><a href="javascript:;" class="dropDown_A"><i class="Hui-iconfont">&#xe600;</i> 新增 <i class="Hui-iconfont">&#xe6d5;</i></a>-->
                       <#-- <ul class="nav layui-bg-blue dropDown-menu menu radius box-shadow">
                            <li><a href="javascript:;" onclick="article_add('添加资讯','article-add.ftl')"><i class="Hui-iconfont">&#xe616;</i> 资讯</a></li>
                            <li><a href="javascript:;" onclick="picture_add('添加资讯','add-settlement-account.ftl.')"><i class="Hui-iconfont">&#xe613;</i> 图片</a></li>
                            <li><a href="javascript:;" onclick="product_add('添加资讯','product-add.ftl')"><i class="Hui-iconfont">&#xe620;</i> 产品</a></li>
                            <li><a href="javascript:;" onclick="member_add('添加用户','member-add.ftl','','510')"><i class="Hui-iconfont">&#xe60d;</i> 用户</a></li>

                        </ul>-->
                            <li class="layui-nav-item navbar-levelone current"><a href="javascript:;">平台</a></li>
                            <li class="layui-nav-item navbar-levelone"><a href="javascript:;">商城</a></li>
                            <li class="layui-nav-item navbar-levelone"><a href="javascript:;">财务</a></li>
                            <li class="layui-nav-item navbar-levelone"><a href="javascript:;">闲言</a></li>

                    </li>
                </ul>
            </nav>
            <nav id="Hui-userbar" class="nav navbar-nav navbar-userbar hidden-xs">
                <ul class="cl">
                    <li><span>欢迎</span></li>
                    <li class="dropDown dropDown_hover"> <a href="#" class="dropDown_A">
                        <i class="Hui-iconfont">&#xe60a;</i>
                        <span style="color: red">
						<#if Session.username?exists>
							${Session.username}
						</#if>
						</span>
                        <i class="Hui-iconfont">&#xe6d5;</i></a>
                        <ul class="dropDown-menu menu radius box-shadow">
                            <li><a href="#" onclick="myselfinfo('我的信息中心','../user/myUserInfo')">个人信息</a></li>
                            <li><a href="#" onclick="editPassWord('修改密码','../user/toEditPassWord')">修改密码</a></li>
                            <li><a href="../user/logout">切换账户</a></li>
                            <li><a href="../user/logout">退出</a></li>
                        </ul>
                    </li>
                    <li id="Hui-msg"> <a href="#" title="消息"><span class="badge badge-danger">1</span><i class="Hui-iconfont" style="font-size:18px">&#xe68a;</i></a> </li>
                    <li id="Hui-skin" class="dropDown right dropDown_hover"> <a href="javascript:;" class="dropDown_A" title="换肤"><i class="Hui-iconfont" style="font-size:18px">&#xe62a;</i></a>
                        <ul class="dropDown-menu menu radius box-shadow">
                            <li><a href="javascript:;" data-val="default" title="默认（黑色）">默认（黑色）</a></li>
                            <li><a href="javascript:;" data-val="blue" title="蓝色">蓝色</a></li>
                            <li><a href="javascript:;" data-val="green" title="绿色">绿色</a></li>
                            <li><a href="javascript:;" data-val="red" title="红色">红色</a></li>
                            <li><a href="javascript:;" data-val="yellow" title="黄色">黄色</a></li>
                            <li><a href="javascript:;" data-val="orange" title="橙色">橙色</a></li>
                        </ul>
                    </li>
                </ul>
            </nav>
        </div>
    </div>
</header>
<script>
    /*个人信息*/
    function myselfinfo(title,url){
        layer.open({
            type: 2,
            title:title,
            maxmin: true,
            skin: 'layui-layer-lan',
            shadeClose: true, //点击遮罩关闭层
            area : ['750px','700px'],
            content:url
        });
       // layer.full(index);
    }
    function editPassWord(title,url) {
        layer.open({
            type: 2,
            title:title,
            maxmin: true,
            skin: 'layui-layer-lan',
            shadeClose: true, //点击遮罩关闭层
            area : ['900px','430px'],
            content:[url,'no']
        });
    }
</script>