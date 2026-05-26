package facility.domain;

import booking.domain.vo.BoxId;
import facility.domain.vo.FacilityCapacity;
import facility.domain.vo.FacilityId;
import facility.domain.vo.FacilityType;
import lombok.Builder;
import lombok.Getter;

/**
 * Aggregate root representing a Facility  in the system.
 *
 * @since 1.0
 */

@Getter
@Builder
public class Facility {

    private FacilityId facilityId;
    private final BoxId boxId;
    private FacilityType facilityType;
    private FacilityCapacity facilityCapacity;

    /**
     * Creates a new {@code Facility} with all its value objects.
     *
     * @param facilityId        the unique identifier
     * @param boxId             the box unique identifier
     * @param facilityType      the type of the facility
     * @param facilityCapacity  the capacity of the facility
     */
    public Facility(
            final FacilityId facilityId,
            final BoxId boxId,
            final FacilityType facilityType,
            final FacilityCapacity facilityCapacity

    ) {
        this.facilityId = facilityId;
        this.boxId = boxId;
        this.facilityType = facilityType;
        this.facilityCapacity = facilityCapacity;
    }
}
