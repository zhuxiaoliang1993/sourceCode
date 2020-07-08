package com.ynet.lombokex;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class PersonConstructor {
    static String s = "";
    final int id = 10;
    private String userName;
    private String password;
    private String phone;
    private String email;
}
