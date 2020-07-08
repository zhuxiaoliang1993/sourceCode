package com.ynet.serializable;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/*
 * 实现Serializable接口的方式序列化
 * 字段password不被反序列化
 * */
public class UserInfoExter implements Externalizable {

    private static final long serialVersionUID = -1894410901224505138L;
    private String username;

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

    private  String password;

    public UserInfoExter(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public UserInfoExter() {
    }

    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject(username);
    }

    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        username = (String) in.readObject();
    }
}
