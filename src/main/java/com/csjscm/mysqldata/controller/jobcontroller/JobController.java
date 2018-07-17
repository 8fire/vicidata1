package com.csjscm.mysqldata.controller.jobcontroller;

import java.util.Date;
import java.util.List;
import java.util.Map;

import com.google.common.collect.Maps;
import com.csjscm.mysqldata.model.JobAndTrigger;
import com.csjscm.mysqldata.model.ScheduleJob;
import com.csjscm.mysqldata.quartzjob.BaseJob;
import com.csjscm.mysqldata.service.IJobAndTriggerService;
import com.vici.StringUtils;
import com.vici.response.MsgResponse;
import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.quartz.CronScheduleBuilder;
import org.quartz.CronTrigger;
import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.JobKey;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.TriggerBuilder;
import org.quartz.TriggerKey;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;


/**
 * 定时任务
 *
 * @author csjscm
 * create 2018-05-08 下午 2:41
 **/
@RestController
@RequestMapping(value = "job")
@Slf4j
public class JobController {
    //加入Qulifier注解，通过名称注入bean
    @Autowired @Qualifier("Scheduler")
    private Scheduler scheduler;
    @Autowired
    private IJobAndTriggerService iJobAndTriggerService;

    @RequiresPermissions("quartz:add")
    @GetMapping(value="/toAddJob")
    public ModelAndView toAddJob()
    {
        return new ModelAndView("/quartzjob/job-add");
    }

    /**
     * 跳转到任务编辑
     * @param id
     * @return
     */
    @RequiresPermissions("quartz:update")
    @GetMapping(value = "/tojob-edit")
    public ModelAndView toJobEdit(@RequestParam(value = "id") Integer id ){
        ModelAndView modelAndView=new ModelAndView();
        ScheduleJob scheduleJob=new ScheduleJob();
        scheduleJob.setId(id);
        Map<String, Object> map = iJobAndTriggerService.queryForScheduleJobByWhere(scheduleJob);
        int status= (int)map.get("status");
        if(status==0){
           modelAndView.addObject("list",map.get("scheduleJobs"));
           modelAndView.setViewName("/quartzjob/job-edit");
           return  modelAndView;
        }else {
           modelAndView.setViewName("/commons/404");
           return modelAndView;
        }

    }
    /**
     * 添加任务
     * @param jobClassName 定时任务类名
     * @param jobGroupName 定时任务分组
     * @param cronExpression 定时任务表达式
     * @throws Exception
     */
    @RequiresPermissions("quartz:add")
    @Transactional(value = "mysqlTranscationManager",rollbackFor = Exception.class)
    @PostMapping(value="/addjob")
    public MsgResponse addjob(@RequestParam(value="jobClassName",required = false)String jobClassName,
                      @RequestParam(value="jobGroupName",required = false)String jobGroupName,
                      @RequestParam(value="cronExpression",required = false)String cronExpression,
                      @RequestParam(value="description",required = false)String description,
                      @RequestParam(value="jobname",required = false)String jobname                                                                   )
    {
       try {
           addJob(jobClassName, jobGroupName, cronExpression);
           ScheduleJob scheduleJob=new ScheduleJob();
           scheduleJob.setCronExpression(cronExpression);
           scheduleJob.setDescription(description);
           scheduleJob.setGmt_create(new Date());
           scheduleJob.setJobStatus(1);//初始状态为启用
           scheduleJob.setAuditStatus(0);
           scheduleJob.setJobGroup(jobGroupName);
           scheduleJob.setJobName(jobname);
           scheduleJob.setQuartzClass(jobClassName);
           int i = iJobAndTriggerService.insertSelective(scheduleJob);
           return i>0? MsgResponse.success():MsgResponse.fail();
       }catch (Exception e){
           log.error(e.getMessage(),e);
           log.info("=======添加任务报错========>"+e.getMessage());
           return MsgResponse.fail();
       }

    }

