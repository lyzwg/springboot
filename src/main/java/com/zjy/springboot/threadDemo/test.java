package com.zjy.springboot.threadDemo;

//  created by zjy on 2022/3/10 21:34

import lombok.SneakyThrows;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class test {
    @SneakyThrows
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        List<Future<?>> futures = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int finalI = i;
            int time = 2000;
            if (i == 5) {
                time = 5000;
            }
            int finalTime = time;
            Future<?> submit = executorService.submit(() -> {
                try {
                    System.out.println("第" + finalI + "次循环开始");
                    Thread.sleep(finalTime);
                    System.out.println("第" + finalI + "次循环结束");
//                    int a = 3 / 0;
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            });
            futures.add(submit);
        }
        System.out.println("任务已全部提交");
        for (Future<?> future : futures) {
            future.get();
        }
        System.out.println("全部执行完2");
        executorService.shutdown();
    }

}
