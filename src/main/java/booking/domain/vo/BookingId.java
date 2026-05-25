package booking.domain.vo;

import java.util.UUID;

public record BookingId(UUID id) {

    /**
     * Creates a new {@code BookingId} with the given UUID.
     *
     * @param id the UUID
     * @throws IllegalArgumentException if {@code id} is null
     */
    public BookingId {
        if (id == null) {
            throw new IllegalArgumentException("El ID de la reserva no puede ser nulo");
        }
    }

    /**
     * Creates a new {@code BookingId} with a random UUID.
     *
     * @return a new {@code BookingId}
     */
    public static BookingId generate() {
        return new BookingId(UUID.randomUUID());
    }
}
