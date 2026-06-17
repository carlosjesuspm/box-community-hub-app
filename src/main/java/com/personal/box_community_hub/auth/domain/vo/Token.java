package com.personal.box_community_hub.auth.domain.vo;

import java.time.LocalDateTime;

public record Token(String value, LocalDateTime expirationDate) {

    /**
     * Validates that the token value is not null/blank and the expiration
     * date is not null.
     *
     * @throws IllegalArgumentException if validation fails
     */
    public Token {
        if (value == null || value.isBlank()) {
            throw new IllegalArgumentException("El valor del token no puede ser nulo o estar vacío");
        }
        if (expirationDate == null) {
            throw new IllegalArgumentException("La fecha de expiración del token no puede ser nula");
        }
        if (expirationDate.isBefore(LocalDateTime.now())) {
            throw new IllegalArgumentException("La fecha de expiración del token debe ser futura");
        }
    }
}
