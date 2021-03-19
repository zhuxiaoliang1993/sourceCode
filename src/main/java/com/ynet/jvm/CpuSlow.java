package com.ynet.jvm;

/*
 * 死锁诊断演示
 * */
class A {
}

class B {

}

public class CpuSlow {
    static A a = new A();
    static B b = new B();

    public static void main(String[] args) throws InterruptedException {
        new Thread(() -> {
            synchronized (a) {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (b) {
                    System.out.println("获得a和b");
                }
            }
        }).start();
        Thread.sleep(1000);
        new Thread(() -> {
            synchronized (b) {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {  
                    e.printStackTrace();
                }
                synchronized (a) {
                    System.out.println("获得b和a");
                }
            }
        }).start();

    }
}
