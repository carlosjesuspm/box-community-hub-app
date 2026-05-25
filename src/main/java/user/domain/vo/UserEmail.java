package user.domain.vo;

/**
 * Value Object representing a validated user email address.
 *
 * @since 1.0
 */
public record UserEmail(String email) {

    private static final String EMAIL_REGEX =
            "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@"
                    + "[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";

    /**
     * Creates a new {@code UserEmail} after validating and normalizing the input.
     *
     * @param email the raw email string
     * @throws IllegalArgumentException if {@code email} is null, blank, or does not match the expected format
     */
    public UserEmail(String email) {
        if (email == null || email.isBlank()) {
            throw new IllegalArgumentException("El email no puede estar vacío");
        }

        String normalized = email.trim().toLowerCase();

        if (!normalized.matches(EMAIL_REGEX)) {
            throw new IllegalArgumentException("El formato del email no es válido");
        }

        this.email = normalized;
    }
}
