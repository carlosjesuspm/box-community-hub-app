package com.personal.box_community_hub.user.domain.vo;

/**
 * Value Object representing a validated URL to a user photo.
 * <p>
 * Accepts http, https and relative paths, and validates the URL format.
 * </p>
 *
 * @since 1.0
 */
public record UserPhoto(String userPhoto) {

    private static final String URL_REGEX = "^(https?://|/).+\\.[A-Za-z]{2,4}(\\?.*)?$";

    /**
     * Creates a new {@code UserPhoto} after validating the photo URL.
     *
     * @param userPhoto the photo URL
     * @throws IllegalArgumentException if {@code userPhoto} is null, blank or does not match the expected URL format
     */
    public UserPhoto(String userPhoto) {
        if (userPhoto == null || userPhoto.isBlank()) {
            throw new IllegalArgumentException("La URL de la foto no puede estar vacía");
        }

        String trimmed = userPhoto.trim();

        if (!trimmed.matches(URL_REGEX)) {
            throw new IllegalArgumentException("El formato de la URL de la foto no es válido");
        }

        this.userPhoto = trimmed;
    }
}
