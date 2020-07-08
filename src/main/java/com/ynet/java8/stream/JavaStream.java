package com.ynet.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class JavaStream {

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("ty", "tr", "pp", "op");
        boolean b = strings.stream().anyMatch(str -> "t0".equals(str));
        System.out.println(b);
    }
}
