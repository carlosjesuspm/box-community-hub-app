package wod.domain.vo;

public record WodTitle(String title) {

    private static final int MIN_LENGTH = 3;
    private static final int MAX_LENGTH = 100;

    public WodTitle {
        if (title == null || title.isBlank()) {
            throw new IllegalArgumentException("El titulo del WOD no puede ser nulo o estar vacio");
        }
        if (title.length() < MIN_LENGTH) {
            throw new IllegalArgumentException(
                    "El titulo del WOD debe tener al menos " + MIN_LENGTH + " caracteres"
            );
        }
        if (title.length() > MAX_LENGTH) {
            throw new IllegalArgumentException(
                    "El titulo del WOD no puede exceder los " + MAX_LENGTH + " caracteres"
            );
        }
    }
}
