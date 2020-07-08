package com.ynet.generic;

/*
 * 含有泛型的接口
 * */
public interface GenericInterface<E> {
    /*
    * 入参为泛型
    * */
    public abstract void add(E e);

    /*
    * 返回类型为泛型
    * */
    public abstract E getType(E e);
}
