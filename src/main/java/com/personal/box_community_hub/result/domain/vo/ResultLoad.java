package com.personal.box_community_hub.result.domain.vo;

public record ResultLoad(double value) {

    public ResultLoad {
        if (value <= 0) {
            throw new IllegalArgumentException("La carga del resultado debe ser un valor positivo");
        }
    }
}
