package com.ynet.jvm;

/*
 * 栈内存溢出示例
 * 通过-Xss参数设置栈内存大小为256k  -Xss256k
 * */
public class StackOutDemo {
    public static int count;

    public static void main(String[] args) {
        try {
            method();
        } catch (Throwable e) {
            e.printStackTrace();
            System.out.println(count);
        }
    }

    public static void method() {
        count++;
        method();
    }
}
