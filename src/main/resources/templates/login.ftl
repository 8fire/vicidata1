<!DOCTYPE HTML>
<html>
<head>
    <meta charset="utf-8">
    <meta name="renderer" content="webkit|ie-comp|ie-stand">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no" />
    <meta http-equiv="Cache-Control" content="no-siteapp" />
    <!--[if lt IE 9]>
    <script type="text/javascript" src="../static/lib/html5shiv.js"></script>
    <script type="text/javascript" src="../static/lib/respond.min.js"></script>
    <![endif]-->
    <link href="../static/h-ui/css/H-ui.min.css" rel="stylesheet" type="text/css" />
    <link href="../static/h-ui.admin/css/H-ui.login.css" rel="stylesheet" type="text/css" />
    <link href="../static/h-ui.admin/css/style.css" rel="stylesheet" type="text/css" />
    <link href="../static/lib/Hui-iconfont/1.0.8/iconfont.css" rel="stylesheet" type="text/css" />
    <!--[if IE 6]>
    <script type="text/javascript" src="../lib/DD_belatedPNG_0.0.8a-min.js" ></script>
    <script>DD_belatedPNG.fix('*');</script>
    <![endif]-->
    <title>后台登录 - 管理平台 v1.0</title>
    <meta name="keywords" content="">
    <meta name="description" content="">
    <style rel="stylesheet" type="text/css">
        .fr{float:right}
        #btnRegister{color:#ff9600}
        a:link,a:visited{
            text-decoration:none;  /*超链接无下划线*/
        }
        a:hover{
            text-decoration:none;  /*鼠标放上去有下划线*/
        }
        #btnForgetpsw{color: #A60000}
    </style>

</head>
<body>
<#--<input type="hidden" id="TenantId" name="TenantId" value="" />-->
<div class="header"></div>
<div class="loginWraper">
    <div id="loginform" class="loginBox">
        <form class="form form-horizontal" id="form1" name="form1" action="##" >
            <div class="row cl">
                <label class="form-label col-xs-3"><i class="Hui-iconfont">&#xe60d;</i></label>
                <div class="formControls col-xs-8">
                    <input id="loginPhone" name="loginPhone" type="text" value="" placeholder="账户" class="input-text size-L">
                </div>
            </div>
            <div class="row cl">
                <label class="form-label col-xs-3"><i class="Hui-iconfont">&#xe60e;</i></label>
                <div class="formControls col-xs-8">
                    <input id="loginPassword" name="loginPassword" type="password" value="" placeholder="密码" class="input-text size-L">
                </div>
            </div>
            <div class="row cl">
                <div class="formControls col-xs-8 col-xs-offset-3">
                    <input class="input-text size-L" id="yzm" type="text" placeholder="验证码" onclick="if(this.value=='验证码:'){this.value='';}" value="" placeholder="验证码" style="width:150px;">
                    <img src="" id="imageCode" style="cursor: pointer;" title="点我更换验证码"> <a id="kanbuq" onclick="changeCode()" href="javascript:;">看不清，换一张</a> </div>
            </div>
            <div class="row cl">
                <div class="formControls col-xs-8 col-xs-offset-3">
                    <label for="online">
                        <input type="checkbox" name="rememberMe" id="rememberMe" >
                        使我保持登录状态</label>
                </div>
            </div>
            <div class="row cl">
                <div class="formControls col-xs-8 col-xs-offset-3" style="margin-top: -10px">
                    <label for="online1"><a id="btnForgetpsw"  target="_blank" href="/user/editPassWord" class="fr">忘记密码？</a>还没有账号？<a href="/userRegister/toUserRegister" target="_blank"  id="btnRegister">立即注册</a></label>
                </div>
            </div>
            <div class="row cl">
                <div class="formControls col-xs-8 col-xs-offset-3">
                    <input name="login" id="login" type="button" class="btn btn-success radius size-L" value="&nbsp;登&nbsp;&nbsp;&nbsp;&nbsp;录&nbsp;">
                    <input name="" type="reset" class="btn btn-default radius size-L" value="&nbsp;取&nbsp;&nbsp;&nbsp;&nbsp;消&nbsp;">
                </div>
            </div>
        </form>
    </div>
</div>
<div class="footer">Copyright 你的公司名称 by H-ui.admin v3.1</div>

<#include "commons/_footer.ftl">
<script>
    $(function() {
        changeCode();
        //debugger;//生成验证码
        $('#kanbuq').click(function () {
            $(this).hide().attr('src', '/user/captcha-image?' + Math.floor(Math.random()*100) ).fadeIn(); });
        $('#yzm').blur(function () {
            var kaptchaCode=$("#yzm").val().trim();
            if(kaptchaCode!=""){
                $.ajax({
                    type:"POST",
                    url:"/user/captchaVerify",
                    data:{"kaptchaCode":kaptchaCode},
                    dataType: "json",
                    success:function(data){
                        console.log(JSON.stringify(data));
                        if(data.isOK=="OK"){
                            //layer.msg("验证码正确",{icon:1,time:2000});
                        }else{
                            layer.msg("输入验证码错误，请重新输入",{icon:2,time:2000});
                        }
                    }
                });
            }else {
                layer.msg("请输入验证码",{icon:2,time:2000});
            }
        });

    });
    function changeCode() {  //刷新
        $('#imageCode').hide().attr('src', '/user/captcha-image?' + Math.floor(Math.random()*100) ).fadeIn();
    }


    $("#login").click(function () {
        var kaptchaCode1=$("#yzm").val().trim();
        var loginPhone= $("#loginPhone").val().trim();
        var loginPassword=$("#loginPassword").val();
        var rememberMe=$("#rememberMe").is(':checked');
        if(loginPhone==""||loginPhone==undefined||loginPhone==null){
            layer.msg("账户不能为空",{icon:0,time:2000});
            return false;
        }
        if(loginPassword==""||loginPassword==undefined||loginPassword==null){
            layer.msg("密码不能为空",{icon:0,time:2000});
            return false;
        }
        if(kaptchaCode1==""||kaptchaCode1==undefined||kaptchaCode1==null){
            layer.msg("验证码不能为空",{icon:0,time:2000});
            return false;
        }else {
            $.ajax({
                type:"POST",
                url:"/user/captchaVerify",
                data:{"kaptchaCode":kaptchaCode1},
                dataType: "json",
                success:function(data){
                    console.log(JSON.stringify(data));
                    if(data.isOK=="OK"){
                        $.ajax({
                            type: 'POST',
                            url: '/user/ajaxlogin',
                            data:{
                                "loginPhone":$("#loginPhone").val(),
                                "loginPassword":$("#loginPassword").val(),
                                "rememberMe":$("#rememberMe").is(':checked')
                            },
                            dataType: 'json',
                            success: function(data){
                                var stringify = JSON.stringify(data);
                                //  alert(stringify)
                                if(data.code=='400'){
                                    layer.msg(data.extend.data.msg,{icon:2,time:2000});
                                }else if (data.code=='200'){
                                   // layer.msg(data.extend.data.msg,{icon:1,time:2000});
                                    window.location.href="../user/index"
                                }else {
                                    layer.msg("请联系管理员，出错了",{icon:2,time:2000});
                                }
                            },
                            error:function(data) {
                                layer.msg('服务器异常!',{icon:1,time:1000});
                                console.log(data.msg);
                            },
                        });
                    }else{
                        layer.msg("输入验证码错误，请重新输入",{icon:2,time:2000});
                    }
                }
            });
        }

    });

</script>
</body>
</html>