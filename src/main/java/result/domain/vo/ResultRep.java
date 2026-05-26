package result.domain.vo;

public record ResultRep(int reps) {

    public ResultRep {
        if (reps <= 0) {
            throw new IllegalArgumentException("Las repeticiones deben ser un valor positivo");
        }
    }
}
