package com.qiming.qimingdata.service.impl;

import com.google.common.collect.Maps;
import com.pingplusplus.Pingpp;
import com.pingplusplus.model.DeletedSettleAccount;
import com.qiming.config.payconfig.PingConfig;
import com.qiming.oracledata.dao.BidRefundLogsMapper;
import com.qiming.oracledata.model.BidRefundLogs;
import com.qiming.oracledata.model.BidRefundLogsExample;
import com.qiming.qimingdata.dao.SettleAccountMapper;
import com.qiming.qimingdata.model.SettleAccount;
import com.qiming.qimingdata.model.SettleAccountExample;
import com.qiming.qimingdata.service.PingPayService;
import com.vici.UUIDUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * ping++支付相关service
 *
 * @author qiming
 * create 2018-03-19 上午 8:31
 **/
@Slf4j
@Service
public class PingPayServiceImpl implements PingPayService {
    @Resource
    private SettleAccountMapper settleAccountMapper;
    @Resource
    private BidRefundLogsMapper bidRefundLogsMapper;
    @Override
    public String createSettleAccount(SettleAccount settleAccount) {
        Pingpp.apiKey=PingConfig.APIKEY;
        Pingpp.privateKey=PingConfig.PRIVATEKEY;
        Pingpp.appId= PingConfig.APPID;
        String userid=settleAccount.getUserid();
        Map<String, Object> params=new HashMap<>();
        params.put("channel", "alipay");
        Map<String, Object> recipient=new HashMap<>();
        recipient.put("account", settleAccount.getAccount());//支付宝账户
        recipient.put("name", settleAccount.getRealname());//支付宝名字
        String ispublic= settleAccount.getIspublic();
        if(("on").equals(ispublic)){
            settleAccount.setIspublic("1");//对公账户
            recipient.put("type", "b2b");
        }else {
            settleAccount.setIspublic("0");
            recipient.put("type", "b2c");
        }
        params.put("recipient", recipient);

        try {
           com.pingplusplus.model.SettleAccount obj= com.pingplusplus.model.SettleAccount.create(userid,params);
           settleAccount.setSettlementid(obj.getId());
           settleAccount.setChannel(obj.getChannel());
           settleAccount.setPingobject(obj.getObject());
           settleAccount.setId(UUIDUtils.getUUID());
           settleAccount.setGmtCreate(new Date());
           int row= settleAccountMapper.insertSelective(settleAccount);
            if(row>0){
                log.info("==========settlementaccount插入数据成功===============>"+obj.toString());
                return "0";
            }else {
                log.info("==============settlementaccount插入数据失败========================>");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "-1";
    }

    @Override
    public Map<String,Object> showSettleAccount() {
        Map<String,Object> map= Maps.newHashMap();
        SettleAccountExample settleAccountExample=new SettleAccountExample();
        settleAccountExample.createCriteria().andIsdeleteEqualTo(0);
        List<SettleAccount> settleAccounts = settleAccountMapper.selectByExample(settleAccountExample);
        if(settleAccounts.size()>0){
            map.put("status","0");
            map.put("settleAccounts",settleAccounts);
        }else {
            map.put("status","-1");
        }
        return map;
    }

    /**
     * 删除
     * @param settleAccount
     * @return
     */
    @Override
    public String deleteSettleAccount(SettleAccount settleAccount) {
        SettleAccountExample settleAccountExample=new SettleAccountExample();
        settleAccount.setIsdelete(-1);
        SettleAccountExample.Criteria criteria = settleAccountExample.createCriteria().andIdEqualTo(settleAccount.getId());
        Pingpp.apiKey=PingConfig.APIKEY;
        Pingpp.privateKey=PingConfig.PRIVATEKEY;
        Pingpp.appId= PingConfig.APPID;
            try {
                DeletedSettleAccount deletedSettleAccount = com.pingplusplus.model.SettleAccount.delete(settleAccount.getUserid(), settleAccount.getSettlementid());
                log.info("====deletedSettleAccount===>"+deletedSettleAccount);
                int i = settleAccountMapper.updateByExampleSelective(settleAccount, settleAccountExample);
                if(i>0){
                    log.info("======删除成功======>");
                    return "0";
                }else {
                    return "-1";
                }
            }catch (Exception e){
               log.info("==============>"+e.getMessage());
               return "-1";
            }
    }


    /**
     * 查询所有的退款日志
     * @return
     */
    @Override
    public Map<String, Object> showBidRefundLogs() {
        Map<String,Object> map= Maps.newHashMap();
        BidRefundLogsExample bidRefundLogsExample=new BidRefundLogsExample();
        List<BidRefundLogs> bidRefundLogs = bidRefundLogsMapper.selectByExample(bidRefundLogsExample);
        if(bidRefundLogs.size()>0&& !("").equals(bidRefundLogs)){
            map.put("status","0");
            map.put("bidRefundLogs",bidRefundLogs);
        }else {
            map.put("status","-1");
        }
        return map;
    }
}
