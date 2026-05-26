package wod.domain.vo;

public record WodDescription(String description) {

    private static final int MAX_LENGTH = 3000;

    public WodDescription {
        if (description == null || description.isBlank()) {
            throw new IllegalArgumentException(
                    "La descripción del WOD no puede ser nula o estar vacía"
            );
        }
        if (description.length() > MAX_LENGTH) {
            throw new IllegalArgumentException(
                    "La descripción del WOD no puede exceder los " + MAX_LENGTH + " caracteres"
            );
        }
    }
}
