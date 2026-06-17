package com.personal.box_community_hub.booking.domain;

import com.personal.box_community_hub.booking.domain.vo.BookingDate;
import com.personal.box_community_hub.booking.domain.vo.BookingId;
import com.personal.box_community_hub.booking.domain.vo.BookingStatus;
import com.personal.box_community_hub.classSession.domain.vo.ClassSessionId;
import com.personal.box_community_hub.user.domain.vo.UserId;

import lombok.Builder;
import lombok.Getter;


/**
 * Aggregate root representing a Booking in the system.
 *
 * @since 1.0
 */

@Getter
@Builder
public class Booking {

    private final BookingId bookingId;
    private BookingDate bookingDate;
    private BookingStatus bookingStatus;
    private final UserId userId;
    private final ClassSessionId classSessionId;

    /**
     * Creates a new {@code Booking} with all its value objects.
     *
     * @param bookingId      the unique identifier
     * @param bookingDate    the booking date
     * @param bookingStatus  the booking status
     * @param userId         the unique identifier of the user
     * @param classSessionId the unique identifier of the session class
     */
    public Booking(
        final BookingId bookingId,
        final BookingDate bookingDate,
        final BookingStatus bookingStatus,
        final UserId userId,
        final ClassSessionId classSessionId
    ) {
        this.bookingId = bookingId;
        this.bookingDate = bookingDate;
        this.bookingStatus = bookingStatus;
        this.userId = userId;
        this.classSessionId = classSessionId;
    }
}
