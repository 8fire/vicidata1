package com.csjscm.mysqldata.controller.paycontroller;
import com.google.common.collect.Maps;
import com.csjscm.oracledata.model.BidRefundLogs;
import com.csjscm.oracledata.model.ModelExecl;
import com.csjscm.oracledata.model.OperationLog;
import com.csjscm.oracledata.model.OperationLogDTO;
import com.csjscm.mysqldata.model.SettleAccount;
import com.csjscm.mysqldata.service.PingPayService;
import com.csjscm.mysqldata.service.impl.OperationLogServiceImpl;
import com.csjscm.mysqldata.service.impl.RedisServiceImpl;
import com.vici.DateUtils;
import com.vici.response.ExportExcel;
import com.vici.response.MsgResponse;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Demo class
 *
 * @author qimingjin
 * @date 2018/1/8
 */
@RequestMapping("/pay")
@EnableAutoConfiguration
@RestController
@Slf4j
@Api(value = "pay",consumes = "application/json",produces = "application/json",protocols = "http")
public class PingPayController {

    @Autowired
    private PingPayService pingPayService;
    @Autowired
    private RedisServiceImpl redisService ;
    @Autowired
    private OperationLogServiceImpl operationLogService;


    @RequestMapping(value = "/createsettleaccount",method = RequestMethod.GET)
    public ModelAndView createsettleaccount(){

        return new ModelAndView("login");
    }

    /**
     * 后台登录
     * @return
     */
    @RequestMapping(value = "/backlogin",method = RequestMethod.POST)
    public ModelAndView backLogin(){
        return new ModelAndView("");
    }

    @RequestMapping(value = "/pay",method = RequestMethod.GET)
    public ModelAndView pingPay(){
        System.out.println("pay=====>zhege ");
        return new ModelAndView("picture-list");
    }

    /**
     * 跳转到添加分润账户
     * @return
     */
    @RequiresPermissions("pay:addSettlementAccount")
    @RequestMapping(value = "/add-settlement-account",method = RequestMethod.GET)
    public ModelAndView pictureShow(){
        ModelAndView mv=new ModelAndView();
        String userid="CSJ"+DateUtils.todayYyyyMmDdHhMmSs();//生成分润ID
        mv.addObject("userid",userid.replaceAll("-","").replaceAll(":","").replaceAll(" ",""));
        mv.setViewName("add-settlement-account");
        return mv;
    }

    /**
     * 创建分润账户
     * @param settleAccount
     * @return
     */
    @RequiresPermissions("pay:addSettlementAccount")
    @RequestMapping(value = "/createsettleaccount",method = RequestMethod.POST)
    public MsgResponse createSettleAccount(SettleAccount settleAccount){
        System.out.println(settleAccount.getRealname()+"====>"+settleAccount.getIspublic()+"=========>"+settleAccount.getAccount());
        Map<String,Object> map= Maps.newHashMap();
       String result = pingPayService.createSettleAccount(settleAccount);
        if(result.equals("0")){
            map.put("view","picture-list");
            map.put("status","0");
            return  MsgResponse.success().add("data",map);
        }else{
            map.put("status","-1");
             log.info("插入数据失败");
             return MsgResponse.fail().add("data",map);
        }
    }

    /**
     * 查看分账账户详情
     * @return
     */
    @RequiresPermissions("pay:showSettlementAccount")
    @RequestMapping(value = "/show-settlement-account",method = RequestMethod.GET)
    public ModelAndView showSettleAccount(){
        ModelAndView modelAndView=new ModelAndView();
        Map<String, Object> map = pingPayService.showSettleAccount();
        String status = map.get("status").toString();
        if("0".equals(status)){
            modelAndView.addObject("list",map.get("settleAccounts"));
            modelAndView.setViewName("show-settlement-account");
        }else {
           modelAndView.addObject("list",map.get("settleAccounts"));
           modelAndView.setViewName("show-settlement-account");
        }
        return modelAndView;
    }

    /**
     * 删除分润账户
     * @param settleAccount
     * @return
     */
    @RequiresPermissions("pay:deleteSettlementAccount")
    @RequestMapping(value = "/deletesettleaccount",method = RequestMethod.POST)
    public MsgResponse deleteSettleAccount(SettleAccount settleAccount){
        System.out.println(settleAccount.getRealname()+"====>"+settleAccount.getIspublic()+"=========>"+settleAccount.getAccount());
        Map<String,Object> map= Maps.newHashMap();
        String result = pingPayService.deleteSettleAccount(settleAccount);
        if(result.equals("0")){
            map.put("view","picture-list");
            map.put("status","0");
            return  MsgResponse.success().add("data",map);
        }else{
            map.put("status","-1");
            log.info("删除数据失败");
            return MsgResponse.fail().add("data",map);
        }
    }

