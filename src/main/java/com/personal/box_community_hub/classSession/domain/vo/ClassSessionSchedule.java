package com.personal.box_community_hub.classSession.domain.vo;

import java.time.LocalDate;
import java.time.LocalTime;

public record ClassSessionSchedule(LocalDate date, LocalTime startTime) {

    /**
     * Validates that the date and start time are not null, and that the
     * date is not in the past.
     *
     * @throws IllegalArgumentException if validation fails
     */
    public ClassSessionSchedule {
        if (date == null) {
            throw new IllegalArgumentException("La fecha de la clase no puede ser nula");
        }
        if (startTime == null) {
            throw new IllegalArgumentException("La hora de inicio de la clase no puede ser nula");
        }
        if (date.isBefore(LocalDate.now())) {
            throw new IllegalArgumentException("La fecha de la clase no puede estar en el pasado");
        }
    }
}
