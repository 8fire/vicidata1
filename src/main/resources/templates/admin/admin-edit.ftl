<!DOCTYPE HTML>
<html>
<head>
<#include "../commons/_jscommon.ftl">
<title>编辑管理员 - 管理员管理 </title>
<meta name="keywords" content="">
<meta name="description" content="">
</head>
<body>
<article class="page-container">
	<form class="form form-horizontal" action="../user/admin-edit.html"  method="post" id="form-admin-edit">
		<input type="hidden" name="id" value="${memberUser.id}">
	<div class="row cl">
		<label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>登录手机：</label>
		<div class="formControls col-xs-8 col-sm-9">
			<input type="text" class="input-text" value="${memberUser.login_phone}" placeholder="" id="login_phone"  name="login_phone">
		</div>
	</div>
        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>登录邮箱：</label>
            <div class="formControls col-xs-8 col-sm-9">
                <input type="text" class="input-text" value="${memberUser.login_email}" placeholder="" id="login_email"  name="login_email">
            </div>
        </div>
        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-3">上次登录时间：</label>
            <div class="formControls col-xs-8 col-sm-9">
                <input type="text" class="input-text" value="<#if memberUser.last_login_time??>${memberUser.last_login_time?string('yyyy-MM-dd hh:mm:ss')}</#if> " readonly="readonly" placeholder="" id="last_login_time"  name="last_login_time">
            </div>
        </div>
	<#--<div class="row cl">
		<label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>性别：</label>
		<div class="formControls col-xs-8 col-sm-9 skin-minimal">
			<div class="radio-box">
				<input name="sex" type="radio" id="sex-1" checked>
				<label for="sex-1">男</label>
			</div>
			<div class="radio-box">
				<input type="radio" id="sex-2" name="sex">
				<label for="sex-2">女</label>
			</div>
		</div>
	</div>-->

	<#--<div class="row cl">
		<label class="form-label col-xs-4 col-sm-3">角色：</label>
		<div class="formControls col-xs-8 col-sm-9"> <span class="select-box" style="width:150px;">
			<select class="select" name="adminRole" size="1">
				<option value="0">超级管理员</option>
				<option value="1">总编</option>
				<option value="2">栏目主辑</option>
				<option value="3">栏目编辑</option>
			</select>
			</span> </div>
	</div>-->
	<div class="row cl">
		<div class="col-xs-8 col-sm-9 col-xs-offset-4 col-sm-offset-3">
			<input class="btn btn-primary radius" type="submit" value="&nbsp;&nbsp;提交&nbsp;&nbsp;">
            <button onClick="layer_close();" class="btn btn-default radius" type="button">&nbsp;&nbsp;取消&nbsp;&nbsp;</button>
		</div>
	</div>
	</form>
</article>

<#include "../commons/_footer.ftl">

<!--请在下方写此页面业务相关的脚本-->
<script type="text/javascript" src="../../static/lib/jquery.validation/1.14.0/jquery.validate.js"></script>
<script type="text/javascript" src="../../static/lib/jquery.validation/1.14.0/validate-methods.js"></script>
<script type="text/javascript" src="../../static/lib/datatables/1.10.0/jquery.dataTables.min.js"></script>
<script type="text/javascript" src="../../static/lib/jquery.validation/1.14.0/messages_zh.js"></script>
<script type="text/javascript">
$(function() {
    $("#form-admin-edit").validate({

        rules: {
            login_phone: {
                required: true,
                isPhone: true,
                remote: {
                    url: "../user/isExistMemberUser.html",     //后台处理程序
                    type: "post",               //数据发送方式
                    dataType: "application/json,charset=UTF-8",           //接受数据格式
                    data: {                     //要传递的数据
                        login_phone: function () {
                            return $("#login_phone").val();
                        }
                    }//远程ajax验证
                }
            },
            login_email: {
                required: true,
                email: true
            }
        },
        message:{
            login_phone: {
                required: "bitian",
                isPhone: "dada",
                remote:"cuowul"
            },
            login_email: {
                required: "bitian",
                email: "ssss"
            }
        }
        onkeyup: false,
        focusCleanup: true,
        focusInvalid: true,   //验证提示时，鼠标光标指向提示的input
        submitHandler: function (form) {
            $(form).ajaxSubmit({
                dataType: "application/json,charset=UTF-8",
                success: function (result) {
                    var stringify = JSON.stringify(result);
                    alert(result);
                    if (result.code = 200) {
                        alert("success");
                        var index = parent.layer.getFrameIndex(window.name);
                        parent.layer.close(index);
                        window.parent.location.reload();

                        layer.msg('修改成功!', {icon: 1, time: 1000});
                    } else {
                        alert("fail");
                    }
                },
                error: function () {
                    layer.msg('error!', {icon: 1, time: 1000})
                }
            });

        }
    });
});
</script>
</body>
</html>