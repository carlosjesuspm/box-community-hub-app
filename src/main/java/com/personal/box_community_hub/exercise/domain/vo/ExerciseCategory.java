package com.personal.box_community_hub.exercise.domain.vo;

import java.util.Set;

public record ExerciseCategory(String category) {

    private static final Set<String> VALID_CATEGORIES = Set.of(
            "STRENGTH", "CARDIO", "GYMNASTICS", "WEIGHTLIFTING", "FLEXIBILITY",
            "ENDURANCE", "PLIOMETRICS", "CALISTHENICS"
    );

    public ExerciseCategory {
        if (category == null || category.isBlank()) {
            throw new IllegalArgumentException("La categoria del ejercicio no puede ser nula o estar vacia");
        }
        if (!VALID_CATEGORIES.contains(category.toUpperCase())) {
            throw new IllegalArgumentException(
                    "Categoria no válida: " + category + ". Valores permitidos: " + VALID_CATEGORIES
            );
        }
    }
}
