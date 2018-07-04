<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <title>注册</title>
    <link href="../../static/h-ui/css/bootstrap.min.css" rel="stylesheet">
    <link href="../../static/h-ui/css/gloab.css" rel="stylesheet">
    <link href="../../static/h-ui/css/index.css" rel="stylesheet">
    <script type="text/javascript" src="../../static/lib/jquery/1.9.1/jquery.min.js"></script>
    <script src="../../static/h-ui/js/register.js"></script>
    <script type="text/javascript" src="../../static/lib/layer/2.4/layer.js"></script>
    <#--<#include "../commons/_jscommon.ftl">-->
</head>
<body class="bgf4">
<#--<div id="title-top"  >
    <div id="content">
        <a href="javascript:;" class="btn btn-blue f-r3" id="title">欢迎注册成为平台用户</a>
    </div>
</div>-->
<div class="login-box f-mt10 f-pb50" style="margin-top: 100px">
    <div class="main bgf">
        <div class="reg-box-pan display-inline">
            <div class="step">
                <ul>
                    <li class="col-xs-4 on">
                        <span class="num"><em class="f-r5"></em><i>1</i></span>
                        <span class="line_bg lbg-r"></span>
                        <p class="lbg-txt">填写账户信息</p>
                    </li>
                    <li class="col-xs-4">
                        <span class="num"><em class="f-r5"></em><i>2</i></span>
                        <span class="line_bg lbg-l"></span>
                        <span class="line_bg lbg-r"></span>
                        <p class="lbg-txt">验证账户信息</p>
                    </li>
                    <li class="col-xs-4">
                        <span class="num"><em class="f-r5"></em><i>3</i></span>
                        <span class="line_bg lbg-l"></span>
                        <p class="lbg-txt">账户申请</p>
                    </li>
                </ul>
            </div>
            <div class="reg-box" id="verifyCheck" style="margin-top:20px;">
                <form id="registerFrom" name="registerFrom" action="#"  method="post">
                <div class="part1">
                    <div class="item col-xs-12">
                        <span class="intelligent-label f-fl"><b class="ftx04">*</b>注册邮箱：</span>
                        <div class="f-fl item-ifo">
                            <input type="text" name="loginEmail" class="txt03 f-r3 required" keycodes="tel" tabindex="2" data-valid="isNonEmpty||isEmail" data-error="email不能为空||邮箱格式不正确"  id="email" />

                            <span class="ie8 icon-close close hide"></span>
                            <label class="icon-sucessfill blank hide"></label>
                            <label class="focus"><span>请填写有效的邮箱(包含.,@等特殊符号)</span></label>
                            <label class="focus valid"></label>
                        </div>
                    </div>
                    <div class="item col-xs-12">
                        <span class="intelligent-label f-fl"><b class="ftx04">*</b>手机号：</span>
                        <div class="f-fl item-ifo">
                            <input type="text" name="loginPhone" class="txt03 f-r3 required" keycodes="tel" tabindex="2" data-valid="isNonEmpty||isPhone" data-error="手机号码不能为空||手机号码格式不正确" maxlength="11" id="phone" />
                            <span class="ie8 icon-close close hide"></span>
                            <label class="icon-sucessfill blank hide"></label>
                            <label class="focus">请填写11位有效的手机号码</label>
                            <label class="focus valid"></label>
                        </div>
                    </div>
                    <div class="item col-xs-12">
                        <span class="intelligent-label f-fl"><b class="ftx04">*</b>密码：</span>
                        <div class="f-fl item-ifo">
                            <input type="password" name="loginPassword" id="password" maxlength="20" class="txt03 f-r3 required" tabindex="3" style="ime-mode:disabled;" onpaste="return  false" autocomplete="off" data-valid="isNonEmpty||between:6-20||level:2" data-error="密码不能为空||密码长度6-20位||该密码太简单，有被盗风险，建议字母+数字的组合" />
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
                    <div class="item col-xs-12">
                        <span class="intelligent-label f-fl"><b class="ftx04">*</b>确认密码：</span>
                        <div class="f-fl item-ifo">
                            <input type="password" maxlength="20" name="reLoginPassword" class="txt03 f-r3 required" tabindex="4" style="ime-mode:disabled;" onpaste="return  false" autocomplete="off" data-valid="isNonEmpty||between:6-16||isRepeat:password" data-error="密码不能为空||密码长度6-16位||两次密码输入不一致" id="rePassword" />
                            <span class="ie8 icon-close close hide" style="right:55px"></span>
                            <span class="showpwd" data-eye="rePassword"></span>
                            <label class="icon-sucessfill blank hide"></label>
                            <label class="focus">请再输入一遍上面的密码</label>
                            <label class="focus valid"></label>
                        </div>
                    </div>
                <#--    <div class="item col-xs-12">
                        <span class="intelligent-label f-fl"><b class="ftx04">*</b>验证码：</span>
                        <div class="f-fl item-ifo">
                            <input type="text" maxlength="4" class="txt03 f-r3 f-fl required" tabindex="4" style="width:167px" id="randCode" data-valid="isNonEmpty" data-error="验证码不能为空" />
                            <span class="ie8 icon-close close hide"></span>
                            <label class="f-size12 c-999 f-fl f-pl10">
                                <img src="images/yzm.jpg" />
                            </label>
                            <label class="icon-sucessfill blank hide" style="left:380px"></label>
                            <label class="focusa">看不清？<a href="javascript:;" class="c-blue">换一张</a></label>
                            <label class="focus valid" style="left:370px"></label>
                        </div>
                    </div>-->
                    <div class="item col-xs-12" style="height:auto">
                        <span class="intelligent-label f-fl">&nbsp;</span>
                        <p class="f-size14 required"  data-valid="isChecked" data-error="请先同意条款">
                            <input name="agrees" type="checkbox" checked /><a href="javascript:showoutc();" class="f-ml5">我已阅读并同意条款</a>
                        </p>
                        <label class="focus valid"></label>
                    </div>
                    <div class="item col-xs-12">
                        <span class="intelligent-label f-fl">&nbsp;</span>
                        <div class="f-fl item-ifo">
                            <a href="javascript:;" class="btn btn-blue f-r3" id="btn_part1">下一步</a>
                        </div>
                    </div>
                </div>
                <div class="part2" style="display:none">
                    <div class="alert alert-info" style="width:700px">短信已发送至您手机，请输入短信中的验证码，确保您的手机号真实有效。</div>
                    <div class="item col-xs-12 f-mb10" style="height:auto">
                        <span class="intelligent-label f-fl">手机号：</span>
                        <div class="f-fl item-ifo c-blue">
                            15824450934
                        </div>
                    </div>
                    <div class="item col-xs-12">
                        <span class="intelligent-label f-fl"><b class="ftx04">*</b>验证码：</span>
                        <div class="f-fl item-ifo">
                            <input type="text" name="verifyNo" maxlength="6" id="verifyNo" class="txt03 f-r3 f-fl required" tabindex="4" style="width:167px" data-valid="isNonEmpty||isInt" data-error="验证码不能为空||请输入6位数字验证码" />
                            <span class="btn btn-gray f-r3 f-ml5 f-size13" id="time_box" disabled style="width:97px;display:none;">发送验证码</span>
                            <span class="btn btn-gray f-r3 f-ml5 f-size13" id="verifyYz" style="width:97px;">发送验证码</span>
                            <span class="ie8 icon-close close hide" style="right:130px"></span>
                            <label class="icon-sucessfill blank hide"></label>
                            <label class="focus"><span>请查收手机短信，并填写短信中的验证码（此验证码3分钟内有效）</span></label>
                            <label class="focus valid"></label>
                        </div>
                    </div>
                    <div class="item col-xs-12">
                        <span class="intelligent-label f-fl">&nbsp;</span>
                        <div class="f-fl item-ifo">
                         <a href="javascript:;" class="btn btn-blue f-r3" id="btn_part2">下一步</a>
                           <#-- <input id="btn_part2"  type="submit" value="注册"  class="btn btn-success"/>-->
                        </div>
                    </div>
                </div>
                <div class="part3" style="display:none">
                    <div class="item col-xs-12">
                        <span class="intelligent-label f-fl"><b class="ftx04">*</b>账户类型：</span>
                        <div class="f-fl item-ifo">
                               <select class="txt03 f-r3 required" style="height: 40px" tabindex="2" size="1" name="roleId">
                               <#if map.roleList?exists>
                               <#list map.roleList as m>
                                  <option value="${m.id}">${m.roleName}</option>
                              </#list>
                              </#if>
                               </select>

                        </div>
                    </div>

                    <div class="item col-xs-12">
                        <span class="intelligent-label f-fl"><b class="ftx04">*</b>用户姓名：</span>
                        <div class="f-fl item-ifo">
                            <input type="text" name="userName" class="txt03 f-r3 required" keycodes="tel" tabindex="2" data-valid="isNonEmpty||isUname" data-error="用户姓名不能为空||用户姓名格式不正确" maxlength="11" id="userName" />
                            <span class="ie8 icon-close close hide"></span>
                            <label class="icon-sucessfill blank hide"></label>
                            <label class="focus">请填写有效的用户名称</label>
                            <label class="focus valid"></label>
                        </div>
                    </div>
                    <div class="item col-xs-12">
                        <span class="intelligent-label f-fl"><b class="ftx04">*</b>身份证号：</span>
                        <div class="f-fl item-ifo">
                            <input type="text" name="cardId" class="txt03 f-r3 required" tabindex="2" data-valid="isNonEmpty||isCard" data-error="身份证号不能为空||身份证号码格式不正确" maxlength="18" id="card_id" />
                            <span class="ie8 icon-close close hide"></span>
                            <label class="icon-sucessfill blank hide"></label>
                            <label class="focus">请填写18位有效的身份证号码</label>
                            <label class="focus valid"></label>
                        </div>
                    </div>
                    <div class="item col-xs-12">
                        <span class="intelligent-label f-fl">&nbsp;</span>
                        <div class="f-fl item-ifo">
                            <#--<a href="javascript:;"  class="btn btn-blue f-r3" id="btn_part3">申请账户</a>-->
                            <input name="login" id="btn_part3" type="submit" class="btn btn-blue f-r3" value="&nbsp;申&nbsp;请&nbsp;账&nbsp;户&nbsp;">
                        </div>
                    </div>
                </div>
                </form>
                <div id="part4" class="part4 text-center" style="display:none">
                    <h3 id="message"></h3>
                    <p class="c-666 f-mt30 f-mb50">页面将在 <strong id="times" class="f-size18">10</strong> 秒钟后，跳转到 <a href="/user/tologin" class="c-blue">用户登录中心</a></p>
                </div>
            </div>
        </div>
    </div>
