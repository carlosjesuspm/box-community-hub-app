package result.domain.vo;

public record ResultTime(int seconds) {

    public ResultTime {
        if (seconds <= 0) {
            throw new IllegalArgumentException("El tiempo debe ser un valor positivo en segundos");
        }
    }
}
