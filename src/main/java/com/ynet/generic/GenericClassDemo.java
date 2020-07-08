package com.ynet.generic;

import lombok.val;

public class GenericClassDemo {
    public static void main(String[] args) {
        /*
        * 如果此处明确了泛型的类型 传入的字段必须为指定类型，
        * 未指定类型时可以随便传入需要传入的类型
        * */
        // 创建一个泛型为String的Generic类
        val myGenericClass = new GenericClass<String>();
        // 此处传入的值必须为String类型
        myGenericClass.setMvp("88");
        // 打印 myGenericClass 对象的mvp属性
        System.out.println(myGenericClass.getMvp());

        // 创建一个未指定泛型类型的Generic类
        val myGenericClass1 = new GenericClass<>();
        // 此处可传入各种类型
        myGenericClass1.setMvp(666);
        myGenericClass1.setMvp("6666");
    }
}
