package exercise.domain.vo;

public record ExerciseName(String name) {

    private static final int MIN_LENGTH = 2;
    private static final int MAX_LENGTH = 100;

    public ExerciseName {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("El nombre del ejercicio no puede ser nulo o estar vacío");
        }
        if (name.length() < MIN_LENGTH) {
            throw new IllegalArgumentException(
                    "El nombre del ejercicio debe tener al menos " + MIN_LENGTH + " caracteres"
            );
        }
        if (name.length() > MAX_LENGTH) {
            throw new IllegalArgumentException(
                    "El nombre del ejercicio no puede exceder los " + MAX_LENGTH + " caracteres"
            );
        }
    }
}