    public void addJob(String jobClassName, String jobGroupName, String cronExpression)throws Exception{

        // 启动调度器
        scheduler.start();
        //构建job信息
        JobDetail jobDetail = JobBuilder.newJob(getClass(jobClassName).getClass()).withIdentity(jobClassName, jobGroupName).build();
        //表达式调度构建器(即任务执行的时间)
        CronScheduleBuilder scheduleBuilder = CronScheduleBuilder.cronSchedule(cronExpression);
        //按新的cronExpression表达式构建一个新的trigger
        CronTrigger trigger = TriggerBuilder.newTrigger().withIdentity(jobClassName, jobGroupName)
                .withSchedule(scheduleBuilder).build();
        try {
            scheduler.scheduleJob(jobDetail, trigger);
        } catch (SchedulerException e) {
            log.info("=====创建定时任务失败========>"+e);
            throw new Exception("创建定时任务失败");
        }
    }

    /**
     * 暂停任务
     * @param jobClassName
     * @param jobGroupName
     * @throws Exception
     */
    @RequiresPermissions("quartz:pause")
    @Transactional(value = "mysqlTranscationManager",rollbackFor = Exception.class)
    @PostMapping(value="/pauseJob")
    public MsgResponse pauseJob(@RequestParam(value="jobClassName")String jobClassName,
                        @RequestParam(value="jobGroupName")String jobGroupName,
                        @RequestParam(value="id")Integer id )
    {
       try {
           this.jobPause(jobClassName, jobGroupName);
           Map<String,Object> map=Maps.newHashMap();
           map.put("id",id);
           //0是暂停任务
           map.put("jobstatus",0);
           int i = iJobAndTriggerService.updateForScheduleJobById(map);
           return i>0?MsgResponse.success():MsgResponse.fail();
       }catch (Exception e){
           log.error(e.getMessage(),e);
           return MsgResponse.fail();
       }
    }

    public void jobPause(String jobClassName, String jobGroupName) throws Exception
    {
        scheduler.pauseJob(JobKey.jobKey(jobClassName, jobGroupName));
    }

    /**
     * 恢复任务
     * @param jobClassName
     * @param jobGroupName
     * @throws Exception
     */
    @RequiresPermissions("quartz:resume")
    @Transactional(value = "mysqlTranscationManager",rollbackFor = Exception.class)
    @PostMapping(value="/resumeJob")
    public MsgResponse resumeJob(@RequestParam(value="jobClassName")String jobClassName,
                         @RequestParam(value="jobGroupName")String jobGroupName,
                         @RequestParam(value="id")Integer id)
    {
        try {
            this.jobresume(jobClassName, jobGroupName);
            Map<String,Object> map=Maps.newHashMap();
            map.put("id",id);
            map.put("jobstatus",1);
            int i = iJobAndTriggerService.updateForScheduleJobById(map);
            return i>0?MsgResponse.success():MsgResponse.fail();
        }catch (Exception e){
            log.error(e.getMessage(),e);
            return MsgResponse.fail();
        }
    }

    public void jobresume(String jobClassName, String jobGroupName) throws Exception
    {
        scheduler.resumeJob(JobKey.jobKey(jobClassName, jobGroupName));
    }

    /**
     * 更新任务
     * @param jobClassName
     * @param jobGroupName
     * @param cronExpression
     * @throws Exception
     */
    @Transactional(value = "mysqlTranscationManager",rollbackFor = Exception.class)
    @PostMapping(value="/reschedulejob")
    public MsgResponse rescheduleJob(@RequestParam(value="jobClassName")String jobClassName,
                             @RequestParam(value="jobGroupName")String jobGroupName,
                             @RequestParam(value="cronExpression")String cronExpression,
                             @RequestParam(value="id")Integer id,
                             @RequestParam(value="description",required = false)String description,
                             @RequestParam(value="jobname",required = false)String jobname  )
    {
        try {
                jobreschedule(jobClassName, jobGroupName, cronExpression);
                Map<String,Object> map=Maps.newHashMap();
                map.put("id",id);
                map.put("jobstatus",1);//开始状态
                map.put("jobname",jobname);
                map.put("description",description);
                map.put("cronexpression",cronExpression);
                map.put("jobgroup",jobGroupName);
                map.put("quartzclass",jobClassName);
                map.put("gmt_modified",new Date());
                int i= iJobAndTriggerService.updateForScheduleJobById(map);
                return i>0?MsgResponse.success():MsgResponse.fail();
        }catch (Exception e){
            log.error(e.getMessage(),e);
           return MsgResponse.fail();
        }

    }

