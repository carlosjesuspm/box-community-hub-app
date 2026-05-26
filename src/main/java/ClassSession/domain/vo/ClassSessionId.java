package ClassSession.domain.vo;

import java.util.UUID;

public record ClassSessionId (UUID id) {

    /**
     * Creates a new {@code ClassSessionId} with the given UUID.
     *
     * @throws IllegalArgumentException if {@code id} is null
     */
    public ClassSessionId {
        if (id == null) {
            throw new IllegalArgumentException("El ID de la clase no puede ser nulo");
        }
    }

    /**
     * Creates a new {@code ClassSessionId} with a random UUID.
     *
     * @return a new {@code ClassSessionId}
     */
    public static ClassSessionId generate() {
        return new ClassSessionId(UUID.randomUUID());
    }

}
