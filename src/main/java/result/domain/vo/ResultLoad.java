package result.domain.vo;

public record ResultLoad(double value) {

    public ResultLoad {
        if (value <= 0) {
            throw new IllegalArgumentException("La carga del resultado debe ser un valor positivo");
        }
    }
}
