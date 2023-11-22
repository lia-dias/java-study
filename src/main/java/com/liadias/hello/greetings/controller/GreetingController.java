package com.liadias.hello.greetings.controller;

import com.liadias.hello.greetings.application.GreetingsUseCases;
import com.liadias.hello.greetings.application.dto.Greeting;
import com.liadias.hello.greetings.application.dto.UserName;
import com.liadias.hello.greetings.application.usecases.GreetUserUseCase;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
    private GreetUserUseCase greetUserUC = new GreetingsUseCases();

    @GetMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        UserName userName = new UserName(name);
        return this.greetUserUC.greetUser(userName);
    }
}
