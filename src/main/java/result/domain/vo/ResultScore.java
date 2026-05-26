package result.domain.vo;

public record ResultScore(double value) {

    public ResultScore {
        if (value <= 0) {
            throw new IllegalArgumentException("La puntuación debe ser un valor positivo");
        }
    }
}
