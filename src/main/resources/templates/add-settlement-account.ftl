<!DOCTYPE HTML>
<html xmlns="http://www.w3.org/1999/html">
<head>
<#include "commons/_jscommon.ftl">
<title>新增分润账户</title>
<link href="../static/lib/webuploader/0.1.5/webuploader.css" rel="stylesheet" type="text/css" />
</head>
<body>
<div class="page-container">
	<form class="form form-horizontal"  name="form-settlement-add" action="##" id="form-settlement-add">
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-2">用户唯一ID：</label>
			<div class="formControls col-xs-5 col-sm-6">
				<input type="text"  class="input-text" value="${userid}" placeholder="" id="userid" name="userid" readonly>
			</div>
		</div>
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-2"><span class="c-red">*</span>分润账户：</label>
			<div class="formControls col-xs-5 col-sm-6">
				<input type="text" class="input-text required" value="" placeholder="" id="account" name="account">

			</div>
		</div>
        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-2"> <span class="c-red">*</span>是否对公账户：</label>
            <div class="formControls col-xs-5 col-sm-6 skin-minimal">
                <div class="check-box">
                    <input type="checkbox" name="ispublic" id="ispublic">
                    <label for="ispublic" >&nbsp;</label>
                </div>
            </div>
        </div>
        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-2"><span class="c-red">*</span>账户真实姓名：</label>
            <div class="formControls col-xs-5 col-sm-6">
                <input type="text" class="input-text required" value="" placeholder="" id="realname" name="realname">

            </div>
        </div>
		<div class="row cl">
			<div class="col-xs-8 col-sm-9 col-xs-offset-4 col-sm-offset-2">
                <button type="submit" id="createsettle" class="btn btn-primary radius"> 提交</button>
				<button onClick="layer_close();" class="btn btn-default radius" type="button">&nbsp;&nbsp;取消&nbsp;&nbsp;</button>
			</div>
		</div>
	</form>
</div>

<#include "commons/_footer.ftl">

<!--请在下方写此页面业务相关的脚本-->

<script type="text/javascript">
    $("#form-settlement-add").validate({
        submitHandler : function(){
            //在这里面写你的异步提交比如$.ajax({url:"",data:""})
            $.ajax({
                //几个参数需要注意一下
                type: "POST",//方法类型
                dataType: "json",//预期服务器返回的数据类型
                url: "../pay/createsettleaccount",//url
                data: $('#form-settlement-add').serialize(),
                success: function (result) {
                    var stringify = JSON.stringify(result);
                   // alert(stringify);
                    console.log(result);//打印服务端返回的数据(调试用)
                    if (result.code=="200") {
                        layer.alert("提交数据成功");
                        window.parent.location.reload();
                    }else {
                        layer.alert("对不起数据提交失败，请联系管理员");
                    }
                },
                error : function() {
                    layer.alert("对不起服务器异常！");
                }

            });
        }});
    $("#form-settlement-add").submit();

</script>
</body>
</html>