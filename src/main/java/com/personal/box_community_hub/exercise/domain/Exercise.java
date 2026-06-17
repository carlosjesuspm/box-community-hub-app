package com.personal.box_community_hub.exercise.domain;

import com.personal.box_community_hub.exercise.domain.vo.*;
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

    private final ExerciseId exerciseId;
    private final ExerciseName exerciseName;
    private final ExerciseLoad load;
    private final ExerciseCategory exerciseCategory;
    private final ExerciseDescription exerciseDescription;

    /**
     * Creates a new {@code Exercise} with all its value objects.
     *
     * @param exerciseId         the unique identifier
     * @param exerciseName       the name of the exercise
     * @param load               the exercise load
     * @param exerciseCategory   the category of the exercise
     * @param exerciseDescription the description of the exercise
     */
    public Exercise(
            final ExerciseId exerciseId,
            final ExerciseName exerciseName,
            final ExerciseLoad load,
            final ExerciseCategory exerciseCategory,
            final ExerciseDescription exerciseDescription
    ) {
        this.exerciseId = exerciseId;
        this.exerciseName = exerciseName;
        this.load = load;
        this.exerciseCategory = exerciseCategory;
        this.exerciseDescription = exerciseDescription;
    }

}
