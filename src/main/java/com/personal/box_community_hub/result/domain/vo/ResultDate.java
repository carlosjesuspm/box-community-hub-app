package com.personal.box_community_hub.result.domain.vo;

import java.time.LocalDate;

public record ResultDate(LocalDate date) {

    public ResultDate {
        if (date == null) {
            throw new IllegalArgumentException("La fecha del resultado no puede ser nula");
        }
        if (date.isAfter(LocalDate.now())) {
            throw new IllegalArgumentException("La fecha del resultado no puede ser futura");
        }
    }
}
