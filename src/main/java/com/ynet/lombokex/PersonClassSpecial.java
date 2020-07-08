package com.ynet.lombokex;

import lombok.*;

@Getter
@Setter
@ToString
@EqualsAndHashCode(of = {"userName","phone"})
public class PersonClassSpecial {
    static String s = "";
    final int id = 10;
    private String userName;
    private String password;
    private String phone;
    private String email;
}
