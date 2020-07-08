package com.ynet.generic;

import lombok.val;

/*
* 定义类时确定泛型的类型
* */
public class GenericInterfaceImpl implements  GenericInterface<String> {

    @Override
    public void add(String s) {
        System.out.println(s);
    }

    @Override
    public String getType(String s) {
        System.out.println("子类方法");
        return s;
    }

    public static void main(String[] args) {
        GenericInterface face = new  GenericInterfaceImpl();
        face.add("1111");
        Object type = face.getType("444t");
        System.out.println(type);
    }
}
