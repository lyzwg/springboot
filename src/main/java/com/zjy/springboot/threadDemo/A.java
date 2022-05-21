package com.zjy.springboot.threadDemo;

//  created by zjy on 2022/3/9 23:02

public class A {
    public A(){
        System.out.println("A构造方法加载");
    }
    {
        System.out.println("A类代码块");
    }
    static {
        System.out.println("A类静态代码块");
    }
}
class B extends A{
    public B(){
        System.out.println("B构造方法加载");
    }
    {
        System.out.println("B类代码块");
    }
    static {
        System.out.println("B类静态代码块");
    }

    public static void main(String[] args) {
        B b = new B();
    }
}
