package auth.domain.vo;

public record Password(String hashcode) {

    private static final int MIN_LENGTH = 8;

    /**
     * Validates that the password hashcode is not null, not blank,
     * and meets the minimum length requirement.
     *
     * @throws IllegalArgumentException if validation fails
     */
    public Password {
        if (hashcode == null || hashcode.isBlank()) {
            throw new IllegalArgumentException("La contrasena no puede ser nula o estar vacia");
        }
        if (hashcode.length() < MIN_LENGTH) {
            throw new IllegalArgumentException(
                    "La contrasena debe tener al menos " + MIN_LENGTH + " caracteres"
            );
        }
    }
}
