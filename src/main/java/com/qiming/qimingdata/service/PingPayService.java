package com.qiming.qimingdata.service;

import com.qiming.qimingdata.model.SettleAccount;

import java.util.Map;


public interface PingPayService {
     String createSettleAccount(SettleAccount settleAccount);
     Map<String,Object> showSettleAccount();
     String deleteSettleAccount(SettleAccount settleAccount);
     Map<String,Object> showBidRefundLogs();
}