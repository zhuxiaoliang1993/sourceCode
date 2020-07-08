package com.ynet.lombokex;

import lombok.*;

@Getter
@Setter
public class PersonNoNull {
    static String s = "";
    final int id = 10;
    private String userName;
    private String password;
    @NonNull
    private String phone;
    private String email;
    public void sayPhone(@NonNull String phone,@NonNull String userName){
        System.out.println(phone);
        System.out.println(userName);
    }
}
