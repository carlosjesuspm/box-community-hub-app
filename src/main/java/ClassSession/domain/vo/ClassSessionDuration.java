package classSession.domain.vo;

public record ClassSessionDuration(int duration) {

    private static final int MIN_DURATION = 30;
    private static final int MAX_DURATION = 120;

    /**
     * Validates that the duration is within the allowed range (30–120 minutes).
     *
     * @throws IllegalArgumentException if validation fails
     */
    public ClassSessionDuration {
        if (duration < MIN_DURATION) {
            throw new IllegalArgumentException(
                    "La duración debe ser al menos " + MIN_DURATION + " minuto"
            );
        }
        if (duration > MAX_DURATION) {
            throw new IllegalArgumentException(
                    "La duracion no puede exceder los " + MAX_DURATION + " minutos"
            );
        }
    }
}
