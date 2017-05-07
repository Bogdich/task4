package com.bogdevich.task4.exception;

/**
 * Created by Adrienne on 24.04.17.
 */
public class TextReaderException extends Exception {
    public TextReaderException() {
    }

    public TextReaderException(String message) {
        super(message);
    }

    public TextReaderException(String message, Throwable cause) {
        super(message, cause);
    }

    public TextReaderException(Throwable cause) {
        super(cause);
    }
}
