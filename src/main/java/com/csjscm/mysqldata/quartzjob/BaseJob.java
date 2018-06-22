package com.csjscm.mysqldata.quartzjob;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
/**
 * @author csjscm
 * create 2018-05-08 下午 2:36
 **/
public interface BaseJob extends Job {
    public void execute(JobExecutionContext context) throws JobExecutionException;
}
