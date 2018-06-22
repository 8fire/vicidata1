package com.csjscm.mysqldata.dao;

import com.csjscm.mysqldata.model.JobAndTrigger;
import java.util.List;


public interface JobAndTriggerMapper {

    List<JobAndTrigger> getJobAndTriggerDetails();

}