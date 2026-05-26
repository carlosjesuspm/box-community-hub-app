package membership.domain.vo;

import java.math.BigDecimal;

public record PaymentMoney(BigDecimal amount) {

    public PaymentMoney {
        if (amount == null) {
            throw new IllegalArgumentException("El monto del pago no puede ser nulo");
        }
        if (amount.compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalArgumentException("El monto del pago debe ser un valor positivo");
        }
    }
}
