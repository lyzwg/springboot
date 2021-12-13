package com.zjy.springboot.xxlJob;

//  created by zjy on 2021/12/12 19:50

import com.xxl.job.core.handler.IJobHandler;
import com.xxl.job.core.handler.annotation.XxlJob;
import org.springframework.stereotype.Component;

@Component
public class DemoJob extends IJobHandler {

    @XxlJob(value = "demoJobHandler")
    @Override
    public void execute() throws Exception {
        System.out.println("执行了定时任务");
    }
}
