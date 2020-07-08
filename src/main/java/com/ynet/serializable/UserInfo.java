package com.ynet.serializable;

import java.io.Serializable;

/*
 * 实现Serializable接口的方式序列化
 * 字段password不被反序列化
 * */
public class UserInfo implements Serializable {

    private static final long serialVersionUID = 305352662346335362L;

    private String username;

    private transient String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserInfo(String username, String password) {
        this.username = username;
        this.password = password;
    }
}
