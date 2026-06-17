package com.personal.box_community_hub.booking.domain.vo;

import java.time.LocalDateTime;

/**
 * Value Object representing a validated booking date.
 * <p>
 * The date must not be null and must be in the future.
 * Seconds and nanos are truncated to avoid granularity inconsistencies.
 * </p>
 *
 * @since 1.0
 */
public record BookingDate(LocalDateTime bookingDate) {

    /**
     * Creates a new {@code BookingDate} after validating the given date time.
     */
    public BookingDate {
        if (bookingDate == null) {
            throw new IllegalArgumentException("La fecha de la reserva no puede ser nula");
        }

        LocalDateTime truncated = bookingDate.withSecond(0).withNano(0);

        if (truncated.isBefore(LocalDateTime.now().withSecond(0).withNano(0))) {
            throw new IllegalArgumentException("La fecha de la reserva debe ser futura");
        }
    }
}
