package booking.domain;

import booking.domain.vo.BookingDate;
import booking.domain.vo.BookingId;
import booking.domain.vo.BookingStatus;
import classSession.domain.vo.ClassSessionId;
import lombok.Builder;
import lombok.Getter;
import user.domain.vo.UserId;

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
