package com.ademozalp.jpa_transactional.exception;

public class CustomException extends RuntimeException {
    public CustomException(String message) {
        super(message);
    }
}
