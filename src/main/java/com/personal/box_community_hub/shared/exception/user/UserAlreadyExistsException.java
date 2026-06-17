package com.personal.box_community_hub.shared.exception.user;

/**
 * Excepción lanzada cuando se intenta crear un usuario que ya existe.
 */
public class UserAlreadyExistsException extends RuntimeException {

    public UserAlreadyExistsException(String email) {
        super("Ya existe un usuario con el email: " + email);
    }

    public UserAlreadyExistsException(String message, Throwable cause) {
        super(message, cause);
    }
}
