<!DOCTYPE HTML>
<html>
<head>
<#include "../commons/_jscommon.ftl">
<title>便民服务</title>
	<style>
        .panel-header{border-color:#3bb4f2,background-color:#3bb4f2}
        .panel-secondary > .panel-header{ border-color:#3bb4f2; background-color:#3bb4f2; color:#fff}

	</style>
</head>
<body>
<nav class="breadcrumb"><i class="Hui-iconfont">&#xe67f;</i> 首页 <span class="c-gray en">&gt;</span> 系统管理 <span class="c-gray en">&gt;</span> 定时任务列表 <a class="btn btn-success radius r" style="line-height:1.6em;margin-top:3px" href="javascript:location.replace(location.href);" title="刷新" ><i class="Hui-iconfont">&#xe68f;</i></a></nav>
<div class="page-container">
    <div class="codeView docs-example">
        <div class="cl">
            <div class="l" style="width:50%">
                <p><strong>点击效果</strong></p>
                <ul id="Huifold-demo1" class="Huifold">
                    <li class="item">
						<div class="panel-header">
                            <h4 style="color: #00a0e9">查询物流信息
                                <b>
                                    +
                                </b>
                            </h4>
						</div>

                        <div class="info">
                            <form class="form form-horizontal" id="form-admin-add">

                            <div class="row cl">
                                <label class="form-label col-xs-4 col-sm-3">查询单号：</label>
                                <div class="formControls col-xs-8 col-sm-9">
                                    <input type="text" class="input-text" name="no" autocomplete="off" placeholder="帐号">
                                </div>
                            </div>
                            <div class="row cl">
                                <label class="form-label col-xs-4 col-sm-3">物流公司：</label>
                                <div class="formControls col-xs-8 col-sm-9"> <span class="select-box">
						     	<select class="select" size="1" name="type">
								  <option value="" selected>--请选择--</option>
								  <option value="HTKY">百世快递</option>
								  <option value="DEPPON">德邦</option>
								  <option value="SFEXPRESS">顺丰</option>
									<option value="YTO">圆通</option>
									<option value="YUNDA">韵达</option>
									<option value="JD">韵达</option>
								</select>
							    </span>
								</div>
                            </div>
                                <div class="row cl">
                                    <div class="col-xs-8 col-sm-9 col-xs-offset-4 col-sm-offset-3">
                                        <input class="btn btn-primary radius" type="submit" value="&nbsp;&nbsp;查询&nbsp;&nbsp;">
                                    </div>
                                </div>
							</form>
						</div>
                    </li>
                    <li class="item">
                        <h4>标题
                            <b>
                                +
                            </b>
                        </h4>
                        <div class="info"><img src="http://images.h-ui.net/www/2.png" width="300" height="150"><br> 可以是图片</div>
                    </li>
                    <li class="item">
                        <h4>标题
                            <b>
                                +
                            </b>
                        </h4>
                        <div class="info"><img src="http://images.h-ui.net/www/1.png" width="300" height="150"></div>
                    </li>
                </ul>
            </div>
        </div>
    </div>
</div>
<#include "../commons/_footer.ftl">

<!--请在下方写此页面业务相关的脚本-->
<script type="text/javascript" src="../../static/lib/My97DatePicker/4.8/WdatePicker.js"></script>
<script type="text/javascript" src="../../static/lib/datatables/1.10.0/jquery.dataTables.min.js"></script>
<script type="text/javascript" src="../../static/lib/laypage/1.2/laypage.js"></script>
<script>
    $(function(){
        $("#menu-hui dt").addClass("selected");$("#menu-hui dd").show();
        //type 3种 1	只打开一个，可以全部关闭;2	必须有一个打开;3	可打开多个
        $("#Huifold-demo1").Huifold({
            titCell:'.item .panel-header',
            mainCell:'.item .info',
            type:1,
            trigger:'click',
            className:"selected",
            speed:"normal",
        });

    });
</script>
<script type="text/javascript">
/*
	参数解释：
	title	标题
	url		请求的url
	id		需要操作的数据id
	w		弹出层宽度（缺省调默认值）
	h		弹出层高度（缺省调默认值）
*/
/*管理员-增加*/
function job_add(title,url,w,h){
	layer_show(title,url,w,h);
}
/*管理员-删除*/
function job_del(obj,id,name,group){
	layer.confirm('确认要删除吗？',function(index){
		$.ajax({
			type: 'POST',
			url: '../job/deletejob',
			dataType: 'json',
			data:{
			    id:id,
                jobClassName:name,
                jobGroupName:group
			},
			success: function(data){

			    if(data=="0"){
                    $(obj).parents("tr").remove();
                    layer.msg('已删除!',{icon:1,time:1000});
				}else {
                    layer.msg('删除失败!',{icon:1,time:1000});
				}

			},
			error:function(data) {
				console.log(data.msg);
			},
		});		
	});
}

/!*管理员-编辑*!/
function job_edit(title,url,w,h){
	layer_show(title,url,w,h);
}



/*管理员-停用*/
function jop_stop(obj,id,name,group){
	layer.confirm('确认要暂停吗？',function(index){
		//此处请求后台程序，下方是成功后的前台处理……
        $.post("../job/pauseJob",
                {
                    id:id,
                    jobClassName:name,
                    jobGroupName:group
                },
                function(data){
					var stringify = JSON.stringify(data);
					//alert(stringify)
					if(data=='0'){
                        $(obj).parents("tr").find(".td-status").html('<span class="label label-default radius">已暂停</span>');
                        $(obj).remove();
                        layer.msg('已暂停!',{icon: 5,time:1000});
                      //  location.reload();
					}else {
                        layer.msg('更新状态失败!',{icon: 5,time:1000});
					}
                });

	});
}

/*管理员-启用*/
function job_start(obj,id,name,group){
	layer.confirm('确认要恢复吗？',function(index){
		//此处请求后台程序，下方是成功后的前台处理……
        $.post("../job/resumeJob",
                {
                    id:id,
                    jobClassName:name,
                    jobGroupName:group
                },
                function(data){
                    var stringify = JSON.stringify(data);
                 //   alert(stringify)
                    if(data=='0'){
                        $(obj).parents("tr").find(".td-status").html('<span class="label label-default radius">已启用</span>');
						$(obj).remove();
                        layer.msg('已启用!',{icon: 5,time:1000});
					//	location.reload();
                    }else {
                        layer.msg('更新状态失败!',{icon: 5,time:1000});
                    }
                });

	});
}
</script>
</body>
</html>