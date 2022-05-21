package com.zjy.springboot.threadDemo;

//  created by zjy on 2022/2/27 23:37

public class InheritableThreadLocalDemo {
    public static void main(String[] args) throws InterruptedException {
        InheritableThreadLocal<String> local = new InheritableThreadLocal<>();
        local.set("111");
        new Thread(()->{
            System.out.println("子线程获取修改前的"+local.get());
            local.set("222");
            System.out.println("子线程获取修改后的"+local.get());
        }).start();
        Thread.sleep(2);
        System.out.println("父线程获取"+local.get());
    }
}
