package exercise.domain.vo;

import java.util.UUID;

public record ExerciseId(UUID id) {

    /**
     * Creates a new {@code ExerciseId} with the given UUID.
     *
     * @throws IllegalArgumentException if {@code id} is null
     */
    public ExerciseId {
        if (id == null) {
            throw new IllegalArgumentException("El ID del ejercicio no puede ser nulo");
        }
    }

    /**
     * Creates a new {@code ExerciseId} with a random UUID.
     *
     * @return a new {@code ExerciseId}
     */
    public static ExerciseId generate() {
        return new ExerciseId(UUID.randomUUID());
    }
}
