package auth.domain.vo;

import java.util.UUID;

public record AccountId (UUID id) {

    /**
     * Creates a new {@code AccountId} with the given UUID.
     *
     * @throws IllegalArgumentException if {@code id} is null
     */
    public AccountId {
        if (id == null) {
            throw new IllegalArgumentException("El ID de la cuenta no puede ser nulo");
        }
    }

    /**
     * Creates a new {@code AccountId} with a random UUID.
     *
     * @return a new {@code AccountId}
     */
    public static AccountId generate() {
        return new AccountId(UUID.randomUUID());
    }
}
