package com.epam.mjc;

public class CustomException extends IllegalArgumentException {
    public CustomException(String message) {
        super(message);
    }
}