    /**
     * 查询退款日志
     * @return
     */
    @RequiresPermissions("pay:showBidRefundlogs")
    @RequestMapping(value = "/toShowBIdRefundLogs",method = RequestMethod.GET)
    public ModelAndView showBidRefundLogs(){
        ModelAndView modelAndView=new ModelAndView();
        Map<String, Object> map = pingPayService.showBidRefundLogs();
        String status = map.get("status").toString();
        if("0".equals(status)){
            modelAndView.addObject("list",map.get("bidRefundLogs"));
            redisService.set("bidRefundLogs",map.get("bidRefundLogs"));
            modelAndView.setViewName("llpay/showBidRefundLogs");
        }else {
            modelAndView.addObject("list",map.get("bidRefundLogs"));
            modelAndView.setViewName("llpay/showBidRefundLogs");
        }
        log.info("========================>"+map);
        return modelAndView;
    }

    /**
     * 导出excel
     * @return
     */
    @RequiresPermissions("pay:excelOutRefundLogs")
    @RequestMapping(value = "/excelOutRefundLogs",method = RequestMethod.GET)
    public String excelOutRefundLogs(HttpServletResponse response){
        Map<String, Object> map = pingPayService.showBidRefundLogs();
        List<BidRefundLogs> bidRefundLogs = (List<BidRefundLogs>)map.get("bidRefundLogs");
        Object bidRefundLogs1 = redisService.get("bidRefundLogs");
        String title="招投标退款日志";
        String[] rowsName={"行号","退款流水号","商户订单号","收款账户","付款账户","退款金额","退款状态","退款日期","退款时间"};
        Object[]  objs= null;
        List<Object[]> dataList=new ArrayList<Object[]>();
        for (int i = 0; i < bidRefundLogs.size(); i++) {
            BidRefundLogs brl = bidRefundLogs.get(i);
            objs = new Object[rowsName.length];
            objs[0] = i;
            objs[1] = brl.getNorefund();
            objs[2] = brl.getOrderno();
            objs[3] = brl.getInaccount();
            objs[4] = brl.getOutaccount();
            objs[5]=brl.getRefundmoney();
            String refundStatus = brl.getRefundstatus();
            if(refundStatus.equals("S")){
                objs[6]="成功";
            }else {
                objs[6]="失败";
            }
            objs[7]=brl.getRefunddate();
            objs[8]=brl.getRefundtime() ;
            dataList.add(objs);
        }
        ExportExcel ex = new ExportExcel(title, rowsName, dataList);
        try{
            ex.export(response);
        }catch (Exception e){
           e.getMessage();
        }
      return null;
    }

    /**
     * 查询柜机在线支付
     * @return
     */
    @RequiresPermissions("pay:showCabinetOnlinePay")
    @RequestMapping(value = "/toShowCabinetOnlinePay",method = RequestMethod.GET)
    public ModelAndView  ShowCabinetOnlinePay() {
        ModelAndView modelAndView = new ModelAndView();
        Map<String, Object> map = pingPayService.showCabinetOnlinePay();
        String status = map.get("status").toString();
        if("0".equals(status)){
            modelAndView.addObject("list",map.get("cabinetOnlinePays"));
            redisService.set("cabinetOnlinePays",map.get("cabinetOnlinePays"));
            modelAndView.setViewName("/llpay/showCabinetOnlinePays");
        }else {
            modelAndView.setViewName("/commons/404");
        }
        log.info("========================>"+map);
        return modelAndView;

   }
    /**
     * 查询工业品操作日志
     * @return
     */
    @RequiresPermissions("pay:showOperationLog")
    @RequestMapping(value = "/toShowOperationLog",method = RequestMethod.GET)
    public ModelAndView  toShowOperationLog() {
        ModelAndView modelAndView = new ModelAndView();
        OperationLogDTO operationLogDTO=new OperationLogDTO();
        List<OperationLog> operationLogs = operationLogService.selectOperationLogAll(operationLogDTO);
        modelAndView.addObject("list",operationLogs);
        redisService.set("cabinetOnlinePays",operationLogs);
        modelAndView.setViewName("/llpay/showOperationLog");
        return modelAndView;

    }
    /**
     * 查询企业模板
     * @return
     */
    @RequiresPermissions("pay:showModelExcel")
    @RequestMapping(value = "/toShowModelExcel",method = RequestMethod.GET)
    public ModelAndView  toShowModelExcel() {
        ModelAndView modelAndView = new ModelAndView();

        List<ModelExecl> modelExcelAll = operationLogService.findModelExcelAll();
        modelAndView.addObject("list",modelExcelAll);
        modelAndView.setViewName("/llpay/showModelExcel");
        return modelAndView;

    }
}
