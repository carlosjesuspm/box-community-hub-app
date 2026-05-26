package facility.domain.vo;


import java.util.UUID;

public record FacilityId (UUID id) {

    /**
     * Creates a new {@code FacilityId} with the given UUID.
     *
     * @throws IllegalArgumentException if {@code id} is null
     */
    public FacilityId {
        if (id == null) {
            throw new IllegalArgumentException("El ID de la instalación no puede ser nulo");
        }
    }

    /**
     * Creates a new {@code FacilityId} with a random UUID.
     *
     * @return a new {@code FacilityId}
     */
    public static FacilityId generate() {
        return new FacilityId(UUID.randomUUID());
    }
}
