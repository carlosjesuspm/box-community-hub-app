package box.domain.repository;

import java.util.List;
import java.util.Optional;
import booking.domain.vo.BoxId;
import box.domain.Box;

/**
 * Repository interface for {@link Box} aggregate root.
 *
 * @since 1.0
 */

public interface BoxRepository {
    
    Box save(Box box);

    Optional<Box> findById(BoxId boxId);

    List<Box> findAll();

}
