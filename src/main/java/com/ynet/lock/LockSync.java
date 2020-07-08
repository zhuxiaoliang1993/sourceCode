package com.ynet.lock;

import org.openjdk.jol.info.ClassLayout;

public class LockSync {
    static Lock lock = new Lock();

    public static void main(String[] args) {
        /*
         * 锁 -> synchronized
         * 上锁就是改变对象的对象头
         * 什么叫对象头？ java对象的布局 java对象由什么组成 对象在堆上面到底分配多少内存
         * 1.java对象的实例数据 -- 大小不固定
         * 2.对象头 -- 大小固定
         * 3.数据对齐 -- 64位的jvm虚拟机要求大小必须是8的倍数byte向上用空填充
         *
         * 在jvm中，对象在内存中的布局分为三块区域，对象头，实例数据和对齐填充。
         *
         * */
        // 打印对象lock的对象布局
        System.out.println(ClassLayout.parseInstance(lock).toPrintable());
    }
}
