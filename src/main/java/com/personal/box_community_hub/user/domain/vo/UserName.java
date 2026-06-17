package com.personal.box_community_hub.user.domain.vo;


/**
 * Value Object representing a validated user name composed of a display name, first name and last name.
 *
 * @since 1.0
 */
public record UserName (String name, String firstName, String lastName) {

    

    /**
     * Creates a new {@code UserName} after validating and normalizing the fields.
     *
     * @param name      the display name
     * @param firstName the first name
     * @param lastName  the last name
     * @throws IllegalArgumentException if any field is null or blank
     */
    public UserName(String name, String firstName, String lastName) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("El nombre de usuario no puede estar vacío");
        }
        if (firstName == null || firstName.isBlank()) {
            throw new IllegalArgumentException("El nombre no puede estar vacío");
        }
        if (lastName == null || lastName.isBlank()) {
            throw new IllegalArgumentException("El apellido no puede estar vacío");
        }
        this.name = name.trim();
        this.firstName = firstName.trim();
        this.lastName = lastName.trim();
    }
}
