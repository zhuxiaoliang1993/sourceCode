package com.ynet.jvm;

/*
 * cpu 占用过高
 * */
public class CpuDiagnosisDemo1 {
    public static void main(String[] args) {
        // 线程1
        new Thread(null, () -> {
            System.out.println("1....");
            while (true) {

            }
        }, "thread1").start();

        // 线程2
        new Thread(null, () -> {
            System.out.println("2....");
            try {
                Thread.sleep(10000000L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }, "thread2").start();

        // 线程2
        new Thread(null, () -> {
            System.out.println("3....");
            try {
                Thread.sleep(10000000L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }, "thread3").start();
    }
}
