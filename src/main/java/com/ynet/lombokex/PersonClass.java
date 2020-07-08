package com.ynet.lombokex;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class PersonClass {
    private String userName;
    private String password;
    private String phone;
    private String email;
}
