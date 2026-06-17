package com.personal.box_community_hub.wod.domain.vo;

import java.util.Set;

public record WodTytpe(String type) {

    private static final Set<String> VALID_TYPES = Set.of(
            "AMRAP", "FOR_TIME", "EMOM", "RFT", "TABATA", "CHIPPER", "LADDER"
    );

    public WodTytpe {
        if (type == null || type.isBlank()) {
            throw new IllegalArgumentException("El tipo de WOD no puede ser nulo o estar vacio");
        }
        if (!VALID_TYPES.contains(type.toUpperCase())) {
            throw new IllegalArgumentException(
                    "Tipo de WOD no valido: " + type + ". Valores permitidos: " + VALID_TYPES
            );
        }
    }
}
