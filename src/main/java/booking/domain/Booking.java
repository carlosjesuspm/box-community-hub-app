package booking.domain;

import booking.domain.vo.BookingDate;
import booking.domain.vo.BookingId;
import booking.domain.vo.BookingStatus;
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

        /**
     * Creates a new {@code Booking} with all its value objects.
     *
     * @param bookingId     the unique identifier
     * @param bookingDate   the booking date
     * @param bookingStatus the booking status
     */
    public Booking(
        final BookingId bookingId,
        final BookingDate bookingDate,
        final BookingStatus bookingStatus
    ) {
        this.bookingId = bookingId;
        this.bookingDate = bookingDate;
        this.bookingStatus = bookingStatus;
    }
}
