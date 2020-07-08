package com.ynet.jvm;

import java.util.ArrayList;
import java.util.List;

/*
 * 演示jvisualvm工具的使用
 * 堆内存占用过高案列
 * */
public class HeadBigMemory {
    public static void main(String[] args) throws InterruptedException {
        List<Student> studentList = new ArrayList<>();
        for (int i = 0;
             i < 200; i++) {
            studentList.add(new Student());
        }
        Thread.sleep(100000000L);
    }
}

class Student {
    private byte[] big = new byte[1024 * 1024];
}