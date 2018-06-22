package com.csjscm.mysqldata.service;

import com.csjscm.mysqldata.model.SettleAccount;

import java.util.Map;


public interface PingPayService {
     String createSettleAccount(SettleAccount settleAccount);
     Map<String,Object> showSettleAccount();
     String deleteSettleAccount(SettleAccount settleAccount);
     Map<String,Object> showBidRefundLogs();
     Map<String,Object>  showCabinetOnlinePay();
}