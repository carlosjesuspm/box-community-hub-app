package com.personal.box_community_hub.exercise.domain.repository;

import java.util.List;
import java.util.Optional;

import com.personal.box_community_hub.exercise.domain.Exercise;
import com.personal.box_community_hub.exercise.domain.vo.ExerciseCategory;
import com.personal.box_community_hub.exercise.domain.vo.ExerciseId;
import com.personal.box_community_hub.exercise.domain.vo.ExerciseName;

/**
 * Repository interface for {@link Exercise} aggregate root.
 *
 * @since 1.0
 */
public interface ExerciseRepository {

    Exercise save(Exercise exercise);

    Optional<Exercise> findById(ExerciseId exerciseId);

    Optional<Exercise> findByName(ExerciseName exerciseName);

    List<Exercise> findAll();

    List<Exercise> findByCategory(ExerciseCategory category);

}
