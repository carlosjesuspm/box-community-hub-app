package com.personal.box_community_hub.wod.domain.repository;

import java.util.List;
import java.util.Optional;

import com.personal.box_community_hub.wod.domain.Wod;
import com.personal.box_community_hub.wod.domain.vo.WodId;
import com.personal.box_community_hub.wod.domain.vo.WodTitle;
import com.personal.box_community_hub.wod.domain.vo.WodTytpe;

/**
 * Repository interface for {@link Wod} aggregate root.
 *
 * @since 1.0
 */
public interface WodRepository {

    Wod save(Wod wod);

    Optional<Wod> findById(WodId wodId);

    List<Wod> findByType(WodTytpe type);

    List<Wod> findByTitle(WodTitle wodTitle);

    List<Wod> findAll();

    void delete(Wod wod);
}

