package membership.domain.vo;

import java.util.Currency;
import java.util.Set;

public record PaymentCurrency(Currency currency) {

    private static final Set<String> SUPPORTED_CURRENCIES = Set.of("USD", "EUR", "MXN", "GBP", "ARS");

    public PaymentCurrency {
        if (currency == null) {
            throw new IllegalArgumentException("La moneda del pago no puede ser nula");
        }
        if (!SUPPORTED_CURRENCIES.contains(currency.getCurrencyCode())) {
            throw new IllegalArgumentException(
                    "Moneda no soportada: " + currency.getCurrencyCode()
                            + ". Monedas soportadas: " + SUPPORTED_CURRENCIES
            );
        }
    }
}
