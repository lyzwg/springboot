package com.zjy.springboot.service;

//  created by zjy on 2021/12/5 19:41

import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class AsyncServiceImpl implements AsyncService {

//    @Resource
//    private ThreadPoolTaskExecutor executor;

    @SneakyThrows
    @Async("myAsync")
    @Override
    public void testAsync() {
        int i = Runtime.getRuntime().availableProcessors();
        log.info("最大并行可以执行的线程数的API:"+i);
        Thread.sleep(5000);
        log.info(Thread.currentThread().getName()+" 5秒异步任务结束");
    }
}
