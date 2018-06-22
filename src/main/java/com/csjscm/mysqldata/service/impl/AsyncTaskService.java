package com.csjscm.mysqldata.service.impl;

import com.vici.response.MsgResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.Random;

/**
 * 线程任务执行任务类
 *
 * @author csjscm
 * create 2018-05-24 上午 10:25
 **/
@Service
@Slf4j
public class AsyncTaskService {
    Random random=new Random();
    @Async
    public void executeAsyncTask(Object i){
        if(i  instanceof MsgResponse){
          log.info("===========执行异步任务===============>"+((MsgResponse) i).getCode());
        }else {
            log.info("======执行异步任务=======>"+i);
        }

    }

}
