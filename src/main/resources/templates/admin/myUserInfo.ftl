<!DOCTYPE HTML>
<html>
<head>
<#include "../commons/_jscommon.ftl">
<title>个人用户中心</title>
<meta name="keywords" content="">
<meta name="description" content="">
</head>
<body>
<article class="page-container">
    <#if Session.currentUser?exists>
  <form class="form form-horizontal" id="form-admin-add">
       <div class="row cl">
           <label class="form-label col-xs-4 col-sm-3">用户名称：</label>
           <div class="formControls col-xs-8 col-sm-9">
               <input type="text"  style="border: 0px;outline:none;cursor: pointer;" class="input-text" value="<#if Session.currentUser.username??>${Session.currentUser.username}</#if> " readonly="readonly"  >
           </div>
       </div>
       <div class="row cl">
           <label class="form-label col-xs-4 col-sm-3">登录账号：</label>
           <div class="formControls col-xs-8 col-sm-9">
               <input type="text"  style="border: 0px;outline:none;cursor: pointer;" class="input-text" readonly="readonly"  value="${Session.currentUser.login_phone}" >
            </div>
       </div>
        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-3">上次登录时间：</label>
           <div class="formControls col-xs-8 col-sm-9">
                <input type="text"   style="border: 0px;outline:none;cursor: pointer;" class="input-text" readonly="readonly" value="<#if Session.currentUser.last_login_time??>${Session.currentUser.last_login_time?string('yyyy-MM-dd hh:mm:ss')}</#if>" >
            </div>
        </div>
       <div class="row cl">
           <label class="form-label col-xs-4 col-sm-3">邮箱：</label>
            <div class="formControls col-xs-8 col-sm-9">
                <input type="text"  style="border: 0px;outline:none;cursor: pointer;" class="input-text" value="${Session.currentUser.login_email}"  readonly="readonly" >
            </div>
        </div>
       <#--<div class="row cl">
           <label class="form-label col-xs-4 col-sm-3">地址：</label>
           <div class="formControls col-xs-8 col-sm-9">
                <input type="text"  style="border: 0px;outline:none;cursor: pointer;" class="input-text" value="<#if  Session.currentUser.obligate>${Session.currentUser.obligate}</#if>" readonly="readonly" >
            </div>
        </div>-->
    </div>
   </form>
</#if>
</article>

<#include "../commons/_footer.ftl">

<!--请在下方写此页面业务相关的脚本-->
<script type="text/javascript" src="../../static/lib/jquery.validation/1.14.0/jquery.validate.js"></script>
<script type="text/javascript" src="../../static/lib/jquery.validation/1.14.0/validate-methods.js"></script>
<script type="text/javascript" src="../../static/lib/jquery.validation/1.14.0/messages_zh.js"></script>
<!--/请在上方写此页面业务相关的脚本-->
</body>
</html>