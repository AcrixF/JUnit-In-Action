package org.neoa.junit5.ch02.assertions;

public class NoJobException extends RuntimeException {
    NoJobException(String message) {
        super(message);
    }
}
