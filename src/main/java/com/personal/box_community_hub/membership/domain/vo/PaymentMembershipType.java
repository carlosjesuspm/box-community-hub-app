package com.personal.box_community_hub.membership.domain.vo;

import java.util.Set;

public record PaymentMembershipType(String type) {

    private static final Set<String> VALID_TYPES = Set.of(
            "MONTHLY", "QUARTERLY", "YEARLY", "WEEKLY", "DAILY"
    );

    public PaymentMembershipType {
        if (type == null || type.isBlank()) {
            throw new IllegalArgumentException(
                    "El tipo de membresía del pago no puede ser nulo o estar vacío"
            );
        }
        if (!VALID_TYPES.contains(type.toUpperCase())) {
            throw new IllegalArgumentException(
                    "Tipo de membresia no válido: " + type
                            + ". Valores permitidos: " + VALID_TYPES
            );
        }
    }
}
