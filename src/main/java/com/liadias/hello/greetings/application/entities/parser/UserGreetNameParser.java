package com.liadias.hello.greetings.application.entities.parser;

import com.liadias.hello.greetings.application.entities.UserGreet;

public class UserGreetNameParser implements UserGreetParser{
    @Override
    public String parse(UserGreet userGreet) {
        String greet = "Hello, " + userGreet.getName() + "!";
        return greet;
    }
}
