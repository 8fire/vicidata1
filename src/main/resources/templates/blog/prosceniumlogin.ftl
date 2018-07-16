<!DOCTYPE HTML>
<html>
<head>
    <link href="../../static/h-ui/css/bootstrap.min.css" rel="stylesheet">
    <link href="../../static/h-ui/css/gloab.css" rel="stylesheet">
    <link href="../../static/h-ui/css/index.css" rel="stylesheet">
    <script type="text/javascript" src="/static/lib/jquery/1.9.1/jquery.min.js"></script>
    <script src="/static/h-ui/js/register.js"></script>
    <script type="text/javascript" src="../../static/lib/layer/2.4/layer.js"></script>
    <title>登录</title>
</head>
<body class="bgf4">
<div class="main bgf">
    <div class="reg-box-pan display-inline">
        <div class="reg-box" id="verifyCheck" style="margin-top:20px;">
            <form id="registerFrom" name="registerFrom" action=""  method="post">
                <div class="part1" >

                    <div class="item col-xs-12"  style="margin-left: -100px">
                        <span class="intelligent-label f-fl"><b class="ftx04">*</b>登录账号：</span>
                        <div class="f-fl item-ifo">
                            <input type="text" name="loginPhone" class="txt03 f-r3 required" keycodes="tel" tabindex="2" data-valid="isNonEmpty||isPhone" data-error="账户不能为空||账户格式不正确" maxlength="11" id="phone" />
                            <span class="ie8 icon-close close hide"></span>
                            <label class="icon-sucessfill blank hide"></label>
                            <label class="focus">请填写有效的账户</label>
                            <label class="focus valid"></label>
                        </div>
                    </div>

                    <div class="item col-xs-8" style="margin-left: -100px">
                        <span class="intelligent-label f-fl"><b class="ftx04">*</b>登录密码：</span>
                        <div class="f-fl item-ifo">
                            <input type="password" name="loginPassword" id="loginPassword" maxlength="20" class="txt03 f-r3 required" tabindex="3" style="ime-mode:disabled;" onpaste="return  false" autocomplete="off" data-valid="isNonEmpty||between:6-20||level:2" data-error="密码不能为空||密码长度6-20位||该密码太简单，有被盗风险，建议字母+数字的组合" />
                            <span class="ie8 icon-close close hide" style="right:55px"></span>
                            <span class="showpwd" data-eye="password"></span>
                            <label class="icon-sucessfill blank hide"></label>
                            <label class="focus">6-20位英文（区分大小写）、数字、字符的组合</label>
                            <label class="focus valid"></label>
                            <span class="clearfix"></span>
                            <label class="strength">
                                <span class="f-fl f-size12">安全程度：</span>
                                <b><i>弱</i><i>中</i><i>强</i></b>
                            </label>
                        </div>
                    </div>

                    <div class="item col-xs-8" style="margin-left: -100px">
                        <span class="intelligent-label f-fl">&nbsp;</span>
                        <div class="f-fl item-ifo">
                            <a href="javascript:;" class="btn btn-blue f-r3" id="btn_part1">登录</a>
                        </div>
                    </div>
                </div>
            </form>

        </div>

    </div>
</div>
</body>
<script type="text/javascript">

</script>
<script type="text/javascript">
    $(function() {
        $("#btn_part1").click(function () {
            var phone= $("#phone").val();
            var  LoginPassword=$("#loginPassword").val();
            if (phone==null||phone==undefined||phone==""){
                layer.msg('账户不能为空!', {icon: 5, time: 1000});
                return false;
            }
            if (LoginPassword==null||LoginPassword==undefined||LoginPassword==""){
                layer.msg('密码不能为空!', {icon: 5, time: 1000});
                return false;
            }
            $.ajax({
                type: "POST",   //提交的方法
                url: "../blogUser/prosceniumLogin.html", //提交的地址
                data: {
                    "loginPhone": $("#phone").val(),
                    "loginPassword": $("#loginPassword").val(),
                },
                async: true,
                dataType: "json",
                error: function (request) {  //失败的话
                    layer.open({
                          title: '提示信息'
                        , content: '对不起，服务器异常！'
                    });
                },
                success: function (data) {  //成功
                    layer.load();
                    if (data.code == '200') {
                        setTimeout(function(){
                            layer.closeAll('loading');
                            layer.msg('登录成功!',{icon:1,time:1000});
                            window.parent.location.reload();
                        }, 1000);
                    }  else {
                        layer.msg(data.extend.data.msg, {icon: 0, time: 1000});
                    }
                }
            });

        });
    });
</script>


</body>
</html>