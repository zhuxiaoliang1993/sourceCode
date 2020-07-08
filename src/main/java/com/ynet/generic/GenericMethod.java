package com.ynet.generic;

/*
* 含有泛型的方法
* */
public class GenericMethod {
    /*
    * 传入参数为泛型的方法
    * */
    public<E> void show(E e){

        System.out.println(e.getClass());
    }

    /*
    * 传入参数和返回均为泛型的方法
    * */
    public<E> E show2(E e){
        return e;
    }

    public static void main(String[] args) {
        GenericMethod genericMethod = new GenericMethod();
        // 输出为 class java.lang.String
        genericMethod.show("朱晓亮");
        genericMethod.show2("hello");
    }
}
