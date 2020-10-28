package com.ynet.concurrent.createthread.runtask;

import com.ynet.concurrent.createthread.task.MyFutureTask;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class FutureTaskRun {
    public static void main(String[] args) {
        // 创建异步任务
        FutureTask<String> futureTask = new FutureTask<>(new MyFutureTask());
        // 启动线程
        new Thread(futureTask).start();
        try {
            //等待任务完毕，并返回执行结果
            String s = futureTask.get();
            System.out.println(s);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
