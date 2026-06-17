package com.personal.box_community_hub.wod.domain.vo;

import java.util.UUID;

public record WodId(UUID id) {

    public WodId {
        if (id == null) {
            throw new IllegalArgumentException("El ID del WOD no puede ser nulo");
        }
    }

    public static WodId generate() {
        return new WodId(UUID.randomUUID());
    }
}
