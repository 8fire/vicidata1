package com.qiming.oracledata.service.impl;

import com.google.common.collect.Maps;
import com.qiming.oracledata.dao.BidRefundLogsMapper;
import com.qiming.oracledata.model.BidRefundLogs;
import com.qiming.oracledata.model.BidRefundLogsExample;
import com.qiming.oracledata.service.PayRecordService;
import com.vici.AppStringUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @author qiming
 * create 2018-04-11 下午 2:22
 **/
@Service
public class PayRecordServiceimpl implements PayRecordService {

    @Resource
    private BidRefundLogsMapper bidRefundLogsMapper;

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
