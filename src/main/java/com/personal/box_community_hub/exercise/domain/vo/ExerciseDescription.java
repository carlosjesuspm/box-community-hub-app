package com.personal.box_community_hub.exercise.domain.vo;

public record ExerciseDescription(String description) {

    private static final int MAX_LENGTH = 3000;

    public ExerciseDescription {
        if (description == null || description.isBlank()) {
            throw new IllegalArgumentException(
                    "La descripción del ejercicio no puede ser nula o estar vacía"
            );
        }
        if (description.length() > MAX_LENGTH) {
            throw new IllegalArgumentException(
                    "La descripción del ejercicio no puede exceder los " + MAX_LENGTH + " caracteres"
            );
        }
    }
}
