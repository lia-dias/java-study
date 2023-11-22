package com.liadias.hello.greetings.application.entities;

/**
 * A class representation of a greeting to an user, containing the ID of the greet and the name of the user
 */
public class UserGreet {
    private ID id;
    private String name;
    public UserGreet (long id, String name){
        this.id = new ID(id);
        this.name = name;
        UserGreet.validateUserGreet(this);
    }

    private static void validateUserGreet(UserGreet userGreet) {
        if(userGreet.name.isEmpty()) {
            throw new IllegalArgumentException("Name must be not empty");
        }
    }

    public long getId() {
        return this.id.value();
    }

    public String getName() {
        return this.name;
    }


}
