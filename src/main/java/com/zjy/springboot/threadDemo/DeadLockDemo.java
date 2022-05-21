package com.zjy.springboot.threadDemo;

//  created by zjy on 2022/2/5 20:39

import lombok.SneakyThrows;

import java.util.concurrent.TimeUnit;

public class DeadLockDemo {
    @SneakyThrows
    public static void main(String[] args) {
        Thread A = new Thread(new DeadLock("lockA", "lockB"));
        Thread B = new Thread(new DeadLock("lockB", "lockA"));
        A.start();
//        A.join();   //如果加了此行   A会插队 B只能等A执行完后才会执行 这样就不会死锁
        B.start();
    }
}

class DeadLock implements Runnable{
    String lockA;
    String lockB;

    public DeadLock(String lockA,String lockB){
        this.lockA=lockA;
        this.lockB=lockB;
    }

    @SneakyThrows
    @Override
    public void run() {
        synchronized (lockA){
            System.out.println("获取锁"+lockA+" 尝试获取锁"+lockB+"。。。。");
            TimeUnit.SECONDS.sleep(2);
            synchronized (lockB){
                System.out.println("获取锁"+lockB);
            }
        }
    }
}
