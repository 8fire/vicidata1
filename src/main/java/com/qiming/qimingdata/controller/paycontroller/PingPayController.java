package com.qiming.qimingdata.controller.paycontroller;
import com.google.common.collect.Maps;
import com.qiming.qimingdata.model.SettleAccount;
import com.qiming.qimingdata.service.PingPayService;
import com.qiming.qimingdata.service.UserService;
import com.qiming.qimingdata.service.impl.RedisServiceImpl;
import com.vici.AppDateMgr;
import com.vici.response.MsgResponse;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
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
    private UserService userService;
    @Autowired
    private PingPayService pingPayService;
    @Autowired
    private RedisServiceImpl redisService ;




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
    @RequestMapping(value = "/add-settlement-account",method = RequestMethod.GET)
    public ModelAndView pictureShow(){
        ModelAndView mv=new ModelAndView();
        String userid="CSJ"+AppDateMgr.todayYyyyMmDdHhMmSs();//生成分润ID
        mv.addObject("userid",userid.replaceAll("-","").replaceAll(":","").replaceAll(" ",""));
        mv.setViewName("add-settlement-account");
        return mv;
    }

    /**
     * 创建分润账户
     * @param settleAccount
     * @return
     */

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
     * 创建分润账户
     * @param settleAccount
     * @return
     */

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
    @RequestMapping(value = "/toShowBIdRefundLogs",method = RequestMethod.GET)
    public ModelAndView showBidRefundLogs(){
        ModelAndView modelAndView=new ModelAndView();
        Map<String, Object> map = pingPayService.showBidRefundLogs();
        String status = map.get("status").toString();
        redisService.set("ceshi","123");
        if("0".equals(status)){
            modelAndView.addObject("list",map.get("bidRefundLogs"));
            modelAndView.setViewName("llpay/showBidRefundLogs");
        }else {
            modelAndView.addObject("list",map.get("bidRefundLogs"));
            modelAndView.setViewName("llpay/showBidRefundLogs");
        }
        log.info("========================>"+map);
        return modelAndView;
    }

}
