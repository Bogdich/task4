package com.bogdevich.task4.exception;

/**
 * Created by Adrienne on 24.04.17.
 */
public class ParserException extends Exception {
    public ParserException() {
    }

    public ParserException(String message) {
        super(message);
    }

    public ParserException(String message, Throwable cause) {
        super(message, cause);
    }

    public ParserException(Throwable cause) {
        super(cause);
    }
}
