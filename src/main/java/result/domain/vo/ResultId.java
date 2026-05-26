package result.domain.vo;

import java.util.UUID;

public record ResultId(UUID id) {

    public ResultId {
        if (id == null) {
            throw new IllegalArgumentException("El ID del resultado no puede ser nulo");
        }
    }

    public static ResultId generate() {
        return new ResultId(UUID.randomUUID());
    }
}
