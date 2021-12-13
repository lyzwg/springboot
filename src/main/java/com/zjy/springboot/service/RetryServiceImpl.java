package com.zjy.springboot.service;

//  created by zjy on 2021/12/7 21:31

import org.springframework.retry.annotation.Backoff;
import org.springframework.retry.annotation.Recover;
import org.springframework.retry.annotation.Retryable;
import org.springframework.stereotype.Service;

@Service
public class RetryServiceImpl implements RetryService {

/*    @Retryable：标记当前方法会使用重试机制
    value：重试的触发机制，当遇到Exception异常的时候，会触发重试
    maxAttempts：重试次数（包括第一次调用）
    delay：重试的间隔时间
    multiplier：delay时间的间隔倍数
    maxDelay：重试次数之间的最大时间间隔，默认为0，如果小于delay的设置，则默认为30000L
    @Recover：标记方法为回调方法，传参与@Retryable的value值需一致*/
    @Override
    @Retryable(value = Exception.class, maxAttempts = 3, backoff = @Backoff(delay = 3000, multiplier = 1, maxDelay = 10000))
    public void testRetry() {
        System.out.println("尝试一次");
        int i=3/0;
    }

    //重试maxAttempts次还不成功调用此方法
    @Recover
    public void recover(Exception e) {
        System.out.println("回调方法执行！！！"+e.getMessage());
    }
}
