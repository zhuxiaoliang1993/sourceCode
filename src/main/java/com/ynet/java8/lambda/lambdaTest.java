package com.ynet.java8.lambda;

import org.junit.Test;

import java.util.Comparator;
import java.util.TreeSet;

/*
 * java8 lamabda
 * */
public class lambdaTest {
    //原来的匿名内部类
    @Test
    public void test1() {
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(o1, o2);
            }
        };
        TreeSet<Integer> treeSet = new TreeSet<>(comparator);
    }

    /*
     * lambda 表达式
     * */
    @Test
    public void test2() {
        Comparator<Integer> comparator = (x, y) -> Integer.compare(x, y);
        TreeSet<Integer> treeSet = new TreeSet<>(comparator);
    }
}
