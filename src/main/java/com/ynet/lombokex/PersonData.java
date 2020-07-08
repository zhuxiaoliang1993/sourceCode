package com.ynet.lombokex;

import lombok.Data;

@Data
public class PersonData {
    static String s = "";
    private String userName;
    private String password;
    private String phone;
    private String email;
}
