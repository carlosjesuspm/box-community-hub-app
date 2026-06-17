package com.personal.box_community_hub.box.domain;

import com.personal.box_community_hub.booking.domain.vo.BoxId;
import com.personal.box_community_hub.box.domain.vo.BoxAddress;
import com.personal.box_community_hub.box.domain.vo.BoxContactInfo;
import com.personal.box_community_hub.box.domain.vo.OpeningHours;
import lombok.Builder;
import lombok.Getter;

/**
 * Aggregate root representing a Box in the system.
 *
 * @since 1.0
 */

@Getter
@Builder
public class Box {

    private final BoxId boxId;
    private BoxAddress boxAddress;
    private BoxContactInfo boxContactInfo;
    private OpeningHours boxOpeningHours;

    /**
     * Creates a new {@code Box} with all its value objects.
     *
     * @param boxId           the unique identifier
     * @param boxAddress      the box address
     * @param boxContactInfo  the box info
     * @param boxOpeningHours the box opening hours
     */
    public Box(
            final BoxId boxId,
            final BoxAddress boxAddress,
            final BoxContactInfo boxContactInfo,
            final OpeningHours boxOpeningHours

    ) {
        this.boxId = boxId;
        this.boxAddress = boxAddress;
        this.boxContactInfo = boxContactInfo;
        this.boxOpeningHours = boxOpeningHours;
    }
}
