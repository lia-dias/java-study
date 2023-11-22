package com.liadias.hello.greetings.application.dto;

public record UserName(String name) {
    public UserName {
        UserName.validate(name);
    }

    public static void validate(String name){
        if(name.isEmpty()) {
            throw new IllegalArgumentException("Name must be not empty");
        }
    }

}
