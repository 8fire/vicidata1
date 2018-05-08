<!DOCTYPE HTML>
<html xmlns="http://www.w3.org/1999/html">
<head>
<#include "../commons/_jscommon.ftl">
<title>分润账户详情</title>
    <script>
        function excelOut() {
            window.location.href="../pay/excelOutRefundLogs.html";
        }
    </script>
</head>

<body>
<div class="page-container">
    <div class="cl pd-5 bg-1 bk-gray mt-20">
        <span class="l">
            <a href="javascript:;" onclick="excelOut()" class="btn btn-danger radius"><i class="Hui-iconfont">&#xe641;</i>导出Excel</a>
            <#--<a href="javascript:;" onclick="admin_add('添加管理员','admin-add.html','800','500')" class="btn btn-primary radius">
                <i class="Hui-iconfont">&#xe600;</i> 添加管理员</a>-->
        </span>
        <span class="r">
            共有数据：<strong>54</strong> 条</span>
    </div>
    <div class="mt-20">
        <table class="table table-border table-bordered table-bg table-hover table-sort">
            <thead>
            <tr>
                <th scope="col" colspan="13">柜机在线支付列表</th>
            </tr>
            <tr class="text-c">
                <th width="50"><input name="" type="checkbox" value=""></th>
                <th width="150">商户名称</th>
                <th width="150">商户订单号</th>
                <th width="200">商品信息</th>
                <th width="50">交易手续费</th>
                <th width="50">交易金额</th>
                <th width="100">交易日期</th>
                <th width="150">交易时间</th>
                <th width="100">支付结果</th>
                <th width="100">支付类型</th>
                <th width="100">Ping++订单号</th>
                <th width="50">花呗分期数</th>
                <th width="50">CSJ分润金额</th>
                <th width="50">客户分润金额</th>
            </tr>
            </thead>
            <tbody>
           <#if list?exists>
           <#list list as p>
           <tr class="text-c">
               <td><input name="" type="checkbox" value=""></td>
               <td class="text-c"><#if p.merchantname??>${p.merchantname}</#if></td>
               <td class="text-c"><#if p.merchantseq??>${p.merchantseq}</#if></td>
               <td class="text-c"> <#if p.orderinfo??>${p.orderinfo}</#if></td>
               <td class="text-c"><#if p.fee??>${p.fee}</#if></td>
               <td class="text-c"><#if p.amount??>${p.amount}</#if></td>
               <td class="text-c"><#if p.transdate??>${p.transdate}</#if></td>
               <td class="text-c"><#if p.transtime??>${p.transtime}</#if></td>
           <#--<td class="text-c"><#if p.refundstatus=='S'>成功<#else>失败 </#if></td>-->
               <td class="text-c"><#if p.tradestatus??>${p.tradestatus}</#if></td>
               <td class="text-c"><#if p.selecttradetype??>${p.selecttradetype}</#if></td>
               <td class="text-c"><#if p.pingorderid??>${p.pingorderid}</#if></td>
               <td class="text-c"><#if p.hbfqnum??>${p.hbfqnum}</#if></td>
               <td class="text-c"><#if p.csjroyalityamount??>${p.csjroyalityamount}</#if></td>
               <td class="text-c"><#if p.cusroyalityamount??>${p.cusroyalityamount}</#if></td>


               <#-- <a style="text-decoration:none" onClick="picture_stop(this,'10001')" href="javascript:;" title="下架"><i class="Hui-iconfont">&#xe6de;</i></a>
                <a style="text-decoration:none" class="ml-5" onClick="picture_edit('图库编辑','add-settlement-account.ftl.','10001')" href="javascript:;" title="编辑"><i class="Hui-iconfont">&#xe6df;</i></a>-->
                    <#--<a style="text-decoration:none" class="ml-5" onClick="picture_del(this,'${p.id}')" href="javascript:;" title="删除"><i class="Hui-iconfont">&#xe6e2;</i></a></td>-->
           </tr>

           </#list>
           </#if>
            </tbody>
        </table>
    </div>

</div>

<#include "../commons/_footer.ftl">
<!--请在下方写此页面业务相关的脚本-->
<script type="text/javascript" src="../../static/lib/My97DatePicker/4.8/WdatePicker.js"></script>
<script type="text/javascript" src="../../static/lib/datatables/1.10.0/jquery.dataTables.min.js"></script>
<script type="text/javascript" src="../../static/lib/laypage/1.2/laypage.js"></script>
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