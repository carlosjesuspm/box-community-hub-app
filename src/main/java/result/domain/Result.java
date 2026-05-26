package result.domain;

import lombok.Builder;
import lombok.Getter;
import result.domain.vo.*;
import wod.domain.vo.WodId;

@Getter
@Builder
public class Result {

    private final ResultId resultId;
    private final WodId wodId;
    private ResultTime time;
    private ResultScore score;
    private ResultRep reps;
    private ResultLoad resultLoad;
    private ResultDate resultDate;

    /**
     * Creates a new {@code Result} with all its value objects.
     *
     * @param resultId   the unique identifier
     * @param wodId      the associated WOD identifier
     * @param time       the result time
     * @param score      the result score
     * @param reps       the number of reps
     * @param resultLoad the load used
     * @param resultDate the date of the result
     */
    public Result(
            final ResultId resultId,
            final WodId wodId,
            final ResultTime time,
            final ResultScore score,
            final ResultRep reps,
            final ResultLoad resultLoad,
            final ResultDate resultDate
    ) {
        this.resultId = resultId;
        this.wodId = wodId;
        this.time = time;
        this.score = score;
        this.reps = reps;
        this.resultLoad = resultLoad;
        this.resultDate = resultDate;
    }
}
