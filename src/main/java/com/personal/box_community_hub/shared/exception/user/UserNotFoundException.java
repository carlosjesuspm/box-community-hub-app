package com.personal.box_community_hub.shared.exception.user;

import java.util.UUID;

/**
 * Excepción lanzada cuando no se encuentra un usuario en el sistema.
 */
public class UserNotFoundException extends RuntimeException {

    public UserNotFoundException(UUID id) {
        super("Usuario no encontrado con ID: " + id);
    }

    public UserNotFoundException(String email) {
        super("Usuario no encontrado con email: " + email);
    }

    public UserNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
