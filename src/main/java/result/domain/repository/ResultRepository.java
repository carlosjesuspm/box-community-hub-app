package result.domain.repository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import result.domain.Result;
import result.domain.vo.ResultId;
import wod.domain.vo.WodId;

/**
 * Repository interface for {@link Result} aggregate root.
 *
 * @since 1.0
 */
public interface ResultRepository {

    Result save(Result result);

    Optional<Result> findById(ResultId resultId);

    List<Result> findByWodId(WodId wodId);

    List<Result> findByDateBetween(LocalDate start, LocalDate end);

    List<Result> findAll();

    void delete(Result result);
}