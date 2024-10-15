package com.company.salutations;

import com.company.greeter.Greeter;

public class Salutations {
    public static String sayHello(String name) {
        // wrap greeter in a salutation but with more emojis
        return Greeter.sayHello(name) + " 😊👋";

    }
}
