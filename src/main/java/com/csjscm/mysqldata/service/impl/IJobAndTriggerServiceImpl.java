package com.csjscm.mysqldata.service.impl;

import com.google.common.collect.Maps;
import com.csjscm.mysqldata.dao.JobAndTriggerMapper;
import com.csjscm.mysqldata.dao.SchelduleJobMapper;
import com.csjscm.mysqldata.model.JobAndTrigger;
import com.csjscm.mysqldata.model.ScheduleJob;
import com.csjscm.mysqldata.service.IJobAndTriggerService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @author csjscm
 * create 2018-05-08 下午 2:57
 **/
@Service
public class IJobAndTriggerServiceImpl implements IJobAndTriggerService{
    @Resource
    JobAndTriggerMapper jobAndTriggerMapper;
    @Resource
    SchelduleJobMapper schelduleJobMapper;

    @Override
    public List<JobAndTrigger> getJobAndTriggerDetails() {
        List<JobAndTrigger> jobAndTriggers = jobAndTriggerMapper.getJobAndTriggerDetails();
        if(jobAndTriggers.size()>0){
            return jobAndTriggers;
        }else {
            return null;
        }

    }

    /**
     * 查询所有的定时任务
     * @return
     */
    @Override
    public Map<String, Object> queryForAll() {
        Map<String,Object> map= Maps.newHashMap();
        List<ScheduleJob> scheduleJobs = schelduleJobMapper.queryForDetail();
        if (scheduleJobs.size()>0){
            map.put("status",0);
            map.put("scheduleJobs",scheduleJobs);
        }else {
            map.put("status",-1);
        }
        return  map;
    }

    /**
     * 根据条件查询
     * @param scheduleJob
     * @return
     */
    @Override
    public Map<String,Object> queryForScheduleJobByWhere(ScheduleJob scheduleJob) {
        Map<String,Object> map= Maps.newHashMap();
        List<ScheduleJob> scheduleJobs = schelduleJobMapper.queryForScheduleJobByWhere(scheduleJob);
        if (scheduleJobs.size()>0){
            map.put("status",0);
            map.put("scheduleJobs",scheduleJobs);
        }else {
            map.put("status",-1);
        }
        return  map;
    }

    /**
     * 根据ID删除
     * @param id
     * @return
     */
    @Override
    public int deleteByPrimaryKey(Integer id) {
        return schelduleJobMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(ScheduleJob scheduleJob) {
        return schelduleJobMapper.insert(scheduleJob);
    }

    @Override
    public int insertSelective(ScheduleJob scheduleJob) {
        return schelduleJobMapper.insertSelective(scheduleJob);
    }

    /**
     * 修改
     * @param map
     * @return
     */
    @Override
    public int updateForScheduleJobById(Map<String, Object> map) {
        return schelduleJobMapper.updateForScheduleJobById(map);
    }
}