    public void jobreschedule(String jobClassName, String jobGroupName, String cronExpression) throws Exception
    {
        try {
            TriggerKey triggerKey = TriggerKey.triggerKey(jobClassName, jobGroupName);
            // 表达式调度构建器
            CronScheduleBuilder scheduleBuilder = CronScheduleBuilder.cronSchedule(cronExpression);

            CronTrigger trigger = (CronTrigger) scheduler.getTrigger(triggerKey);

            // 按新的cronExpression表达式重新构建trigger
            trigger = trigger.getTriggerBuilder().withIdentity(triggerKey).withSchedule(scheduleBuilder).build();

            // 按新的trigger重新设置job执行
            scheduler.rescheduleJob(triggerKey, trigger);
        } catch (SchedulerException e) {
            log.info("======更新定时任务失败========>"+e);
            throw new Exception("更新定时任务失败");
        }
    }

    /**
     * 删除任务
     * @param jobClassName
     * @param jobGroupName
     * @throws Exception
     */
    @RequiresPermissions("quartz:delete")
    @Transactional(value = "mysqlTranscationManager",rollbackFor = Exception.class)
    @PostMapping(value="/deletejob")
    public MsgResponse deletejob(@RequestParam(value="jobClassName")String jobClassName,
                         @RequestParam(value="jobGroupName")String jobGroupName,
                         @RequestParam(value="id")Integer id )
    {
        try {
            int i = iJobAndTriggerService.deleteByPrimaryKey(id);
            jobdelete(jobClassName, jobGroupName);
            return i>0?MsgResponse.success():MsgResponse.fail();
        }catch (Exception e){
            log.info(e.getMessage(),e);
           return MsgResponse.fail();
        }
    }

    public void jobdelete(String jobClassName, String jobGroupName) throws Exception
    {
        scheduler.pauseTrigger(TriggerKey.triggerKey(jobClassName, jobGroupName));
        scheduler.unscheduleJob(TriggerKey.triggerKey(jobClassName, jobGroupName));
        scheduler.deleteJob(JobKey.jobKey(jobClassName, jobGroupName));
    }

    /**
     * 查询任务
     * @return
     */
    @RequiresPermissions("quartz:query")
    @GetMapping(value="/queryjob")
    public ModelAndView queryJob()
    {
        ModelAndView modelAndView=new ModelAndView();
        List<JobAndTrigger> jobAndTrigger = iJobAndTriggerService.getJobAndTriggerDetails();
        Map<String, Object> map = iJobAndTriggerService.queryForAll();
        int status= (int)map.get("status");
        if(status==0){
            //modelAndView.addObject("list",jobAndTrigger);
            modelAndView.addObject("list",map.get("scheduleJobs"));
            modelAndView.setViewName("/quartzjob/quartzjob-list");
        }else {
            modelAndView.setViewName("/quartzjob/quartzjob-list");
        }
        return modelAndView;
    }

    /**
     * 条件查询
     * @param datemin
     * @param datemax
     * @return
     */
    @PostMapping(value="/queryByWhereJob")
    public ModelAndView queryByWhereJob(@RequestParam(value="datemin") String datemin,
                                        @RequestParam(value="datemax") String datemax)
    {
        ModelAndView modelAndView=new ModelAndView();
        ScheduleJob scheduleJob=new ScheduleJob();
        if(StringUtils.isNotEmpty(datemin)){
            scheduleJob.setDateMin(datemin);
        }
        if(StringUtils.isNotEmpty(datemax)){
            scheduleJob.setDateMax(datemax);
        }
        Map<String, Object> map = iJobAndTriggerService.queryForScheduleJobByWhere(scheduleJob);
        int status= (int)map.get("status");
        if(status==0){
            //modelAndView.addObject("list",jobAndTrigger);
            modelAndView.addObject("list",map.get("scheduleJobs"));
            modelAndView.setViewName("/quartzjob/quartzjob-list");
        }else {
            modelAndView.setViewName("/quartzjob/quartzjob-list");
        }
        return modelAndView;
    }

    public static BaseJob getClass(String classname) throws Exception
    {
        Class<?> class1 = Class.forName(classname);
        return (BaseJob)class1.newInstance();
    }

}
