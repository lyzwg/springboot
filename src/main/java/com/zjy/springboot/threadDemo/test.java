package com.zjy.springboot.threadDemo;

//  created by zjy on 2022/3/10 21:34

import lombok.Getter;
import lombok.SneakyThrows;

public class test {
    @Getter
    static
    class ChangeThread implements Runnable{
        volatile boolean flag=false;
        @Override
        public void run() {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("subThread change flag to:" + flag);
            flag = true;
        }
    }

    @SneakyThrows
    public static void main(String[] args) {

        ChangeThread changeThread = new ChangeThread();
        new Thread(changeThread).start();
        while (true) {
            boolean flag = changeThread.isFlag();
//            unsafe.loadFence(); //加入读内存屏障
            if (flag){
                System.out.println("detected flag changed");
                break;
            }
        }
        System.out.println("main thread end");
//        ExecutorService executorService = Executors.newCachedThreadPool();
//        List<Future<?>> futures = new ArrayList<>();
//        for (int i = 0; i < 10; i++) {
//            int finalI = i;
//            int time = 2000;
//            if (i == 5) {
//                time = 5000;
//            }
//            int finalTime = time;
//            Future<?> submit = executorService.submit(() -> {
//                try {
//                    System.out.println("第" + finalI + "次循环开始");
//                    Thread.sleep(finalTime);
//                    System.out.println("第" + finalI + "次循环结束");
////                    int a = 3 / 0;
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//
//            });
//            futures.add(submit);
//        }
//        System.out.println("任务已全部提交");
//        for (Future<?> future : futures) {
//            future.get();
//        }
//        System.out.println("全部执行完2");
//        executorService.shutdown();
    }

}
