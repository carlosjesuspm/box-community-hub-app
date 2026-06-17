package com.personal.box_community_hub.facility.domain.repository;

import java.util.List;
import java.util.Optional;

import com.personal.box_community_hub.facility.domain.Facility;
import com.personal.box_community_hub.facility.domain.vo.FacilityId;
import com.personal.box_community_hub.facility.domain.vo.FacilityType;

/**
 * Repository interface for {@link Facility} aggregate root.
 *
 * @since 1.0
 */
public interface FacilityRepository {

    Facility save(Facility facility);

    Optional<Facility> findById(FacilityId facilityId);

    List<Facility> findByType(FacilityType type);

    List<Facility> findAll();
}
