package com.csjscm.mysqldata.quartzjob;

import com.csjscm.mysqldata.service.UserRegisterService;
import lombok.extern.slf4j.Slf4j;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

@Slf4j
public class RegisterJob implements BaseJob {

    @Autowired
    private UserRegisterService userRegisterService;



  public RegisterJob(){ }

    @Override
    public void execute(JobExecutionContext context) throws JobExecutionException {
        userRegisterService.registerJob();
        log.info("这个RegisterJob的执行时间"+new Date());
    }
}
