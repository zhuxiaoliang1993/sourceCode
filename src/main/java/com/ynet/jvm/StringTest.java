package com.ynet.jvm;

public class StringTest {
    public static void main(String[] args) {
        String str1 = "ABC";
        String str2 = new String("ABC");
        String str3 = "ABC";
        System.out.println(str1 == str2);
        System.out.println(str1 == str3);
        System.out.println("str1" + str1.hashCode());
        System.out.println("str2" + str2.hashCode());
    }
}
