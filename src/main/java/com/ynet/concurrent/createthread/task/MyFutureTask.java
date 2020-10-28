package com.ynet.concurrent.createthread.task;

import java.util.concurrent.Callable;

public class MyFutureTask implements Callable<String> {
    @Override
    public String call() throws Exception {
        Thread.sleep(5000);
        return "Hello";
    }
}
