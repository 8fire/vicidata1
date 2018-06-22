package com.csjscm.mysqldata.dao;

import com.csjscm.mysqldata.model.ScheduleJob;
import java.util.List;
import java.util.Map;

public interface SchelduleJobMapper {
    /**
     * 查询所有
     * @return
     */
    List<ScheduleJob> queryForDetail();

    int updateForScheduleJobById(Map<String,Object> map);

    int insert(ScheduleJob scheduleJob);

    int insertSelective(ScheduleJob scheduleJob);

    List<ScheduleJob> queryForScheduleJobByWhere(ScheduleJob scheduleJob);

    int deleteByPrimaryKey(Integer id);

}