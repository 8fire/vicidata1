<!DOCTYPE HTML>
<html xmlns="http://www.w3.org/1999/html">
<head>
<#include "commons/_jscommon.ftl">
<title>分润账户详情</title>
</head>
<body>
<div class="page-container">

    <div class="mt-20">
        <table class="table table-border table-bordered table-bg table-hover table-sort">
            <thead>
            <tr class="text-c">
                <th width="50"><input name="" type="checkbox" value=""></th>
                <th width="150">用户ID</th>
                <th width="150">账户</th>
                <th width="150">真实姓名</th>
                <th width="150">是否对公账户</th>
                <th width="150">创建时间</th>
                <th width="100">操作</th>
            </tr>
            </thead>
            <tbody>
           <#if list?exists>
           <#list list as p>
            <tr class="text-c">
                <td><input name="" type="checkbox" value=""></td>

                <td class="text-c">${p.userid}</td>
                <td class="text-c">${p.account}</td>
                <td class="text-c">${p.realname}</td>
                <td class="text-c"><#if p.ispublic=='1'>是<#else>否 </#if></td>
                <td class="text-c">${p.gmtCreate?string('yyyy-MM-dd HH:mm:ss')}</td>
                <td class="td-manage">
                   <#-- <a style="text-decoration:none" onClick="picture_stop(this,'10001')" href="javascript:;" title="下架"><i class="Hui-iconfont">&#xe6de;</i></a>
                    <a style="text-decoration:none" class="ml-5" onClick="picture_edit('图库编辑','add-settlement-account.ftl.','10001')" href="javascript:;" title="编辑"><i class="Hui-iconfont">&#xe6df;</i></a>-->
                    <a style="text-decoration:none" class="ml-5" onClick="picture_del(this,'${p.id}','${p.userid}',<#if p.settlementid ??>'${p.settlementid}'</#if>)" href="javascript:;" title="删除"><i class="Hui-iconfont">&#xe6e2;</i></a></td>
            </tr>
           </#list>
           </#if>
            </tbody>
        </table>
    </div>

</div>

<#include "commons/_footer.ftl">
<!--请在下方写此页面业务相关的脚本-->
<script type="text/javascript" src="../static/lib/My97DatePicker/4.8/WdatePicker.js"></script>
<script type="text/javascript" src="../static/lib/datatables/1.10.0/jquery.dataTables.min.js"></script>
<script type="text/javascript" src="../static/lib/laypage/1.2/laypage.js"></script>
<script type="text/javascript">
    $('.table-sort').dataTable({
       // "aaSorting": [[ 1, "desc" ]],//默认第几个排序
        "bStateSave": true,//状态保存
        "aoColumnDefs": [
            //{"bVisible": false, "aTargets": [ 3 ]}, //控制列的隐藏显示
            {"orderable":false,"aTargets":[0,8]}// 制定列不参与排序
        ]
    });
    /*图片-删除*/
    function picture_del(obj,id,userid,settlementid){
        //alert(settlementid)
        layer.confirm('确认要删除吗？',function(index){
            $.ajax({
                type: 'POST',
                url: '../pay/deletesettleaccount',
                data:{"id":id,'userid':userid,'settlementid':settlementid},
                dataType: 'json',
                success: function(data){
                    if(data.code=='200'){
                        $(obj).parents("tr").remove();
                        layer.msg('已删除!',{icon:1,time:1000});
                    }else {
                        layer.msg('删除失败!',{icon:1,time:1000});
                    }
                },
                error:function(data) {
                    layer.msg('服务器异常!',{icon:1,time:1000});
                    console.log(data.msg);
                },
            });
        });
    }
</script>
</body>
</html>