package com.liadias.hello.greetings.application.entities;

import java.util.concurrent.atomic.AtomicLong;

/**
 * A value object representing an ID that is an integer greater than 0
 * @param value A long value representing the ID as an integer
 */
public record ID(long value) {
    private static final AtomicLong idCounter = new AtomicLong(1);

    public ID {
        ID.validateID(value);
    }

    private static void validateID(long id) {
        if(id < 1) {
            throw new IllegalArgumentException("Id must be bigger than 0");
        }
    }

    public static long generateId() {
        long currentId = idCounter.getAndIncrement();
        System.out.println("currentId: "+currentId);
        return currentId;
    }
}
