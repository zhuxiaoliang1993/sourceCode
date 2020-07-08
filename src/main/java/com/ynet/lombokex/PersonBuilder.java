package com.ynet.lombokex;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

@Data
@Builder
public class PersonBuilder {
    static String s = "";
    final int id = 10;
    private String userName;
    private String password;
    @NonNull
    private String phone;
    private String email;

    public static void main(String[] args) {
        PersonBuilderBuilder personBuilderBuilder = PersonBuilder.builder().userName("1").password("2").phone("3").email("4");
        System.out.println(personBuilderBuilder.toString());
    }
}
