package com.ynet.classload;

public class LoadClass {
    public static void main(String[] args) {
        try {
            Class.forName("com.ynet.classload.Cat");
            Cat cat = new Cat();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
