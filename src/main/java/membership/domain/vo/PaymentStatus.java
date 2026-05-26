package membership.domain.vo;

import java.util.Set;

public record PaymentStatus(String status) {

    private static final Set<String> VALID_STATUSES = Set.of(
            "PENDING", "COMPLETED", "FAILED", "REFUNDED", "CANCELLED"
    );

    public PaymentStatus {
        if (status == null || status.isBlank()) {
            throw new IllegalArgumentException("El estado del pago no puede ser nulo o estar vacío");
        }
        if (!VALID_STATUSES.contains(status.toUpperCase())) {
            throw new IllegalArgumentException(
                    "Estado de pago no válido: " + status
                            + ". Valores permitidos: " + VALID_STATUSES
            );
        }
    }
}
