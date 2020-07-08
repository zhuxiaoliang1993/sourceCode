package com.ynet.lombokex;

import lombok.Getter;
import lombok.Setter;


public class PersonAttribute {
    private String userName;
    private String password;
    @Getter
    @Setter
    private String phone;
    private String email;
}
