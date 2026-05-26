package wod.domain;

import exercise.domain.Exercise;
import lombok.Builder;
import lombok.Getter;
import wod.domain.vo.*;

import java.util.List;

@Getter
@Builder
public class Wod {

    private final WodId wodId;
    private final WodTytpe wodTytpe;
    private final WodTitle wodTitle;
    private final WodDescription wodDescription;
    private final List<Exercise> exerciseList;

    public Wod(
            final WodId wodId,
            final WodTytpe wodTytpe,
            final WodTitle wodTitle,
            final WodDescription wodDescription,
            final List<Exercise> exerciseList
    ) {
        this.wodId = wodId;
        this.wodTytpe = wodTytpe;
        this.wodTitle = wodTitle;
        this.wodDescription = wodDescription;
        this.exerciseList = exerciseList;
    }
}
