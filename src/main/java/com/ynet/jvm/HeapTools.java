package com.ynet.jvm;

/*
 * 演示jps jmap和jconsole工具的使用
 * */
public class HeapTools {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("1......");
        Thread.sleep(60000);
        byte[] array = new byte[1024 * 1024 * 10];//10M
        System.out.println("2....");
        Thread.sleep(60000);
        array = null;
        System.gc();
        System.out.println("3.....");
        Thread.sleep(100000000L);

    }
}
