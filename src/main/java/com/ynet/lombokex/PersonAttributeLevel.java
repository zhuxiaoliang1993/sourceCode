package com.ynet.lombokex;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;


public class PersonAttributeLevel {
    @Getter(AccessLevel.MODULE)
    @Setter(AccessLevel.MODULE)
    private String userName;
    @Getter(AccessLevel.NONE)
    @Setter(AccessLevel.NONE)
    private String password;
    @Getter(AccessLevel.PACKAGE)
    @Setter(AccessLevel.PACKAGE)
    private String phone;
    @Getter(AccessLevel.PRIVATE)
    @Setter(AccessLevel.PRIVATE)
    private String email;
}
