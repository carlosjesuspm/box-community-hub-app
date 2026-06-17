package com.personal.box_community_hub.box.domain.repository;

import java.util.List;
import java.util.Optional;
import com.personal.box_community_hub.booking.domain.vo.BoxId;
import com.personal.box_community_hub.box.domain.Box;

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
