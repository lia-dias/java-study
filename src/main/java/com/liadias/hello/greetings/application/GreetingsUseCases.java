package com.liadias.hello.greetings.application;

import com.liadias.hello.greetings.application.dto.UserName;
import com.liadias.hello.greetings.application.entities.ID;
import com.liadias.hello.greetings.application.entities.UserGreet;
import com.liadias.hello.greetings.application.entities.parser.UserGreetNameParser;
import com.liadias.hello.greetings.application.usecases.GreetUserUseCase;
import com.liadias.hello.greetings.application.dto.Greeting;
import com.liadias.hello.greetings.application.entities.parser.UserGreetParser;

public class GreetingsUseCases implements GreetUserUseCase {
    @Override
    public Greeting greetUser(UserName userName) {
        UserGreetParser userGreetParser = new UserGreetNameParser();
        UserGreet userGreet = new UserGreet(ID.generateId(), userName.name());
        return new Greeting(userGreet.getId(), userGreetParser.parse(userGreet));
    }
}
