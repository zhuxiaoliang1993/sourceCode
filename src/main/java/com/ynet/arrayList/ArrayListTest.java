package com.ynet.arrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("b");
        System.out.println(String.join(",", list));
    }
}
