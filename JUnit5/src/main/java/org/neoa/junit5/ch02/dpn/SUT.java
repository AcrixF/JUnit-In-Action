package org.neoa.junit5.ch02.dpn;

public class SUT {

    public static final String HELLO = "Hello";
    public static final String BYE = "Bye";
    public static final String HOW_ARE_YOU = "How are you?";

    String hello() {
        return HELLO;
    }

    String bye() {
        return BYE;
    }

    String talk() {
        return HOW_ARE_YOU;
    }
}
