package com.personal.box_community_hub.classSession.domain.vo;

public record ClassSessionCapacity(int capacity, int maxCapacity) {

    /**
     * Validates that both capacity values are positive and that capacity
     * does not exceed maxCapacity.
     *
     * @throws IllegalArgumentException if validation fails
     */
    public ClassSessionCapacity {
        if (capacity <= 0) {
            throw new IllegalArgumentException("La capacidad debe ser un valor positivo");
        }
        if (maxCapacity <= 0) {
            throw new IllegalArgumentException("La capacidad máxima debe ser un valor positivo");
        }
        if (capacity > maxCapacity) {
            throw new IllegalArgumentException(
                    "La capacidad no puede ser mayor que la capacidad máxima"
            );
        }
    }
}
