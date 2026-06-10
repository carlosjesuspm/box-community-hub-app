package exercise.domain.repository;

import java.util.List;
import java.util.Optional;

import exercise.domain.Exercise;
import exercise.domain.vo.ExerciseCategory;
import exercise.domain.vo.ExerciseId;
import exercise.domain.vo.ExerciseName;

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
