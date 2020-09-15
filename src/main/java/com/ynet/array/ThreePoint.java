package com.ynet.array;

/**
 * ... 使用演示
 */
public class ThreePoint {

    public void a(String... strings) {
        if (strings.length == 0) {
            System.out.println("000000000");
        } else {
            for (String s :
                    strings) {
                System.out.println(s);
            }
        }
    }

    public static void main(String[] args) {
        ThreePoint t = new ThreePoint();
        System.out.println("******空参开始******");
        t.a();
        System.out.println("******空参结束******");
        System.out.println("******2个参数开始******");
        t.a("a", "b");
        System.out.println("******2个参数结束******");
        System.out.println(Integer.MAX_VALUE);
    }
}
