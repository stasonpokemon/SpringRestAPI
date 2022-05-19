package com.trebnikau.exception_handling;

public class NoSUchEmployeeException extends RuntimeException {

    public NoSUchEmployeeException(String message) {
        super(message);
    }
}
