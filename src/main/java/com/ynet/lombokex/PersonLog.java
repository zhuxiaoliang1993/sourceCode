package com.ynet.lombokex;

import lombok.NonNull;
import lombok.extern.java.Log;
import lombok.val;

import java.util.HashMap;

@Log
public class PersonLog {
    static String s = "";
    final int id = 10;
    private String userName;
    private String password;
    @NonNull
    private String phone;
    private String email;

    public static void Test(String userName) {
        log.info(userName);
    }

    public static void main(String[] args) {
        val hashMap = new HashMap<String,String>();
    }
}
