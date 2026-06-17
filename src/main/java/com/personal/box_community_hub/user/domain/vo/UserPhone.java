package com.personal.box_community_hub.user.domain.vo;

/**
 * Value Object representing a validated phone number with prefix.
 *
 * @since 1.0
 */
public record UserPhone(String prefix, String phoneNumber) {

    private static final String PREFIX_REGEX = "^\\+\\d{1,3}$";
    private static final String PHONE_REGEX = "^\\d{6,15}$";

    /**
     * Creates a new {@code UserPhone} after validating prefix and phoneNumber.
     *
     * @param prefix      the country or area prefix, e.g. +34
     * @param phoneNumber the phone number digits only
     * @throws IllegalArgumentException if any field is null/blank or does not match the expected format
     */
    public UserPhone(String prefix, String phoneNumber) {
        if (prefix == null || prefix.isBlank()) {
            throw new IllegalArgumentException("El prefijo no puede estar vacío");
        }
        if (phoneNumber == null || phoneNumber.isBlank()) {
            throw new IllegalArgumentException("El número de teléfono no puede estar vacío");
        }

        String trimmedPrefix = prefix.trim();
        String trimmedNumber = phoneNumber.trim();

        if (!trimmedPrefix.matches(PREFIX_REGEX)) {
            throw new IllegalArgumentException("El formato del prefijo no es válido (ej. +34)");
        }
        if (!trimmedNumber.matches(PHONE_REGEX)) {
            throw new IllegalArgumentException("El número de teléfono debe contener entre 6 y 15 dígitos");
        }

        this.prefix = trimmedPrefix;
        this.phoneNumber = trimmedNumber;
    }
}
