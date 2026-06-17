package com.personal.box_community_hub.auth.domain.vo;

import java.util.regex.Pattern;

public record Username(String username) {

    private static final int MIN_LENGTH = 3;
    private static final int MAX_LENGTH = 50;
    private static final Pattern VALID_PATTERN = Pattern.compile("^[a-zA-Z0-9_-]+$");

    /**
     * Validates that the username is not null/blank, meets length
     * constraints, and contains only alphanumeric characters,
     * underscores, or hyphens.
     *
     * @throws IllegalArgumentException if validation fails
     */
    public Username {
        if (username == null || username.isBlank()) {
            throw new IllegalArgumentException("El nombre de usuario no puede ser nulo o estar vacio");
        }
        if (username.length() < MIN_LENGTH) {
            throw new IllegalArgumentException(
                    "El nombre de usuario debe tener al menos " + MIN_LENGTH + " caracteres"
            );
        }
        if (username.length() > MAX_LENGTH) {
            throw new IllegalArgumentException(
                    "El nombre de usuario no puede exceder los " + MAX_LENGTH + " caracteres"
            );
        }
        if (!VALID_PATTERN.matcher(username).matches()) {
            throw new IllegalArgumentException(
                    "El nombre de usuario solo puede contener letras, numeros, guiones y guiones bajos"
            );
        }
    }
}
