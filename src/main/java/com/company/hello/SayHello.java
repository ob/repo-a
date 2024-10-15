package com.company.hello;

import com.company.salutations.Salutations;

public class SayHello {
    public static void main(String[] args) {
        // take the name from argv[0], otherwise use "Stranger"
        String name = args.length > 0 ? args[0] : "Stranger";
        System.out.println(Salutations.sayHello(name));
    }
}
