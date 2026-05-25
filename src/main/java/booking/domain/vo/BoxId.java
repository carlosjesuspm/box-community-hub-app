package booking.domain.vo;

import java.util.UUID;

public record BoxId(UUID id) {

    /**
     * Creates a new {@code BoxId} with the given UUID.
     *
     * @throws IllegalArgumentException if {@code id} is null
     */
    public BoxId {
        if (id == null) {
            throw new IllegalArgumentException("El ID del box no puede ser nulo");
        }
    }

    /**
     * Creates a new {@code BoxId} with a random UUID.
     *
     * @return a new {@code BoxId}
     */
    public static BoxId generate() {
        return new BoxId(UUID.randomUUID());
    }
}
