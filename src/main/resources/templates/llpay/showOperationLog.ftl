<!DOCTYPE HTML>
<html xmlns="http://www.w3.org/1999/html">
<head>
<#include "../commons/_jscommon.ftl">
<title>操作日志详情</title>
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
        </span>
        <#--<span class="r">
            共有数据：<strong>54</strong> 条</span>-->
    </div>
    <div class="mt-20">
        <table class="table table-border table-bordered table-bg table-hover table-sort">
            <thead>
            <tr>
                <th scope="col" colspan="13">操作日志列表</th>
            </tr>

            <tr class="text-c">
                <th width="50"><input name="" type="checkbox" value=""></th>

                <th width="50">操作人员</th>
                <th width="150">操作日期</th>
                <th width="100">单号</th>
                <th width="100">单据类型</th>
                <th width="100">平台企业名称 </th>
                <th width="50">是否对接</th>
                <th width="50">发送wms的信息</th>
                <th width="50">WMS返回结果</th>
            </tr>
            </thead>
            <tbody>
           <#if list?exists>
           <#list list as p>
           <tr class="text-c">
               <td><input name="" type="checkbox" value=""></td>

               <td class="text-c"><#if p.operationuser??>${p.operationuser}</#if></td>
               <td class="text-c"> <#if p.operationdate??>${p.operationdate}</#if></td>
               <td class="text-c"><#if p.ticketno??>${p.ticketno}</#if></td>
               <td class="text-c"><#if p.ordertype??>${p.ordertype}</#if></td>
               <td class="text-c"><#if p.enterprisename??>${p.enterprisename}</#if></td>
               <td class="text-c"><#if p.flag??>${p.flag}</#if></td>
           <#--<td class="text-c"><#if p.refundstatus=='S'>成功<#else>失败 </#if></td>-->
               <td class="text-c"><#if p.responsemesg??>${p.responsemesg}</#if></td>
               <td class="text-c"><#if p.requestmesg??>${p.requestmesg}</#if></td>
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
    $('.table').dataTable({

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