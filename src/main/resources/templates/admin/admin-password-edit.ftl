<!DOCTYPE HTML>
<html>
<head>
    <link href="../../static/h-ui/css/bootstrap.min.css" rel="stylesheet">
    <link href="../../static/h-ui/css/gloab.css" rel="stylesheet">
    <link href="../../static/h-ui/css/index.css" rel="stylesheet">
    <script type="text/javascript" src="/static/lib/jquery/1.9.1/jquery.min.js"></script>
    <script src="/static/h-ui/js/register.js"></script>
    <script type="text/javascript" src="../../static/lib/layer/2.4/layer.js"></script>
<title>修改密码</title>
</head>
<body class="bgf4">
          <div class="main bgf">
              <div class="reg-box-pan display-inline">
                  <div class="reg-box" id="verifyCheck" style="margin-top:20px;">

                      <form id="registerFrom" name="registerFrom" action="../user/editPassWord.html"  method="post">
                          <div class="part1">

                              <div class="item col-xs-8">
                                  <span class="intelligent-label f-fl"><b class="ftx04">*</b>老密码：</span>
                                  <div class="f-fl item-ifo">
                                      <input type="password" name="oldPassword" id="oldPassword" maxlength="20" class="txt03 f-r3 required" tabindex="3" style="ime-mode:disabled;" onpaste="return  false" autocomplete="off" data-valid="isNonEmpty" data-error="密码不能为空"  />
                                      <span class="ie8 icon-close close hide"></span>
                                      <label class="icon-sucessfill blank hide"></label>
                                      <label class="focus">老密码不能为空</label>
                                      <label class="focus valid"></label>
                                  </div>
                              </div>

                              <div class="item col-xs-8">
                                  <span class="intelligent-label f-fl"><b class="ftx04">*</b>新密码：</span>
                                  <div class="f-fl item-ifo">
                                      <input type="password" name="newPassword" id="newPassword" maxlength="20" class="txt03 f-r3 required" tabindex="3" style="ime-mode:disabled;" onpaste="return  false" autocomplete="off" data-valid="isNonEmpty||between:6-20||level:2" data-error="密码不能为空||密码长度6-20位||该密码太简单，有被盗风险，建议字母+数字的组合" />
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

                              <div class="item col-xs-8">
                                  <span class="intelligent-label f-fl"><b class="ftx04">*</b>确认密码：</span>
                                  <div class="f-fl item-ifo">
                                      <input type="password" maxlength="20" name="newPassword2" class="txt03 f-r3 required" tabindex="4" style="ime-mode:disabled;" onpaste="return  false" autocomplete="off" data-valid="isNonEmpty||between:6-16||isRepeat:newPassword" data-error="密码不能为空||密码长度6-16位||两次密码输入不一致" id="newPassword2" />
                                      <span class="ie8 icon-close close hide" style="right:55px"></span>
                                      <span class="showpwd" data-eye="rePassword"></span>
                                      <label class="icon-sucessfill blank hide"></label>
                                      <label class="focus">请再输入一遍上面的密码</label>
                                      <label class="focus valid"></label>
                                  </div>
                              </div>

                                  <div class="item col-xs-12">
                                      <span class="intelligent-label f-fl">&nbsp;</span>
                                      <div class="f-fl item-ifo">
                                          <a href="javascript:;" class="btn btn-blue f-r3" id="btn_part1">提交</a>
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
        //第一页的确定按钮
        $("#btn_part1").click(function () {
           var oldPassword= $("#oldPassword").val();
           var  newPassword=$("#newPassword").val();
            var newPassword2=$("#newPassword2").val();
            if (oldPassword==null||oldPassword==undefined||oldPassword==""){
                layer.msg('老密码不能为空!', {icon: 0, time: 1000});
                return false;
            }
            if (newPassword==null||newPassword==undefined||newPassword==""){
                layer.msg('新密码不能为空!', {icon: 0, time: 1000});
                return false;
            }
            if (newPassword2==null||newPassword2==undefined||newPassword2==""){
                layer.msg('确认密码不能为空!', {icon: 0, time: 1000});
                return false;
            }
            if(newPassword!=newPassword2){
                layer.msg('两次密码输入不一致!', {icon: 0, time: 1000});
                return false;
            }
            $.ajax({
                type: "POST",   //提交的方法
                url: "../user/editPassWord.html", //提交的地址
                data: {
                    "oldPassword": $("#oldPassword").val(),
                    "newPassword": $("#newPassword").val(),
                    "newPassword2": $("#newPassword2").val(),
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
                    var s = JSON.stringify(data);
                    if (data.code == '200') {
                        layer.msg('修改成功!',{icon:1,time:1000});
                        window.parent.location.reload();
                    }  else {
                        layer.msg(data.msg, {icon: 0, time: 1000});
                    }
                }
            });

        });
    });
</script>


</body>
</html>