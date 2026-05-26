package user.domain.vo;

import java.util.UUID;

/**
 * Value Object representing a unique user identifier.
 *
 * @since 1.0
 */
public record UserId(UUID id) {

    /**
     * Creates a new {@code UserId} with the given UUID.
     *
     * @param id the UUID
     * @throws IllegalArgumentException if {@code id} is null
     */
    public UserId(UUID id) {
        if (id == null) {
            throw new IllegalArgumentException("El ID de usuario no puede ser nulo");
        }
        this.id = id;
    }

    /**
     * Creates a new {@code UserId} with a random UUID.
     *
     * @return a new {@code UserId}
     */
    public static UserId generate() {
        return new UserId(UUID.randomUUID());
    }
}
