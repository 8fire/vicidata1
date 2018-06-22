package com.csjscm.mysqldata.model;



import java.io.Serializable;
import java.util.Date;

/**
 * 定时任务日志表
 *
 * @author csjscm
 * create 2018-05-09 上午 8:33
 **/

public class ScheduleJob implements Serializable {
    private Integer id;
    private String jobName;
    private String jobGroup;
    private Integer jobStatus;//定时任务状态 0禁用 1 启用
    private Integer auditStatus;
    private String cronExpression;
    private String quartzClass;
    private String description;
    private Date gmt_create;
    private Date gmt_modified;
    private String dateMin;
    private String dateMax;

    public String getDateMin() {
        return dateMin;
    }

    public void setDateMin(String dateMin) {
        this.dateMin = dateMin;
    }

    public String getDateMax() {
        return dateMax;
    }

    public void setDateMax(String dateMax) {
        this.dateMax = dateMax;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public String getJobGroup() {
        return jobGroup;
    }

    public void setJobGroup(String jobGroup) {
        this.jobGroup = jobGroup;
    }

    public Integer getJobStatus() {
        return jobStatus;
    }

    public void setJobStatus(Integer jobStatus) {
        this.jobStatus = jobStatus;
    }

    public Integer getAuditStatus() {
        return auditStatus;
    }

    public void setAuditStatus(Integer auditStatus) {
        this.auditStatus = auditStatus;
    }

    public String getCronExpression() {
        return cronExpression;
    }

    public void setCronExpression(String cronExpression) {
        this.cronExpression = cronExpression;
    }

    public String getQuartzClass() {
        return quartzClass;
    }

    public void setQuartzClass(String quartzClass) {
        this.quartzClass = quartzClass;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getGmt_create() {
        return gmt_create;
    }

    public void setGmt_create(Date gmt_create) {
        this.gmt_create = gmt_create;
    }

    public Date getGmt_modified() {
        return gmt_modified;
    }

    public void setGmt_modified(Date gmt_modified) {
        this.gmt_modified = gmt_modified;
    }
}
