package com.liadias.hello.greetings.application.usecases;

import com.liadias.hello.greetings.application.dto.Greeting;
import com.liadias.hello.greetings.application.dto.UserName;

public interface GreetUserUseCase {
    public Greeting greetUser(UserName userName);
}
