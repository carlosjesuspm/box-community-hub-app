package exercise.domain.vo;

import java.util.Set;

public record ExerciseUnit (String unit) {

    private static final Set<String> VALID_UNITS = Set.of(
            "kg", "lbs", "m", "cm", "s", "reps", "cal", "km", "mi", "yd", "ft", "in"
    );

    /**
     * Validates that the unit is not null, not blank, and is a recognized unit.
     *
     * @throws IllegalArgumentException if validation fails
     */
    public ExerciseUnit {
        if (unit == null || unit.isBlank()) {
            throw new IllegalArgumentException("La unidad no puede ser nula o estar vacia");
        }
        if (!VALID_UNITS.contains(unit.toLowerCase())) {
            throw new IllegalArgumentException(
                    "Unidad no valida: " + unit + ". Valores permitidos: " + VALID_UNITS
            );
        }
    }
}
