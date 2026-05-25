package box.domain.vo;

/**
 * Value Object representing validated box contact information.
 *
 * @since 1.0
 */
public record BoxContactInfo(String boxName, String boxCif, String boxPhone, String boxEmail) {

    private static final String CIF_REGEX =
            "^[ABCDEFGHJKLMNPQRSUVWabcdefghjklmnpqrsuvw]\\d{7}[0-9A-Ja-j]$";
    private static final String PHONE_REGEX =
            "^\\+?\\d{6,15}$";
    private static final String EMAIL_REGEX =
            "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@"
                    + "[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";

    /**
     * Creates a new {@code BoxContactInfo} after validating all fields.
     *
     * @param boxName the box name
     * @param boxCif  the box CIF (Spanish tax id)
     * @param boxPhone the box phone number
     * @param boxEmail the box email address
     * @throws IllegalArgumentException if any field is null, blank or does not match the expected format
     */
    public BoxContactInfo {
        if (boxName == null || boxName.isBlank()) {
            throw new IllegalArgumentException("El nombre del box no puede estar vacío");
        }
        if (boxCif == null || boxCif.isBlank()) {
            throw new IllegalArgumentException("El CIF es obligatorio");
        }
        if (!boxCif.trim().matches(CIF_REGEX)) {
            throw new IllegalArgumentException("El formato del CIF no es válido");
        }
        if (boxPhone == null || boxPhone.isBlank()) {
            throw new IllegalArgumentException("El teléfono es obligatorio");
        }
        if (!boxPhone.trim().matches(PHONE_REGEX)) {
            throw new IllegalArgumentException("El formato del teléfono no es válido");
        }
        if (boxEmail == null || boxEmail.isBlank()) {
            throw new IllegalArgumentException("El email es obligatorio");
        }
        String normalizedEmail = boxEmail.trim().toLowerCase();
        if (!normalizedEmail.matches(EMAIL_REGEX)) {
            throw new IllegalArgumentException("El formato del email no es válido");
        }
        boxName = boxName.trim();
        boxCif = boxCif.trim().toUpperCase();
        boxPhone = boxPhone.trim();
        boxEmail = normalizedEmail;
    }
}
