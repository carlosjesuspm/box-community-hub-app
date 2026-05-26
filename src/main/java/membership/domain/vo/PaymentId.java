package membership.domain.vo;

import java.util.UUID;

public record PaymentId(UUID id) {

    public PaymentId {
        if (id == null) {
            throw new IllegalArgumentException("El ID del pago no puede ser nulo");
        }
    }

    public static PaymentId generate() {
        return new PaymentId(UUID.randomUUID());
    }
}
