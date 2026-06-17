package com.personal.box_community_hub.shared.exception.user;

/**
 * Excepción lanzada cuando los datos del usuario no son válidos.
 */
public class InvalidUserException extends RuntimeException {

    public InvalidUserException(String message) {
        super(message);
    }

    public InvalidUserException(String message, Throwable cause) {
        super(message, cause);
    }
}
