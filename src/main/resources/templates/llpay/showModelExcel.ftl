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
    </div>
    <div class="mt-20">
        <table class="table table-border table-bordered table-bg table-hover table-sort">
            <thead>
            <tr>
                <th scope="col" colspan="19">操作日志列表</th>
            </tr>
            <tr class="text-c">
                <th width="50"><input name="" type="checkbox" value=""></th>
                <th width="100">企业名称</th>
                <th width="50">表头行数</th>
                <th width="150">表头内容</th>
                <th width="150">表尾行数</th>
                <th width="50">序号</th>
                <th width="100">客户物料编码</th>
                <th width="50">小分类</th>
                <th width="50">规格 </th>
                <th width="50">型号</th>
                <th width="50">品牌</th>
                <th width="50">单位</th>
                <th width="50">供应商名称</th>
                <th width="50">质保期</th>
                <th width="50">供货期</th>
                <th width="50">备注</th>
                <th width="50">文件路径</th>
                <th width="100">操作</th>
            </tr>
            </thead>
            <tbody>
           <#if list?exists>
           <#list list as p>
           <tr class="text-c">
               <td><input name="" type="checkbox" value=""></td>
               <td class="text-c"><#if p.enterpriceName??>${p.enterpriceName}</#if></td>
               <td class="text-c"> <#if p.headno??>${p.headno}</#if></td>
               <td class="text-c"><#if p.headinfo??>${p.headinfo}</#if></td>
               <td class="text-c"><#if p.tailno??>${p.tailno}</#if></td>
               <td class="text-c"><#if p.itemno??>${p.itemno}</#if></td>
               <td class="text-c"><#if p.custommaterialno??>${p.custommaterialno}</#if></td>
               <td class="text-c"><#if p.categoryname??>${p.categoryname}</#if></td>
               <td class="text-c"><#if p.materialrule??>${p.materialrule}</#if></td>
               <td class="text-c"><#if p.materialsize??>${p.materialsize}</#if></td>
               <td class="text-c"><#if p.materialtag??>${p.materialtag}</#if></td>
               <td class="text-c"><#if p.orderunit??>${p.orderunit}</#if></td>
               <td class="text-c"><#if p.servicername??>${p.servicername}</#if></td>
               <td class="text-c"><#if p.warrantydate??>${p.warrantydate}</#if></td>
               <td class="text-c"><#if p.supplydate??>${p.supplydate}</#if></td>
               <td class="text-c"><#if p.memos??>${p.memos}</#if></td>
               <td class="text-c"><#if p.fileurl??>${p.fileurl}</#if></td>
               <td class="td-manage">
               <#-- <a style="text-decoration:none" onClick="picture_stop(this,'10001')" href="javascript:;" title="下架"><i class="Hui-iconfont">&#xe6de;</i></a>
                <a style="text-decoration:none" class="ml-5" onClick="picture_edit('图库编辑','add-settlement-account.ftl.','10001')" href="javascript:;" title="编辑"><i class="Hui-iconfont">&#xe6df;</i></a>-->
                   <a style="text-decoration:none" class="ml-5" onClick="picture_del(this,'${p.id}')" href="javascript:;" title="删除"><i class="Hui-iconfont">&#xe6e2;</i></a></td>
               <td></td>
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
    function picture_del(obj,id){
        layer.confirm('确认要删除吗？',function(index){
            $.ajax({
                type: 'POST',
                url: 'http://192.168.2.34:8082/api/modelExcel/delete',
                data:{"id":id},
                dataType: 'application/json;charset=utf-8',
                success: function(data){
                    if(data.code=='200'){
                        $(obj).parents("tr").remove();
                        layer.msg(,{icon:1,time:1000});
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