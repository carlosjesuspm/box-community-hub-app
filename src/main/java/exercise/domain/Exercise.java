package exercise.domain;

import exercise.domain.vo.ExerciseId;
import exercise.domain.vo.ExerciseLoad;
import lombok.Builder;
import lombok.Getter;

/**
 * Aggregate root representing an Exercise in the system.
 *
 * @since 1.0
 */

@Getter
@Builder
public class Exercise {

    private ExerciseId exerciseId;
    private ExerciseLoad load;

    /**
     * Creates a new {@code Box} with all its value objects.
     *
     * @param exerciseId the unique identifier
     * @param load       the exercise load
     */

    public Exercise(
            final ExerciseId exerciseId,
            final ExerciseLoad load

    ) {
        this.exerciseId = exerciseId;
        this.load = load;
    }

}