</div>
<div class="m-sPopBg" style="z-index:998;"></div>
<div class="m-sPopCon regcon">
    <div class="m-sPopTitle"><strong>服务协议条款</strong><b id="sPopClose" class="m-sPopClose" onClick="closeClause()">×</b></div>
    <div class="apply_up_content">
    	<pre class="f-r0">
		<strong>同意以下服务条款，提交注册信息</strong>
        </pre>
    </div>
    <center><a class="btn btn-blue btn-lg f-size12 b-b0 b-l0 b-t0 b-r0 f-pl50 f-pr50 f-r3" href="javascript:closeClause();">已阅读并同意此条款</a></center>
</div>
<script>
    $(function(){
        //第一页的确定按钮
        $("#btn_part1").click(function(){
            $.ajax({
                type: "POST",   //提交的方法
                url:"/userRegister/verifyCheck", //提交的地址
                data:{"loginPhone":$("#phone").val(),"loginEmail":$("#email").val()},
                async: true,
                dataType: "json",
                error: function(request) {  //失败的话
                    layer.open({
                        title: '提示信息'
                        ,content: '对不起，服务器异常！'
                    });
                },
                success: function(data) {  //成功
                    if(data=='0'){
                        layer.msg('该手机号已注册过!',{icon:0,time:1000});
                    }else if(data=="1") {
                        layer.msg('该邮箱已注册过!',{icon:0,time:1000});
                    }else {
                        if(!verifyCheck._click()) return;
                        $(".part1").hide();
                        $(".part2").show();
                        $(".step li").eq(1).addClass("on");
                    }
                }
            });

        });
        //第二页的确定按钮
        $("#btn_part2").click(function(){
            if(!verifyCheck._click()) return;
            $(".part2").hide();
            $(".part3").show();
        });
        //第三页的确定按钮
        $("#btn_part3").click(function () {
            var phone =$("#phone").val();
            $("#btn_part3").attr('disabled',"true");
            $.ajax({
                type: "POST",   //提交的方法
                url:"/userRegister/register", //提交的地址
                data:$('#registerFrom').serialize(),// 序列化表单值
                async: true,
                dataType: "json",
                error: function(request) {  //失败的话
                    alert("Connection error");
                },
                success: function(data) {  //成功
                    if(data.code=='200'){
                        // if(!verifyCheck._click()) return;
                        $("#btn_part3").removeAttr("disabled");
                        $(".part3").hide();
                        $(".part4").show();
                        $("#message").html('恭喜<span style="color:red">'+ phone+'</span>，您已成功申请账号，审核需要1-2个工作日，通过后我们会通过邮箱通知您!');
                        $(".step li").eq(2).addClass("on");
                        countdown({
                            maxTime:10,
                            ing:function(c){
                                $("#times").text(c);
                            },
                            after:function(){
                                window.location.href="/user/tologin";
                            }
                        });
                    }else {
                        layer.open({
                            title: '提示信息'
                            ,content: '对不起，您本次注册失败！'
                        });
                    }


                }
            });
        });

    });

    function showoutc(){$(".m-sPopBg,.m-sPopCon").show();}
    function closeClause(){
        $(".m-sPopBg,.m-sPopCon").hide();
    }
</script>
</body>
</html>
