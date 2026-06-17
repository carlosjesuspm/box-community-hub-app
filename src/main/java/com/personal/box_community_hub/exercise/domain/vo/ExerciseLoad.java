package com.personal.box_community_hub.exercise.domain.vo;

public record ExerciseLoad (double value, ExerciseUnit unit) {

    /**
     * Validates that value is positive and unit is not null.
     *
     * @throws IllegalArgumentException if validation fails
     */
    public ExerciseLoad {
        if (value <= 0) {
            throw new IllegalArgumentException("La carga debe ser un valor positivo");
        }
        if (unit == null) {
            throw new IllegalArgumentException("La unidad de la carga no puede ser nula");
        }
    }
}
