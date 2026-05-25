package box.domain.vo;

import java.time.DayOfWeek;
import java.time.LocalTime;

/**
 * Value Object representing a day's opening hours for a box.
 *
 * @since 1.0
 */
public record OpeningHours(DayOfWeek dayOfWeek, LocalTime openTime, LocalTime closeTime) {

    /**
     * Creates a new {@code OpeningHours} after validating all fields.
     *
     * @param dayOfWeek the day of the week
     * @param openTime  the opening time
     * @param closeTime the closing time
     * @throws IllegalArgumentException if any field is null or openTime is not before closeTime
     */
    public OpeningHours {
        if (dayOfWeek == null) {
            throw new IllegalArgumentException("El día de la semana no puede ser nulo");
        }
        if (openTime == null) {
            throw new IllegalArgumentException("La hora de apertura no puede ser nula");
        }
        if (closeTime == null) {
            throw new IllegalArgumentException("La hora de cierre no puede ser nula");
        }
        if (!openTime.isBefore(closeTime)) {
            throw new IllegalArgumentException("La hora de apertura debe ser anterior a la de cierre");
        }
    }
}
