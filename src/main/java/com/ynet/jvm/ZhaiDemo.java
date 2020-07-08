package com.ynet.jvm;
/*
* 通过debug模式演示栈中栈帧的压栈与出栈
* */
public class ZhaiDemo {
    public static void main(String[] args) {
        method1();
    }

    public static void method1() {
        method2(1, 2);
    }

    public static int method2(int a, int b) {
        int c = a + b;
        return c;
    }
}
