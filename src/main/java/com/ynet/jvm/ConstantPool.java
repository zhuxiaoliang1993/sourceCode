package com.ynet.jvm;
/*
 * 常量池演示
 * 1Byte = 8bit
 * */

public class ConstantPool {
    public static void main(String[] args) {
        System.out.println("hello word");
        String s1 = "a";
        byte[] bytes = s1.getBytes();
        for (byte aByte :
                bytes) {
            int aByte1 = aByte;
            System.out.println(aByte1);
            String s = Integer.toBinaryString(aByte1);
            System.out.println(s);
        }
        System.out.println(bytes.length);
        
    }
}
