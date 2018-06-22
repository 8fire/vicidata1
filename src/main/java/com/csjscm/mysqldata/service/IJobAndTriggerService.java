package com.csjscm.mysqldata.service;

import com.csjscm.mysqldata.model.JobAndTrigger;
import com.csjscm.mysqldata.model.ScheduleJob;

import java.util.List;
import java.util.Map;

/**
 * @author csjscm
 * create 2018-05-08 下午 2:55
 **/
public interface IJobAndTriggerService {
    List<JobAndTrigger> getJobAndTriggerDetails();

    Map<String,Object> queryForAll();

    int updateForScheduleJobById(Map<String,Object> map);

    int insert(ScheduleJob scheduleJob);

    int insertSelective(ScheduleJob scheduleJob);

    Map<String,Object> queryForScheduleJobByWhere(ScheduleJob scheduleJob);

    int deleteByPrimaryKey(Integer id);
}
