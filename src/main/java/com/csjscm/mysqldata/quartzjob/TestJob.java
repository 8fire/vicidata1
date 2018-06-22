package com.csjscm.mysqldata.quartzjob;

import lombok.extern.slf4j.Slf4j;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import java.util.Date;

/**
 * @author csjscm
 * create 2018-05-08 下午 2:37
 **/
@Slf4j
public class TestJob implements BaseJob {
    public TestJob(){

    }

    @Override
    public void execute(JobExecutionContext context) throws JobExecutionException {
        log.info("这个测试job的执行时间"+new Date());
    }
}
