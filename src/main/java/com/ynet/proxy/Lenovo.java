package com.ynet.proxy;

public class Lenovo implements  SaleComputer {
    @Override
    public String sale(double money) {
        System.out.println("花了"+money+"钱买了一台联想电脑");
        return "联想电脑";
    }

    @Override
    public void show() {
        System.out.println("联想电脑展示");
    }
}
